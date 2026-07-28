package main.java.com.trainconsist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================");

        // =========================================
        // UC1 - Initialize Train Consist
        // =========================================

        List<String> trainConsist = new ArrayList<>();

        System.out.println("\nTrain consist initialized successfully.");
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // =========================================
        // UC2 - Passenger Bogies using ArrayList
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

        // =========================================
        // UC3 - Unique Bogie IDs using HashSet
        // =========================================

        System.out.println("\n========================================");
        System.out.println("UC3 - UNIQUE BOGIE IDS");
        System.out.println("========================================");

        Set<String> bogieIds = new HashSet<>();

        System.out.println("\nAdding Bogie IDs...");

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Duplicate Entry
        bogieIds.add("BG101");

        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("\nTotal Unique Bogie IDs : " + bogieIds.size());

        System.out.println("\nChecking BG102...");
        System.out.println("Exists : " + bogieIds.contains("BG102"));

        System.out.println("\nChecking BG105...");
        System.out.println("Exists : " + bogieIds.contains("BG105"));

        System.out.println("\nRemoving BG103...");
        bogieIds.remove("BG103");

        System.out.println("\nFinal Unique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("\nFinal Bogie ID Count : " + bogieIds.size());

        System.out.println("\nProgram Completed Successfully.");
    }

}