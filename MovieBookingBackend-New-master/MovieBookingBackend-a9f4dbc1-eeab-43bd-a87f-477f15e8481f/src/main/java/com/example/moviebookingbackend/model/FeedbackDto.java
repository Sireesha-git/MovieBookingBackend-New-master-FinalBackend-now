package com.example.moviebookingbackend.model;



public class FeedbackDto {

    private long id ;
    private String comments;
    private String rating;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public FeedbackDto( String comments, String rating) {

        this.comments = comments;
        this.rating = rating;
    }
    public FeedbackDto(){

    }
}
