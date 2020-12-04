package com.example.PrototypeDesign.factories;

import com.example.PrototypeDesign.models.Animal;

public class CloneFactory {
    public Animal getClone(Animal animal){
        return animal.createClone();
    }
}
