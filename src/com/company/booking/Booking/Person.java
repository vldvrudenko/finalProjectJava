{\rtf1\ansi\ansicpg1251\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 package com.company.booking.Booking;\
\
import com.company.booking.Constant.*;\
\
import java.io.Serializable;\
import java.util.Objects;\
\
import static com.company.booking.Constant.ComUtil.dateLongToString;\
\
\
public abstract class Person implements Serializable \{\
    private String name;\
    private String surname;\
    private Long birthDate;\
    private Sex sex;\
\
    public String getName() \{\
        return name;\
    \}\
\
    public String getSurname() \{\
        return surname;\
    \}\
\
    public Long getBirthDate() \{\
        return birthDate;\
    \}\
\
    public Sex getSex() \{\
        return sex;\
    \}\
\
    public Person(String name, String surname, Long birthDate, Sex sex) \{\
        this.name = name;\
        this.surname = surname;\
        this.birthDate = birthDate;\
        this.sex = sex;\
    \}\
\
    @Override\
    public boolean equals(Object o) \{\
        if (this == o) return true;\
        if (o == null || getClass() != o.getClass()) return false;\
        Person person = (Person) o;\
        return name.equals(person.getName()) &&\
                surname.equals(person.getSurname()) &&\
                birthDate.equals(person.getBirthDate()) &&\
                sex == person.getSex();\
    \}\
\
    @Override\
    public int hashCode() \{\
\
        int result = 11;\
        int coef = 31;\
        result = coef * result + name.hashCode();\
        result = coef * result + surname.hashCode();\
        result = coef * result + sex.hashCode();\
        result = coef * result + (int) (birthDate/60000);\
        return result;\
\
    \}\
\
    @Override\
    public String toString() \{\
        return "Person\{" +\
                "name='" + name + '\\'' +\
                ", surname='" + surname + '\\'' +\
                ", birthDate=" + dateLongToString(birthDate, DataUtil.DATE_FORMAT) +\
                ", sex=" + sex +\
                '\}';\
    \}\
\}\
}