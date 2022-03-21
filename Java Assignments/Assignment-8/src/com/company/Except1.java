package com.company;
import java.io.*;
import java.util.Scanner;

public class Except1 extends Throwable{
    String desc2;
    Except1(String str){
        desc2=str;
    }

    public String toString(){
        return desc2;
    }
}
