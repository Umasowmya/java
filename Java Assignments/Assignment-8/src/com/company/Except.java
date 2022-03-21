package com.company;

public class Except {
    public void method1() throws Except1,Except2,Except3{
            throw new Except2("my message");
    }
}
