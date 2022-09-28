package com.example.moviebookingbackend.model;

import lombok.Data;



import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieid;
    private String title;
    private String cast;
    private LocalDate date;
    private String language;
    private int price;
    private String showTime;
    private String totalTicket;
    private String image ;
    private String location;

    @ManyToOne
    @JoinColumn(name = "theatreid" , referencedColumnName = "theatreid")
    private Theatre theatre;



    public Movies( String title, String cast, LocalDate date, String language, int price, String showTime, String totalTicket) {
        this.title = title;
        this.cast = cast;
        this.date = date;
        this.language = language;
        this.price = price;
        this.showTime = showTime;
        this.totalTicket = totalTicket;

    }

    public Movies(Theatre theatre) {
        this.theatre = theatre;
    }
    public Movies(){
    }

    public Movies(int movieid) {
        this.movieid = movieid;
    }
}
