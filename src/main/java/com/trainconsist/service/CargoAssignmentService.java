package main.java.com.trainconsist.service;

import main.java.com.trainconsist.exception.CargoSafetyException;
import main.java.com.trainconsist.model.GoodsBogie;

public class CargoAssignmentService {

    public void assignCargo(GoodsBogie bogie, String cargo) {

        if (bogie.getType().equalsIgnoreCase("Rectangular")
                && cargo.equalsIgnoreCase("Petroleum")) {

            throw new CargoSafetyException(
                    "Unsafe Cargo Assignment! Petroleum cannot be assigned to a Rectangular Bogie."
            );

        }

        bogie.setCargo(cargo);

        System.out.println("Cargo Assigned Successfully.");

        System.out.println(bogie);

    }

}