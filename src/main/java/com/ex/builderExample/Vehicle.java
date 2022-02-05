package com.ex.builderExample;

public class Vehicle {
     private String car;
     private String colour;

    public Vehicle(String car, String colour) {
        this.car = car;
        this.colour = colour;
    }


    public void printCar(){
        System.out.println(car);
    }

    public void printColour(){
        System.out.println(colour);
    }
}
