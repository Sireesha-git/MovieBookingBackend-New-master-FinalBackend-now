package com.example.moviebookingbackend.controller;


import com.example.moviebookingbackend.model.*;
import com.example.moviebookingbackend.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

    @Autowired
    private ModelMapper modelMapper;
     public Customer convertToCustomer(CustomerDto customerDto){
        return  modelMapper.map(customerDto,Customer.class);
    }

    @Autowired
    private CustomerService service;

    @PostMapping("/customer")
    public Customer saveData(@RequestBody CustomerDto customerDto){
        Customer customer=convertToCustomer(customerDto);
        return service.addData(customer);
    }
    @PostMapping("/registered")
    public int registerUser(@RequestBody CustomerDto customerDto) throws IllegalAccessException {
        Customer customer=convertToCustomer(customerDto);
        String tempEmailId  = customerDto.getEmail();
        if(tempEmailId != null && !"".equals(tempEmailId)) {
            Customer userobj = service.fetchUserByEmail(tempEmailId);
            if(userobj != null) {
                throw new IllegalAccessException("user with "+tempEmailId+" is already exit");
            }
        }
        Customer userObj = null;
        userObj = service.saveUser(customer);
        return userObj.getCustomerid();
    }

    @PostMapping("/login")
    public int loginUser(@RequestBody CustomerDto customerDto) throws IllegalAccessException {
        Customer customer=convertToCustomer(customerDto);
        String tempEmailId = customer.getEmail();
        String tempPass = customer.getPassword();
        Customer userObj = null;
        if(tempEmailId != null && tempPass != null) {
            userObj = service.fetchUserByEmailAndPassword(tempEmailId, tempPass);
        }
        if(userObj == null) {
            throw new IllegalAccessException("Bad credentials");
        }
        return userObj.getCustomerid();
    }

    @GetMapping("/getUserByid/{id}")
    public Customer getUserByid(@PathVariable int id){
        return service.getUser(id);
    }


    @GetMapping("getByCustomerId/{customerid}")
    public List<Bookings> getCustomer(@PathVariable int customerid){
        return service.findCustomer(customerid);
    }


}
