package com.example.FacadeDesignMe;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CertificateDeliveryFacade {
    private int registrationNumber;
    private String registrationCost;
    private double examinationResults;
    private LocalDate examinationDate;


    private final RegisteredCandidate registeredCandidate;
    private final Exam exam;

    public CertificateDeliveryFacade(int registrationNumber, String registrationCost, double examinationResults, LocalDate examinationDate, RegisteredCandidate registeredCandidate, Exam exam) {
        this.registrationNumber = registrationNumber;
        this.registrationCost = registrationCost;
        this.examinationResults = examinationResults;
        this.examinationDate = examinationDate;
        this.registeredCandidate = registeredCandidate;
        this.exam = exam;
    }

    //getters and setters for instance variables that the client determines
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationCost() {
        return registrationCost;
    }
    public void setRegistrationCost(String registrationCost) {
        this.registrationCost = registrationCost;
    }

    public double getExaminationResults() {
        return examinationResults;
    }
    public void setExaminationResults(double examinationResults) {
        this.examinationResults = examinationResults;
    }

    public LocalDate getExaminationDate() {
        return examinationDate;
    }
    public void setExaminationDate(LocalDate examinationDate) {
        this.examinationDate = examinationDate;
    }
    public boolean setExamCompleted(LocalDate examinationDate){
        return !(examinationDate == null);
    }


    //The main action of this 'facade' is to deliver a certificate based on a series of conditions
    //For each condition, there is an instance of another class in which the needed verifications, calculations are performed
    //All this process has been so relegated to a 'back-end'
     public boolean deliverCertificate(){
        if(registeredCandidate.isRegistered(registrationNumber)&&registeredCandidate.paidRegistration(registrationCost)){
            System.out.println("You are a valid candidate for this certification");
            if(exam.isCompleted()) {
                System.out.println("You have passed the examination");
                if (exam.isThisYear(examinationDate) && exam.passExam(examinationResults)) {
                    System.out.println("Here is your certificate!");
                    return true;
                } else {
                    System.out.println("Sorry, you can't receive this certificate: ");
                    if (!exam.isThisYear(examinationDate)) {
                        System.out.println("The year of your examination date has passed! ");
                    } else if (!exam.passExam(examinationResults)) {
                        System.out.println("Your results are below 70/100");
                    }
                    return false;
                }
            }else{
                System.out.println("You have not yet passed the examination");
                return false;
            }
        }else{
            System.out.println("You are not yet a valid candidate for this certification");
            return false;
        }
     }

}
