package main.java.com.trainconsist;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================");

        // UC1 - Initialize Train Consist
        List<String> trainConsist = new ArrayList<>();

        System.out.println("\nTrain consist initialized successfully.");
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // =========================================
        // UC2 - Add Passenger Bogies
        // =========================================

        System.out.println("\nAdding Passenger Bogies...");

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("\nPassenger Bogies:");
        System.out.println(trainConsist);

        System.out.println("\nRemoving AC Chair Bogie...");
        trainConsist.remove("AC Chair");

        System.out.println("\nChecking if Sleeper Bogie Exists...");
        System.out.println("Sleeper Exists : " + trainConsist.contains("Sleeper"));

        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nFinal Bogie Count : " + trainConsist.size());

        System.out.println("\nProgram Completed Successfully.");
    }
}