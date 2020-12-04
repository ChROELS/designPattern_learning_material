package com.example.FacadeDesignMe;

import java.math.BigDecimal;

public class RegisteredCandidate {
    private int registrationNumber;
    private final BigDecimal registrationCOST = new BigDecimal("124.99");
    //getters and setters
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public BigDecimal getRegistrationCost() {
        return registrationCOST;
    }

    //specific methods to check conditions on the candidate to the certification
    public boolean isRegistered(int registrationNumber){
        return registrationNumber==this.registrationNumber;
    }
    public boolean paidRegistration(String amount){
        return registrationCOST.equals(new BigDecimal(amount));
    }



}
