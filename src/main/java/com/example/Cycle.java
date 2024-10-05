package com.example;

public class Cycle implements Vehicle
{
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void drive() {
        System.out.println("Cycle started moving");
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
