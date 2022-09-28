package com.example.moviebookingbackend.service;

import com.example.moviebookingbackend.model.Bookings;
import com.example.moviebookingbackend.model.Customer;
import com.example.moviebookingbackend.model.Movies;
import com.example.moviebookingbackend.repository.BookingsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    @Autowired
    private BookingsRepo repository ;

    public Bookings saveData(Bookings bookings,int id,int mid){
        Bookings bookings1=new Bookings(bookings.getBookingDate(),bookings.getTotalNoTicket(),bookings.getTotalCost());
        bookings1.setCustomer(new Customer(id));
        bookings1.setMovies(new Movies(mid));
        return repository.save(bookings1);
    }
    public Bookings getBookings(int id) {
        return repository.findById(id).orElse(null);
    }


    public int getBookingsByBookingidtotal(int theatreid){
        return repository.getBookingsByBookingidtotal(theatreid);
    }


}
