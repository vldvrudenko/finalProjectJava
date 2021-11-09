{\rtf1\ansi\ansicpg1251\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 package com.company.booking.Booking;\
\
import com.company.booking.Constant.RoleType;\
import com.company.booking.Constant.DataUtil;\
import com.company.booking.Constant.RoleType;\
import com.company.booking.Constant.Sex;\
\
import java.io.Serializable;\
\
import static com.company.booking.Constant.ComUtil.dateLongToString;\
\
public class Customer extends Person implements DataUtil, Serializable \{\
    private int cust_ID;\
    private String loginName;\
    private String password;\
    private boolean isVIP = false;\
    private RoleType role = RoleType.GUEST;\
\
    private static int count = 0;\
\
    \{\
        this.cust_ID = ++count;\
    \}\
\
    public String getLoginName() \{\
        return loginName;\
    \}\
\
    public String getPassword() \{\
        return password;\
    \}\
\
    public void setPassword(String password) \{\
        this.password = password;\
    \}\
\
    public boolean isVIP() \{\
        return isVIP;\
    \}\
\
    public void setVIP(boolean VIP) \{\
        isVIP = VIP;\
    \}\
\
    public RoleType getRole() \{\
        return role;\
    \}\
\
    public void setRole(RoleType role) \{\
        this.role = role;\
    \}\
\
    public Customer(String name, String surname, long birthDate, Sex sex, String loginName, String password) \{\
        super(name, surname, birthDate, sex);\
        this.loginName = loginName;\
        this.password = password;\
        this.role = RoleType.USER;\
    \}\
\
    @Override\
    public String toString() \{\
        return "Customer\{" +\
                "role=" + getRole() + '\\'' +\
                ", loginName='" + loginName + '\\'' +\
                ", password='" + password + '\\'' +\
                ", name='" + super.getName() + '\\'' +\
                ", surname='" + super.getSurname() + '\\'' +\
                ", birthDate=" + dateLongToString(super.getBirthDate(), DataUtil.DATE_FORMAT) +\
                ", sex=" + super.getSex() +\
                ", isVIP=" + isVIP +\
                "\}";\
    \}\
\}\
}