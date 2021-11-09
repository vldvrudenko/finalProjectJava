{\rtf1\ansi\ansicpg1251\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 package com.company.booking.Controller;\
\
import com.company.booking.Booking.Passenger;\
import com.company.booking.Booking.Customer;\
import com.company.booking.Booking.Person;\
import com.company.booking.Constant.PersonType;\
import com.company.booking.Constant.Sex;\
import com.company.booking.Service.CustomerService;\
\
import java.util.List;\
\
import static com.company.booking.Constant.ComUtil.parseAndValidateInputString;\
import static com.company.booking.Constant.ComUtil.parseDate;\
\
public class CustomerController \{\
\
    private CustomerService customerService = new CustomerService();\
\
    public List<Customer> getAllCustomers() \{\
        return customerService.getAllCustomers();\
    \}\
\
    public void displayAllCustomers() \{\
        customerService.displayAllCustomers();\
    \}\
\
    public void saveCustomer(Customer customer) \{\
        customerService.saveCustomer(customer);\
    \}\
\
    public void saveData(String filePath) \{\
        customerService.saveData(filePath);\
    \}\
\
    public void readData(String filePath) \{\
        customerService.readData(filePath);\
    \}\
\
    public void deleteCustomerByIndex(int index) \{\
        customerService.deleteCusomerByIndex(index);\
    \}\
\
    public int count() \{\
        return customerService.count();\
    \}\
\
    public Customer getCustomerById(int index) \{\
        return customerService.getCustomerById(index);\
    \}\
\
    public Customer getCustomerByLogin(String loginName, String password) \{\
        return customerService.getCustomerByLogin(loginName, password);\
    \}\
\
    public Customer getCustomerGuest() \{\
        return customerService.getCustomerGuest();\
    \}\
\
    public Person createPerson(PersonType personType) \{\
        Person result;\
\
        System.out.println("Enter personal data, please... ");\
\
        String name = parseAndValidateInputString(\
                "Name: ",\
                "^[A-Z][A-Za-z ]+",\
                "Name",\
                "Vasia"\
        );\
        String surname = parseAndValidateInputString(\
                "Surname: ",\
                "^[A-Z][A-Za-z ]+",\
                "Surname",\
                "Sidorov"\
        );\
        long birthdate =\
                parseDate(\
                        parseAndValidateInputString(\
                                "BirthDate (dd/MM/yyyy): ",\
                                "^[0-9][0-9]/[0-9][0-9]/[12][09][0-9][0-9]",\
                                "Date",\
                                "21/07/1990"\
                        ));\
        Sex sex = Sex.valueOf(parseAndValidateInputString(\
                "Sex (Male or Female):  ",\
                "(?i)Male|(?i)Female",\
                "Sex",\
                "Male").toUpperCase());\
\
        if (personType == PersonType.CUSTOMER) \{\
            String loginName = parseAndValidateInputString(\
                    "LoginName (your e-mail): ",\
                    "^(.+)@(.+)$",\
                    "LoginName",\
                    "Ivanov@gmail.com"\
            );\
            String password = parseAndValidateInputString(\
                    "Password: ",\
                    "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).\{8,\}",\
                    "Password",\
                    "aaZZa44@"\
            );\
            /*\
            (?=.*[0-9]) a digit must occur at least once\
            (?=.*[a-z]) a lower case letter must occur at least once\
            (?=.*[A-Z]) an upper case letter must occur at least once\
            (?=.*[@#$%^&+=]) a special character must occur at least once\
            (?=\\\\S+$) no whitespace allowed in the entire string\
            .\{8,\} at least 8 characters\
            */\
            result = new Customer(name, surname, birthdate, sex, loginName, password);\
        \} else \{\
            String passNumber = parseAndValidateInputString(\
                    "Passport Number: ",\
                    "^[A-Z][A-Z][0-9]+",\
                    "Passport Number",\
                    "AK876543"\
            );\
            result = new Passenger(name, surname, birthdate, sex, passNumber);\
        \}\
        return result;\
    \}\
\}\
}