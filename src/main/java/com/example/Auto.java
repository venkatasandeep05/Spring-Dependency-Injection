package com.example;

public class Auto implements Vehicle
{
    private String brand;
    private String location;

    public Auto(String brand, String location) {
        this.brand = brand;
        this.location = location;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void drive() {
        System.out.println("Auto started moving");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
