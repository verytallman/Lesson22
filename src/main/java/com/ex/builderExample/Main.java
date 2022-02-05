package com.ex.builderExample;

public class Main {
    public static void main(String[] args) {
        BuilderExample builderExample = BuilderExample
                .geBuilder()
                .setName("Alex ")
                .setSurName("Ivanov ")
                .setAge(22)
                .build();
        System.out.println(builderExample.getName()+builderExample.getSurName()+"Age is "+ builderExample.getAge());

        BuilderExample builderExample1 = BuilderExample
                .geBuilder()
                .setAge(23)
                .setName("Vasyl")
                .build();
        System.out.println(builderExample1.getName()+" Age is "+ builderExample1.getAge());

        BuilderExample builderExample3 = BuilderExample
                .geBuilder()
                .setVehicle("Volvo","White")
                .build();
        builderExample3.getCar().printCar();
        builderExample3.getColour().printColour();

    }

}
