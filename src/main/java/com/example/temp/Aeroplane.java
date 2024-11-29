package com.example.temp;

import com.example.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Aeroplane implements Vehicle
{
    @Override
    public void drive() {
        System.out.println("Aeroplane started");
    }
}
