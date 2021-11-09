{\rtf1\ansi\ansicpg1251\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 package com.company.booking.Booking;\
\
import com.company.booking.Constant.DataUtil;\
import com.company.booking.Constant.Sex;\
\
import java.io.Serializable;\
\
import static com.company.booking.Constant.ComUtil.dateLongToString;\
\
public class Passenger extends Person implements Serializable \{\
    private int pass_ID;\
    private String passportNumber;\
\
    private static int count = 0;\
\
    \{\
        this.pass_ID = ++count;\
    \}\
\
    public int getPass_ID() \{\
        return pass_ID;\
    \}\
\
    public String getPassportNumber() \{\
        return passportNumber;\
    \}\
\
    public Passenger(String name, String surname, Long birthDate, Sex sex, String passportNumber) \{\
        super(name, surname, birthDate, sex);\
        this.passportNumber = passportNumber;\
    \}\
\
    @Override\
    public String toString() \{\
        return "Passenger\{" +\
                "pass_ID=" + pass_ID +\
                ", name=\\'" + super.getName() + "\\'" +\
                ", surname=\\'" + super.getSurname() + "\\'" +\
                ", birthDate=" + dateLongToString(super.getBirthDate(), DataUtil.DATE_FORMAT) +\
                ", sex=" + super.getSex() +\
                ", passportNumber=\\'" + passportNumber + "\\'" +\
                "\}";\
    \}\
\}\
}