/*
Create three new types of exceptions. Write a class with a method that throws all three. 
In main( ), call the method but only use a single catch clause that will catch all three types of exceptions. Add a finally clause and 
verify that your finally clause is executed, even if a NullPointerException is thrown.

*/

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
