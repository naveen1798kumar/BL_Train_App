package main.java.com.trainconsist;
import main.java.com.trainconsist.model.Bogie;

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

        bogies.add(new Bogie("Sleeper",72));
        bogies.add(new Bogie("AC Chair",56));
        bogies.add(new Bogie("First Class",24));

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

        System.out.println("\nProgram Completed Successfully.");
    }

}