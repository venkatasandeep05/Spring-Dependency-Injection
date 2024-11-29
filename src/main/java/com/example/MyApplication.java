package com.example;

import com.example.temp.Aeroplane;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

        //Instance variable intilization using setter method for xml based configuration
        Cycle cycle=(Cycle) context.getBean("cycle");
        System.out.println(cycle);

        //Instance Variable intilization using constructor for xml based configuration
        Auto auto=(Auto) context.getBean("auto");
        System.out.println(auto);

        //Using Application Context to perform Dependency Injection using component scan tag in spring.xml and @component annotation

        Train train= (Train) context.getBean("train");   //id for annotation based configuration is decaptilized of class name
        train.drive();

        //Depenedency Injection using component scan tag in spring.xml file in a sub package

        Aeroplane aeroplane=(Aeroplane) context.getBean("aeroplane");
        aeroplane.drive();

        //Dependency Injection using Autowired annotation
        Rikshaw rikshaw=(Rikshaw) context.getBean("rikshaw");
        System.out.println(rikshaw);

        //Dependency Injection using Pure Annotation based configuration
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung samsung=(Samsung) applicationContext.getBean(Samsung.class);
        samsung.config();
    }
}
