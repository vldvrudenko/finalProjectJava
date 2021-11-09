{\rtf1\ansi\ansicpg1251\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 package com.company.booking.DAO;\
\
import java.util.List;\
\
public interface DAO<T> \{\
\
    void save(T item);\
    T get(int index);\
    List<T> getAll();\
    boolean remove(int index);\
    boolean remove(T item);\
\
    void saveData(String filePath);\
    void readData(String filePath);\
    void loadData(List<T> list);\
\
\}\
}