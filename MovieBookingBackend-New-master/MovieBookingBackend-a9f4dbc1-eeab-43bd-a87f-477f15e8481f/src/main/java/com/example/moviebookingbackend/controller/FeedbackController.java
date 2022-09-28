package com.example.moviebookingbackend.controller;

import com.example.moviebookingbackend.model.FeedBack;
import com.example.moviebookingbackend.model.FeedbackDto;
import com.example.moviebookingbackend.service.FeedbackService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class FeedbackController {

    @Autowired
    private ModelMapper modelMapper;

      public FeedBack convertToFeeback(FeedbackDto feedbackDto){
        return modelMapper.map(feedbackDto,FeedBack.class);
    }

    @Autowired
    private FeedbackService service ;


    @PostMapping("/add/{id}")
    public FeedBack saveData(@RequestBody FeedbackDto feedbackDto ,@PathVariable int id){
        System.out.println(id);
        FeedBack feedBack=convertToFeeback(feedbackDto);
        return service.saveDetails(feedBack,id);
    }
    @GetMapping("/get")
    public List<FeedBack> getModule() {
        return service.getAll();
    }
}
