package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class MyApplication
{
    public static void main( String[] args )
    {
       //Without Dependency Injection
        Vehicle vehicle=new Bike();
        vehicle.drive();

        //Using BeanFactory to perform Dependency Injection
        BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("D:\\Spring-Dependency-Injection\\src\\main\\resources\\spring.xml"));
        Car car= (Car) beanFactory.getBean("car");
        car.drive();

        //Using Application Context to perform Dependency Injection
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Lorry lorry=(Lorry) context.getBean("lorry");
        lorry.drive();
    }
}
