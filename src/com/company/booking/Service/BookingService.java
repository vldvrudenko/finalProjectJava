package com.company.booking.Service;

import com.company.booking.Booking.Booking;
import com.company.booking.DAO.CollectionBookingDAO;
import com.company.booking.DAO.BookingDAO;

import java.util.List;

public class BookingService {

    private BookingDAO bookingDao = new CollectionBookingDAO();

    public BookingDAO getBookingDao() {
        return bookingDao;
    }

    public List<Booking> getAllBookings() {
        return bookingDao.getAllBookings();
    }

    public void displayAllBookings() {

        bookingDao.getAllBookings().forEach(System.out::println);

    }

    public void saveBooking(Booking booking) {

        bookingDao.saveBooking(booking);

    }

    public void saveData(String filePath) {

        bookingDao.saveData(filePath);

    }

    public void readData(String filePath) {

        bookingDao.readData(filePath);

    }

    public void deleteBookingByIndex(int index) {

        bookingDao.deleteBooking(index);

    }

    public void deleteBookingByObject(Booking booking) {

        bookingDao.deleteBooking(booking);

    }

    public int count() {

        return bookingDao.getAllBookings().size();

    }

    public Booking getBookingById(int index) {

        if (index >= 0 && index < bookingDao.getAllBookings().size()) {

            return bookingDao.getAllBookings().get(index);

        } else {

            return null;

        }

    }



}
