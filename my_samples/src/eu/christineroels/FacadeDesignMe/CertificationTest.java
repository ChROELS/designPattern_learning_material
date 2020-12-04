package com.example.FacadeDesignMe;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

public class CertificationTest {
    @Test
    public void setCriteria(){
        Exam examOne = new Exam(); //arrange
        examOne.setExaminationDate(LocalDate.of(2020, 1, 1)); //act
        Assertions.assertTrue(examOne.isCompleted()); //assert
    }
    @Test
    public void setCandidate(){
        RegisteredCandidate registeredCandidate = new RegisteredCandidate();
        registeredCandidate.setRegistrationNumber(1542);
        Assertions.assertTrue(registeredCandidate.paidRegistration("124.99"));
    }
    @Test
    public void setClientConditions(){
        Exam examOne = new Exam(); //arrange
        examOne.setExaminationDate(LocalDate.of(2020, 1, 1));
        RegisteredCandidate registeredCandidate = new RegisteredCandidate();
        registeredCandidate.setRegistrationNumber(1542);
        CertificateDeliveryFacade certificate = new CertificateDeliveryFacade(1542, "124.99",
                66.5, LocalDate.of(2020,11,12),registeredCandidate,examOne); //act
        Assertions.assertFalse(certificate.deliverCertificate());
    }
}
