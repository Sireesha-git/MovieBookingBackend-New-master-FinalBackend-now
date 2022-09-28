package com.example.moviebookingbackend.model;
import java.time.LocalDate;

public class MoviesDto {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getTotalTicket() {
        return totalTicket;
    }

    public void setTotalTicket(String totalTicket) {
        this.totalTicket = totalTicket;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public MoviesDto( String title, String cast, LocalDate date, String language, int price, String showTime, String totalTicket) {

        this.title = title;
        this.cast = cast;
        this.date = date;
        this.language = language;
        this.price = price;
        this.showTime = showTime;
        this.totalTicket = totalTicket;

    }


}
