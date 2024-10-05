package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rikshaw implements Vehicle
{
    @Autowired
    private Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    @Override
    public void drive() {
        System.out.println("Rikshaw started moving");
    }

    @Override
    public String toString() {
        return "Rikshaw{" +
                "tyre=" + tyre +
                '}';
    }
}
