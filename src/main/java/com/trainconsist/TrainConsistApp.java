package main.java.com.trainconsist;
import main.java.com.trainconsist.model.Bogie;
import main.java.com.trainconsist.model.GoodsBogie;
import main.java.com.trainconsist.exception.InvalidCapacityException;
import main.java.com.trainconsist.exception.CargoSafetyException;
import main.java.com.trainconsist.service.CargoAssignmentService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.Comparator;
import java.util.stream.Collectors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        // =========================================
// UC4 - Train Formation using LinkedList
// =========================================

        System.out.println("\n========================================");
        System.out.println("UC4 - TRAIN FORMATION (LINKEDLIST)");
        System.out.println("========================================");

        LinkedList<String> trainFormation = new LinkedList<>();

        System.out.println("\nCreating Train Formation...");

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("AC");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("\nInitial Train Formation:");
        System.out.println(trainFormation);

// Insert Pantry Car at position 2
        System.out.println("\nAdding Pantry Car at Position 2...");
        trainFormation.add(2, "Pantry Car");

        System.out.println("\nTrain Formation After Insertion:");
        System.out.println(trainFormation);

// Display first and last bogie
        System.out.println("\nFirst Bogie : " + trainFormation.getFirst());
        System.out.println("Last Bogie  : " + trainFormation.getLast());

// Remove first and last bogie
        System.out.println("\nRemoving First Bogie...");
        trainFormation.removeFirst();

        System.out.println("Removing Last Bogie...");
        trainFormation.removeLast();

        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);

        System.out.println("\nTotal Bogies : " + trainFormation.size());


        // =========================================
// UC5 - LinkedHashSet
// =========================================

        System.out.println("\n========================================");
        System.out.println("UC5 - LINKEDHASHSET TRAIN FORMATION");
        System.out.println("========================================");

        LinkedHashSet<String> orderedFormation = new LinkedHashSet<>();

        System.out.println("\nAttaching Bogies...");

        orderedFormation.add("Engine");
        orderedFormation.add("Sleeper");
        orderedFormation.add("Cargo");
        orderedFormation.add("Guard");

// Duplicate Entry
        orderedFormation.add("Sleeper");

        System.out.println("\nTrain Formation:");

        for (String bogie : orderedFormation) {
            System.out.println(bogie);
        }

        System.out.println("\nTotal Bogies : "
                + orderedFormation.size());

        System.out.println("\nChecking Cargo Bogie...");
        System.out.println("Exists : "
                + orderedFormation.contains("Cargo"));

        System.out.println("\nChecking Pantry Bogie...");
        System.out.println("Exists : "
                + orderedFormation.contains("Pantry"));

        System.out.println("\nAttempting to add duplicate 'Guard'...");
        orderedFormation.add("Guard");

        System.out.println("\nFinal Ordered Train Formation:");

        for (String bogie : orderedFormation) {
            System.out.println(bogie);
        }

        System.out.println("\nInsertion Order Preserved.");
        System.out.println("Duplicate Bogies Automatically Ignored.");


        // =========================================
// UC6 - HashMap (Bogie Capacity Mapping)
// =========================================

        System.out.println("\n========================================");
        System.out.println("UC6 - BOGIE CAPACITY MAPPING (HASHMAP)");
        System.out.println("========================================");

        Map<String, Integer> bogieCapacity = new HashMap<>();

        System.out.println("\nMapping Bogies to Their Capacities...");

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 24);

        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {

            System.out.println("Bogie : " + entry.getKey());
            System.out.println("Capacity : " + entry.getValue());
            System.out.println("----------------------------");

        }

        System.out.println("Total Bogie Types : " + bogieCapacity.size());

        System.out.println("\nChecking Capacity of Sleeper...");
        System.out.println("Sleeper Capacity : "
                + bogieCapacity.get("Sleeper"));

        System.out.println("\nChecking Capacity of AC Chair...");
        System.out.println("AC Chair Capacity : "
                + bogieCapacity.get("AC Chair"));

        // =========================================
// UC7 - Comparator Sorting
// =========================================

        System.out.println("\n========================================");
        System.out.println("UC7 - SORT BOGIES BY CAPACITY");
        System.out.println("========================================");

        List<Bogie> bogies = new ArrayList<>();

        try {

            bogies.add(new Bogie("Sleeper",72));
            bogies.add(new Bogie("AC Chair",56));
            bogies.add(new Bogie("First Class",24));

        } catch (InvalidCapacityException e) {

            System.out.println(e.getMessage());

        }

        System.out.println("\nBefore Sorting\n");

        for(Bogie bogie : bogies){

            System.out.println(bogie);

            System.out.println("------------------------");

        }

        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nAfter Sorting By Capacity\n");

        for(Bogie bogie : bogies){

            System.out.println(bogie);

            System.out.println("------------------------");

        }

        // =========================================
        // UC8 - Stream API (Filter Bogies)
        // =========================================

        System.out.println("\n========================================");
        System.out.println("UC8 - FILTER PASSENGER BOGIES USING STREAM");
        System.out.println("========================================");

        List<Bogie> filteredBogies = bogies.stream()
                .filter(bogie -> bogie.getCapacity() > 60)
                .collect(Collectors.toList());

        System.out.println("\nPassenger Bogies with Capacity > 60\n");

        for (Bogie bogie : filteredBogies) {

            System.out.println(bogie);

            System.out.println("----------------------------");

        }

        // =========================================
// UC9 - Group Bogies using groupingBy()
// =========================================

        System.out.println("\n========================================");
        System.out.println("UC9 - GROUP BOGIES USING GROUPINGBY()");
        System.out.println("========================================");

// Group Bogies by Name
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getName));

        System.out.println("\nGrouped Bogies:\n");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {

            System.out.println("Category : " + entry.getKey());

            for (Bogie bogie : entry.getValue()) {

                System.out.println("   " + bogie);

            }

            System.out.println("----------------------------");

        }

        // =========================================
// UC10 - Calculate Total Seating Capacity
// Using Stream reduce()
// =========================================

        System.out.println("\n========================================");
        System.out.println("UC10 - TOTAL TRAIN SEATING CAPACITY");
        System.out.println("========================================");

        int totalCapacity = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        System.out.println("\nPassenger Bogies:");

        for (Bogie bogie : bogies) {

            System.out.println(bogie);

            System.out.println("----------------------------");

        }

        System.out.println("\nTotal Seating Capacity : "
                + totalCapacity);


        // =========================================
// UC11 - Regex Validation
// =========================================

        System.out.println("\n========================================");
        System.out.println("UC11 - TRAIN ID & CARGO CODE VALIDATION");
        System.out.println("========================================");

// Sample Inputs
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

// Regex Patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

// Compile Patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

// Create Matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

// Validation
        System.out.println("\nTrain ID : " + trainId);

        if (trainMatcher.matches()) {
            System.out.println("Train ID Status : VALID");
        } else {
            System.out.println("Train ID Status : INVALID");
        }

        System.out.println();

        System.out.println("Cargo Code : " + cargoCode);

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code Status : VALID");
        } else {
            System.out.println("Cargo Code Status : INVALID");
        }

// Invalid Example

        String invalidTrain = "TRAIN12";

        Matcher invalidMatcher =
                trainPattern.matcher(invalidTrain);

        System.out.println();

        System.out.println("Train ID : " + invalidTrain);

        if (invalidMatcher.matches()) {

            System.out.println("Train ID Status : VALID");

        } else {

            System.out.println("Train ID Status : INVALID");

        }

        // =========================================
// UC12 - Goods Bogie Safety Validation
// =========================================

        System.out.println("\n========================================");
        System.out.println("UC12 - SAFETY COMPLIANCE CHECK");
        System.out.println("========================================");

        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Steel"));

        System.out.println("\nGoods Bogies:");

        for (GoodsBogie bogie : goodsBogies) {

            System.out.println(bogie);

            System.out.println("----------------------------");

        }

        boolean safe = goodsBogies.stream()
                .allMatch(bogie ->

                        !bogie.getType().equalsIgnoreCase("Cylindrical")

                                ||

                                bogie.getCargo().equalsIgnoreCase("Petroleum")

                );

        System.out.println();

        if (safe) {

            System.out.println("Train Safety Status : SAFE");

        } else {

            System.out.println("Train Safety Status : NOT SAFE");

        }

        // =========================================
// UC13 - Performance Comparison
// =========================================

        System.out.println("\n========================================");
        System.out.println("UC13 - PERFORMANCE COMPARISON");
        System.out.println("========================================");

// -----------------------------
// Loop-Based Filtering
// -----------------------------
        long loopStart = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();

        for (Bogie bogie : bogies) {

            if (bogie.getCapacity() > 50) {
                loopFiltered.add(bogie);
            }

        }

        long loopEnd = System.nanoTime();

        long loopDuration = loopEnd - loopStart;

// -----------------------------
// Stream-Based Filtering
// -----------------------------
        long streamStart = System.nanoTime();

        List<Bogie> streamFiltered = bogies.stream()
                .filter(bogie -> bogie.getCapacity() > 50)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();

        long streamDuration = streamEnd - streamStart;

// -----------------------------
// Display Results
// -----------------------------

        System.out.println("\nLoop Filtered Bogies:");

        for (Bogie bogie : loopFiltered) {

            System.out.println(bogie);
            System.out.println("----------------------------");

        }

        System.out.println("Loop Execution Time : "
                + loopDuration + " ns");

        System.out.println();

        System.out.println("Stream Filtered Bogies:");

        for (Bogie bogie : streamFiltered) {

            System.out.println(bogie);
            System.out.println("----------------------------");

        }

        System.out.println("Stream Execution Time : "
                + streamDuration + " ns");


        // =========================================
// UC14 - Custom Exception
// =========================================

        System.out.println("\n========================================");
        System.out.println("UC14 - INVALID BOGIE CAPACITY");
        System.out.println("========================================");

        try {

            Bogie sleeper =
                    new Bogie("Sleeper", 72);

            System.out.println("\nCreated Successfully");

            System.out.println(sleeper);

            System.out.println();

            Bogie invalid =
                    new Bogie("AC Chair", -10);

            System.out.println(invalid);

        }
        catch (InvalidCapacityException e) {

            System.out.println("Exception Caught");

            System.out.println(e.getMessage());

        }


        // =========================================
// UC15 - Safe Cargo Assignment
// =========================================

        System.out.println("\n========================================");
        System.out.println("UC15 - SAFE CARGO ASSIGNMENT");
        System.out.println("========================================");

        GoodsBogie goodsBogie =
                new GoodsBogie("Rectangular", "Coal");

        CargoAssignmentService cargoService =
                new CargoAssignmentService();

        try {

            cargoService.assignCargo(goodsBogie, "Petroleum");

        }
        catch (CargoSafetyException e) {

            System.out.println();

            System.out.println("Exception Caught");

            System.out.println(e.getMessage());

        }
        finally {

            System.out.println();

            System.out.println("Cargo Assignment Process Completed.");

        }

        System.out.println();

        System.out.println("Application Continues...");


        System.out.println("\nProgram Completed Successfully.");
    }

}