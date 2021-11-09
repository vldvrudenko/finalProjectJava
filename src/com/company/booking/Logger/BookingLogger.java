{\rtf1\ansi\ansicpg1251\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 package com.company.booking.Logger;\
\
import com.company.booking.Constant.DataUtil;\
import com.company.booking.Constant.FileUtil;\
\
import java.io.BufferedWriter;\
import java.io.File;\
import java.io.FileWriter;\
import java.io.IOException;\
import java.time.LocalDateTime;\
import java.time.format.DateTimeFormatter;\
\
\
public class BookingLogger implements DataUtil, FileUtil \{\
\
    private String logMessage;\
    private String logFilePath;\
\
    public BookingLogger() \{\
\
        logFilePath = LOG_FILEPATH_BOOKING;\
\
    \}\
\
    public void info(String message) \{\
\
        logMessage = getLocalDateTime() + " [DEBUG] " + message;\
        appendToLogFile(logMessage);\
\
    \}\
\
    public void error(String message) \{\
\
        logMessage = getLocalDateTime() + " [ERROR] " + message;\
        appendToLogFile(logMessage);\
\
    \}\
\
    private String getLocalDateTime() \{\
\
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_TIME_FORMAT));\
\
    \}\
\
    private void appendToLogFile(String message) \{\
\
        BufferedWriter bw = null;\
        FileWriter fw = null;\
\
        try \{\
\
            File file = new File(logFilePath);\
\
            file.getParentFile().mkdirs();\
\
            // if file doesnt exists, then create it\
            if (!file.exists()) \{\
                file.createNewFile();\
            \}\
\
            fw = new FileWriter(file.getAbsoluteFile(), true); // true = append file\
            bw = new BufferedWriter(fw);\
\
            bw.newLine();\
            bw.write(message);\
\
        \} catch (IOException e) \{\
\
            e.printStackTrace();\
\
        \} finally \{\
\
            try \{\
\
                if (bw != null)\
                    bw.close();\
\
                if (fw != null)\
                    fw.close();\
\
            \} catch (IOException e) \{\
\
                e.printStackTrace();\
\
            \}\
        \}\
\
    \}\
\
\}}