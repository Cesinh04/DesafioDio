package com.poo.desafio.model;

public class Car extends Vehicle {

    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void start() {
        System.out.println(this + " started with ignition key.");
    }
}