package com.example.moviebookingbackend.model;

public class PaymentDto {
    private Long cardNumber;
    private String customerName;
    private String expireDate;
    private Integer cvv;

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public PaymentDto(Long cardNumber, String customerName, String expireDate, Integer cvv) {

        this.cardNumber = cardNumber;
        this.customerName = customerName;
        this.expireDate = expireDate;
        this.cvv = cvv;
    }
}
