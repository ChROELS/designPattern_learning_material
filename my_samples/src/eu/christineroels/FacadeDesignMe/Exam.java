package com.example.FacadeDesignMe;

import java.time.LocalDate;

public class Exam {
    private LocalDate examinationDate;
    private double examResults;


    //getters and setters
    public LocalDate getExaminationDate() {
        return examinationDate;
    }
    public void setExaminationDate(LocalDate examinationDate) {
        this.examinationDate = examinationDate;
    }
    public double getExamResults() {
        return examResults;
    }
    public void setExamResults(double examResults) {
        this.examResults = examResults;
    }


    //specific methods to check conditions on the exam to the certification
    public boolean passExam(double results){
        return results >= 70.0;
    }
    public boolean isThisYear(LocalDate date){
        return examinationDate.getYear()==date.getYear();
    }
    public boolean isCompleted(){
        return !(examinationDate==null);
    }
}
