package com.hariharan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //Alien obj = context.getBean(Alien.class);
        Alien obj = (Alien) context.getBean("alien");
        obj.code();

    }
}
