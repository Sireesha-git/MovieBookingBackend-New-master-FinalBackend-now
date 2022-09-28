package com.example.moviebookingbackend.model;

import lombok.Data;


import javax.persistence.*;
import java.time.LocalDate;


@Table
@Data
@Entity
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingid;
    private LocalDate bookingDate;
    private int totalNoTicket ;
    private int totalCost ;

    @ManyToOne
    @JoinColumn(name = "movieid" , referencedColumnName = "movieid")
    private Movies movies ;

    @ManyToOne
    @JoinColumn(name = "customerid" , referencedColumnName = "customerid")
    private Customer customer;

    @Override
    public String toString() {
        return "Bookings{" +
                "bookingid=" + bookingid +
                ", bookingDate=" + bookingDate +
                ", totalNoTicket=" + totalNoTicket +
                ", totalCost=" + totalCost +
                ", movies=" + movies +
                ", customer=" + customer +
                '}';
    }

    public Bookings( LocalDate bookingDate, int totalNoTicket, int totalCost) {

        this.bookingDate = bookingDate;
        this.totalNoTicket = totalNoTicket;
        this.totalCost = totalCost;

    }
    public  Bookings(){

    }

    public Bookings(Movies movies) {
        this.movies = movies;

    }
    public Bookings(Customer customer) {
        this.customer = customer;
    }

}
