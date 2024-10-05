package com.example;

import org.springframework.stereotype.Component;

@Component
public class Train implements Vehicle
{
    @Override
    public void drive() {
        System.out.println("Train started moving");
    }
}
