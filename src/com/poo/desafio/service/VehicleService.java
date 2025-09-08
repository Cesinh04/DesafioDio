package com.poo.desafio.service;

import com.poo.desafio.model.Vehicle;
import java.util.List;

public class VehicleService {

    public void printAllVehicles(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    public void startAllVehicles(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}