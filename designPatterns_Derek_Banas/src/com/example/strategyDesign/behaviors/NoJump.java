package com.example.strategyDesign.behaviors;

public class NoJump implements Jump{
    @Override
    public String jump() {
        return " cannot jump.";
    }
}
