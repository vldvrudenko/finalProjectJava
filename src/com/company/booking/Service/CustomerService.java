{\rtf1\ansi\ansicpg1251\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 package com.company.booking.Service;\
\
import com.company.booking.Constant.RoleType;\
import com.company.booking.Booking.Customer;\
import com.company.booking.Constant.RoleType;\
import com.company.booking.Constant.Sex;\
import com.company.booking.DAO.CollectionCustomerDAO;\
import com.company.booking.DAO.PersonDAO;\
\
import java.util.List;\
\
public class CustomerService \{\
\
    private PersonDAO<Customer> customerDao = new CollectionCustomerDAO();\
\
    public PersonDAO getCustomerDAO() \{\
        return customerDao;\
    \}\
\
    public List<Customer> getAllCustomers() \{\
        return customerDao.getAll();\
    \}\
\
    public void displayAllCustomers() \{\
        customerDao.getAll()\
                .forEach(System.out::println);\
    \}\
\
    public void saveCustomer(Customer customer) \{\
        if (customer.getLoginName() != "" && customer.getPassword() != "") \{\
            if (customerDao.getAll()\
                    .stream()\
                    .filter(e -> (e.getLoginName() == customer.getLoginName()))\
                    .count() == 0) \{\
                customerDao.save(customer);\
            \} else \{\
                new IllegalArgumentException();\
            \}\
        \}\
    \}\
\
    public void saveData(String filePath) \{\
        customerDao.saveData(filePath);\
    \}\
\
    public void readData(String filePath) \{\
        customerDao.readData(filePath);\
    \}\
\
    public void deleteCusomerByIndex(int index) \{\
        customerDao.remove(index);\
    \}\
\
    public int count() \{\
        return customerDao.getAll()\
                .size();\
    \}\
\
    public Customer getCustomerById(int index) \{\
        if (index >= 0 && index < customerDao.getAll().size()) \{\
            return customerDao.getAll().get(index);\
        \} else \{\
            return null;\
        \}\
    \}\
\
    public Customer getCustomerByLogin(String loginName, String password) \{\
        return customerDao.getAll()\
                .stream()\
                .filter(customer -> (customer.getLoginName().equalsIgnoreCase(loginName) && customer.getPassword().equals(password)))\
                .findAny().orElse(null);\
    \}\
\
    public Customer getCustomerGuest() \{\
        Customer guest = customerDao.getAll()\
                .stream()\
                .filter(customer -> (customer.getRole().equals(RoleType.GUEST)))\
                .findAny().orElse(null);\
        if (guest == null) \{\
            guest = new Customer("GUEST", "GUEST", 0, Sex.UNKNOWN, "GUEST", "GUEST");\
            guest.setRole(RoleType.GUEST);\
            customerDao.save(guest);\
        \}\
\
        return guest;\
    \}\
\}\
}