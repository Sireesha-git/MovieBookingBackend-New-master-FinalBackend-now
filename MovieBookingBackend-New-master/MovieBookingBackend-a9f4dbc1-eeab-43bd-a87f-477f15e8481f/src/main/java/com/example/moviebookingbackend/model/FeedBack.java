package com.example.moviebookingbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Table
@Data
@Entity
public class FeedBack {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private String comments;
    private String rating;

    @ManyToOne
    @JoinColumn(name = "customerid" , referencedColumnName = "customerid")
    private Customer customer ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public FeedBack( String comments, String rating) {

        this.comments = comments;
        this.rating = rating;

    }
    public FeedBack(){

    }

    public FeedBack(Customer customer) {
        this.customer = customer;
    }
}
