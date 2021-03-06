package com.company.booking.Booking;

import com.company.booking.Constant.DataUtil;
import com.company.booking.Constant.Sex;

import java.io.Serializable;

import static com.company.booking.Constant.ComUtil.dateLongToString;

public class Passenger extends Person implements Serializable {
    private int pass_ID;
    private String passportNumber;

    private static int count = 0;

    {
        this.pass_ID = ++count;
    }

    public int getPass_ID() {
        return pass_ID;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public Passenger(String name, String surname, Long birthDate, Sex sex, String passportNumber) {
        super(name, surname, birthDate, sex);
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "pass_ID=" + pass_ID +
                ", name=\'" + super.getName() + "\'" +
                ", surname=\'" + super.getSurname() + "\'" +
                ", birthDate=" + dateLongToString(super.getBirthDate(), DataUtil.DATE_FORMAT) +
                ", sex=" + super.getSex() +
                ", passportNumber=\'" + passportNumber + "\'" +
                "}";
    }
}
