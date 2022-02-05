package com.ex.builderExample;

public class BuilderExample {
    private String name;
    private String surName;
    private int age;
    private Vehicle car;
    private Vehicle colour;

    private BuilderExample(){}

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Vehicle getCar() {
        return car;
    }

    public Vehicle getColour() {
        return colour;
    }

    public static Builder geBuilder(){
        return new BuilderExample().new Builder();
    }

    public class Builder{
        private Builder(){
        }
        public Builder setName(String namE){
            name = namE;
            return this;
        }
        public Builder setSurName(String surNamE){
            surName = surNamE;
            return this;
        }
        public Builder setAge(int agE){
            age = agE;
            return this;
        }
        public Builder setVehicle(String caR, String colouR){
            car = new Vehicle(caR, colouR);
            colour = new Vehicle(caR,colouR);
            return this;
        }

        public BuilderExample build(){
            return BuilderExample.this;
        }

    }
}
