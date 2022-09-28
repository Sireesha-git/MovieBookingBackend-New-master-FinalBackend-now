package com.example.moviebookingbackend.model;

import java.time.LocalDate;

public class BookingsDto {

    private int bookingid;
    private LocalDate bookingDate;
    private int totalNoTicket ;
    private int totalCost ;

    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getTotalNoTicket() {
        return totalNoTicket;
    }

    public void setTotalNoTicket(int totalNoTicket) {
        this.totalNoTicket = totalNoTicket;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public BookingsDto(int bookingid, LocalDate bookingDate, int totalNoTicket, int totalCost) {
        this.bookingid = bookingid;
        this.bookingDate = bookingDate;
        this.totalNoTicket = totalNoTicket;
        this.totalCost = totalCost;
    }
}
