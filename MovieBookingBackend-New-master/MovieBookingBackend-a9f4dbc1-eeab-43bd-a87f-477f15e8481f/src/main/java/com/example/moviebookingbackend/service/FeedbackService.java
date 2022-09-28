package com.example.moviebookingbackend.service;


import com.example.moviebookingbackend.model.Customer;
import com.example.moviebookingbackend.model.FeedBack;
import com.example.moviebookingbackend.repository.FeedBackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {
    @Autowired
    private FeedBackRepo repository ;

    public FeedBack saveDetails(FeedBack module,int id){
        FeedBack feedBack=new FeedBack(module.getComments(), module.getRating());
        feedBack.setCustomer(new Customer(id));
        return repository.save(feedBack);
    }
    public List<FeedBack> getAll (){
        return repository.findAll();
    }
}
