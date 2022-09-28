package com.example.moviebookingbackend.controller;

import com.example.moviebookingbackend.model.Bookings;
import com.example.moviebookingbackend.model.BookingsDto;

import com.example.moviebookingbackend.service.BookingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class BookingController {

    @Autowired
    private BookingService bookingService ;

    @Autowired
    private ModelMapper modelMapper;


    public  Bookings convertToBooking(BookingsDto bookingsDto){
        return modelMapper.map(bookingsDto,Bookings.class);
    }


    @PostMapping("/addBooking/{id}/{mid}")
    public Bookings saveData(@RequestBody BookingsDto bookingsDto,@PathVariable(value = "id") int id,@PathVariable(value = "mid") int mid){
        Bookings bookings=convertToBooking(bookingsDto);

        return bookingService.saveData(bookings,id,mid);
    }



    @GetMapping("BookingId/{id}")
    public Bookings findBookingId(@PathVariable int id) {
        return bookingService.getBookings(id);
    }

    @GetMapping("SumBooking/{theatreid}")
    public int getBookingsByBookingidtotal(@PathVariable int theatreid){
        return bookingService.getBookingsByBookingidtotal(theatreid);
    }







}
