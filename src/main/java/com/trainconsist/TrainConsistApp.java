package main.java.com.trainconsist;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================");

        // Initialize an empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("\nTrain consist initialized successfully.");

        System.out.println("Initial Bogie Count : " + trainConsist.size());

        System.out.println("\nTrain Consist : " + trainConsist);

        System.out.println("\nProgram Ready...");
    }
}