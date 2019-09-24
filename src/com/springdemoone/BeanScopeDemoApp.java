package com.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they ar the same
        System.out.println("\nPointing to the same object: " + (coach == alphaCoach));
        System.out.println("\nMemory location for coach: " + coach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        // close the context
        context.close();
    }
}
