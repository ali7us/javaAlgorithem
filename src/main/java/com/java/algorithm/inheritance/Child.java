package com.java.algorithm.inheritance;

public class Child extends Parent {
 
    int value = 10;
 
    // Constructor of sub class
    Child()
    {
 
        // Print statement
        System.out.println("Child Constructor");
    }
    
    public void doMe() {
    	System.out.println("Print in Child...");
    }
}
