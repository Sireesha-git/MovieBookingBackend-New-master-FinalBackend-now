package com.example.moviebookingbackend.model;


public class TheatreDto {
    private int theatreid;
    private String theatreName ;
    private String theatreEmail ;
    private String password ;


    public int getTheatreid() {
        return theatreid;
    }

    public void setTheatreid(int theatreid) {
        this.theatreid = theatreid;
    }
    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getTheatreEmail() {
        return theatreEmail;
    }

    public void setTheatreEmail(String theatreEmail) {
        this.theatreEmail = theatreEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TheatreDto(int theatreid, String theatreName, String theatreEmail, String password) {
        this.theatreid = theatreid;
        this.theatreName = theatreName;
        this.theatreEmail = theatreEmail;
        this.password = password;
    }
}
