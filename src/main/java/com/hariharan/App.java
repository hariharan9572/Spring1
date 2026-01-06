package com.hariharan;

import com.hariharan.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();

        /*Desktop dt = context.getBean(Desktop.class);
        dt.compile();

        Desktop dt1 = context.getBean(Desktop.class);
        dt.compile();*/

        /*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //object created in this line
        //Alien obj = context.getBean(Alien.class);
        //Alien obj1 = (Alien) context.getBean("alien1");

        Alien obj1 = context.getBean("alien1", Alien.class);

        //obj1.setAge(23);
        System.out.println(obj1.getAge());
        obj1.code();*/

        /*Alien obj2 = (Alien) context.getBean("alien1");
        System.out.println(obj2.age);
        //obj2.code();*/

        //Computer com = context.getBean(Computer.class);

        //Desktop obj = (Desktop) context.getBean("com2");
        //Desktop obj = context.getBean(Desktop.class);
    }
}
