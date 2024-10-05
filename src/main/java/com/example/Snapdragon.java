package com.example;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class Snapdragon implements Processor
{
    @Override
    public void process() {
        System.out.println("Snapdragon processor");
    }
}
