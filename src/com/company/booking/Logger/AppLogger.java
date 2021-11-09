{\rtf1\ansi\ansicpg1251\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 package com.company.booking.Logger;\
\
import java.io.IOException;\
import java.text.SimpleDateFormat;\
import java.time.LocalDateTime;\
import java.time.ZoneId;\
import java.time.format.DateTimeFormatter;\
import java.util.logging.*;\
\
import static com.company.booking.Constant.DataUtil.DATE_TIME_FORMAT;\
import static com.company.booking.Constant.DataUtil.TIME_ZONE;\
import static com.company.booking.Constant.FileUtil.LOG_FILEPATH_APP;\
\
public class AppLogger \{\
    static private FileHandler fileTxt;\
    static private SimpleFormatter formatterTxt;\
    static public Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);\
\
    static public void setup() throws IOException \{\
//        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);\
\
        logger.setLevel(Level.ALL);\
        fileTxt = new FileHandler(LOG_FILEPATH_APP);\
\
        formatterTxt = new SimpleFormatter();\
        fileTxt.setFormatter(new Formatter() \{\
            @Override\
            public String format(LogRecord record) \{\
                return LocalDateTime.now(ZoneId.of(TIME_ZONE))\
                        .format(DateTimeFormatter\
                                .ofPattern(DATE_TIME_FORMAT))\
                        + " "\
                        + record.getLevel() + " || "\
                        + record.getSourceClassName().substring(\
                        record.getSourceClassName().lastIndexOf(".") + 1,\
                        record.getSourceClassName().length())\
                        + "."\
                        + record.getSourceMethodName()\
                        + "() : "\
                        + record.getMessage() + "\\n";\
            \}\
        \});\
        logger.addHandler(fileTxt);\
        logger.setUseParentHandlers(false);\
    \}\
\}\
}