package com.example.adapterDesignMe;

public class RulerCentimeterAdaptee implements CentimeterMeasurable, Measurable{
    private double value;

    public RulerCentimeterAdaptee(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
    public void setValue(double value){
        this.value = value;
    }
    public void getInCentimeter(double value){
        System.out.printf("It is %.2f long", value);
    }

    @Override
    public void getInCentimeter() {
        getInCentimeter(value);
    }
}
