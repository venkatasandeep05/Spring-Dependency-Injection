package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung
{
    @Autowired
    @Qualifier(value = "snapdragon")  // qualifier to get bean of specific chils class of processor interface
    private Processor processor;

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void config()
    {
        System.out.println("8GB RAM "+"128GB ROM "+"72MP Camera");
        processor.process();
    }
    @Override
    public String toString() {
        return "Samsung{" +
                "processor=" + processor +
                '}';
    }
}
