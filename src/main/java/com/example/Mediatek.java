package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary   // default bean for the processor interface it can be used to override using qualifier
public class Mediatek implements Processor
{
    @Override
    public void process() {
        System.out.println("MediaTek processor");
    }
}
