package com.hariharan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    private int age;
    //@Autowired // field injection
    //@Qualifier("com2")
    private Computer com;

    public Alien(){
        System.out.println("Alien Object Created");
    }

    //@Autowired // constructor injection
    /*@ConstructorProperties({"age", "lap"})
    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    }*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //System.out.println("setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired // setter injetion
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }

}
