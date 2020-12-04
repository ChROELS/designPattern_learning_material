package com.example.adapterDesignMe;

public class RulerInch implements InchMeasurable, Measurable{
    private final double value;

    public RulerInch(double value) {
        this.value = value;
    }

    @Override
    public void getInchLength() {
        getInchLength(value);
    }
    public void getInchLength(double value) {
        System.out.printf("It is %.2f long", value);
    }

    @Override
    public double getValue() {
        return value;
    }
}
