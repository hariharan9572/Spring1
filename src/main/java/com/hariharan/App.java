package com.hariharan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //object created in this line
        //Alien obj = context.getBean(Alien.class);
        Alien obj1 = (Alien) context.getBean("alien1");
        obj1.code();

        Alien obj2 = (Alien) context.getBean("alien1");
        obj2.code();

    }
}
