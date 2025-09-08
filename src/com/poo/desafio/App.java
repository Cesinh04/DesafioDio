package com.poo.desafio;

import com.poo.desafio.model.Car;
import com.poo.desafio.model.ElectricCar;
import com.poo.desafio.model.Vehicle;
import com.poo.desafio.service.VehicleService;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota", "Corolla", 2022));
        vehicles.add(new Car("Honda", "Civic", 2023));
        vehicles.add(new ElectricCar("Tesla", "Model 3", 2023));
        vehicles.add(new ElectricCar("Nissan", "Leaf", 2022));

        VehicleService service = new VehicleService();

        System.out.println("=== All Vehicles ===");
        service.printAllVehicles(vehicles);

        System.out.println("\n=== Starting Vehicles ===");
        service.startAllVehicles(vehicles);
    }
}