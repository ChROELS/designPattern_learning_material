package com.example.PrototypeDesign.models;

/**
 * A class or classes-tree extends clonable: OK to copy instances of this class.
 * The instances have their own memory location but identical property values and methods implementations
 * unless the user makes a modification on one of the instance (ex. with a setter)
 */
public interface Animal extends Cloneable {
    public Animal createClone();
}
