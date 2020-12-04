package com.example.observerDesign.obsInterfaces;

public interface Subject {
     Observer register(Observer o);
    Observer unregister(Observer o);
    void notifyObserver();
}
