package com.poo.desafio.model;

public class ElectricCar extends Vehicle {

    public ElectricCar(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void start() {
        System.out.println(this + " started silently (electric).");
    }
}