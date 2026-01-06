package com.hariharan;

import org.springframework.stereotype.Component;

@Component("com2")
public class Desktop implements Computer{

    public Desktop(){
        System.out.println("Desktop Object Created..");
    }

    @Override
    public void compile(){
        System.out.println("compiling using Desktop");
    }
}
