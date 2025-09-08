package com.poo.desafio.model;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract void start();

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ")";
    }
}