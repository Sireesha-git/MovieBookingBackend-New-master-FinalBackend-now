package com.example.moviebookingbackend.controller;


import com.example.moviebookingbackend.model.Payment;
import com.example.moviebookingbackend.model.PaymentDto;
import com.example.moviebookingbackend.repository.PaymentRepository;
import com.example.moviebookingbackend.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class PaymentController {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PaymentService paymentService ;

    public PaymentDto converttoDto(Payment payment){
        return modelMapper.map(payment,PaymentDto.class);
    }

    public Payment converttoPayment(PaymentDto paymentDto){
        return modelMapper.map(paymentDto,Payment.class);
    }

    @Autowired
    private PaymentRepository paymentRepository;
    @PostMapping("/payment")
    public boolean checkPayment(@RequestBody PaymentDto admin) {

        Payment payment=converttoPayment(admin);
        Optional<Payment> value=this.paymentRepository.findById(payment.getCardNumber());
        if(paymentRepository.existsById(payment.getCardNumber()) && value.isPresent()  ) {

            Payment currentAdmin = value.get();

            return  (currentAdmin.getCustomerName().equals(payment.getCustomerName())
                    && currentAdmin.getCvv().equals(payment.getCvv())
                    && currentAdmin.getExpireDate().equals(payment.getExpireDate()));

        }
        else {

            return false;
        }

    }



}