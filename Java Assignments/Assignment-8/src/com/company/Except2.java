package com.company;
public class Except2 extends Throwable{
    String desc2;
    Except2(String str){
        desc2=str;
    }

    public String toString(){
        return desc2;
    }
}
