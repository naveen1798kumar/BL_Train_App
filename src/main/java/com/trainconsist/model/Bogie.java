package main.java.com.trainconsist.model;

import main.java.com.trainconsist.exception.InvalidCapacityException;

public class Bogie {

    private String name;
    private int capacity;

    public Bogie(String name, int capacity)
            throws InvalidCapacityException {

        if (capacity <= 0) {

            throw new InvalidCapacityException(
                    "Invalid Capacity : Capacity must be greater than zero."
            );

        }

        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {

        return "Bogie Name : " + name +
                "\nCapacity : " + capacity;

    }

}