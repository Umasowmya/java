package com.company;

public class Main {

    public static void main(String[] args) {
                Except e;
	        try{
                    e = new Except();
                    e.method1();
                }

            catch(Throwable p){
                System.out.println(p);
                System.out.println("exception found");
            }

            finally{
                System.out.println("finally block is executing");
            }
    }


}
