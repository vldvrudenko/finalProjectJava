{\rtf1\ansi\ansicpg1251\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 package com.company.booking.Service;\
\
import com.company.booking.Booking.Booking;\
import com.company.booking.DAO.CollectionBookingDAO;\
import com.company.booking.DAO.BookingDAO;\
\
import java.util.List;\
\
public class BookingService \{\
\
    private BookingDAO bookingDao = new CollectionBookingDAO();\
\
    public BookingDAO getBookingDao() \{\
        return bookingDao;\
    \}\
\
    public List<Booking> getAllBookings() \{\
        return bookingDao.getAllBookings();\
    \}\
\
    public void displayAllBookings() \{\
\
        bookingDao.getAllBookings().forEach(System.out::println);\
\
    \}\
\
    public void saveBooking(Booking booking) \{\
\
        bookingDao.saveBooking(booking);\
\
    \}\
\
    public void saveData(String filePath) \{\
\
        bookingDao.saveData(filePath);\
\
    \}\
\
    public void readData(String filePath) \{\
\
        bookingDao.readData(filePath);\
\
    \}\
\
    public void deleteBookingByIndex(int index) \{\
\
        bookingDao.deleteBooking(index);\
\
    \}\
\
    public void deleteBookingByObject(Booking booking) \{\
\
        bookingDao.deleteBooking(booking);\
\
    \}\
\
    public int count() \{\
\
        return bookingDao.getAllBookings().size();\
\
    \}\
\
    public Booking getBookingById(int index) \{\
\
        if (index >= 0 && index < bookingDao.getAllBookings().size()) \{\
\
            return bookingDao.getAllBookings().get(index);\
\
        \} else \{\
\
            return null;\
\
        \}\
\
    \}\
\
\
\
\}\
}