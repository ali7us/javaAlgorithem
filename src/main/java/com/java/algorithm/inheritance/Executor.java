package com.java.algorithm.inheritance;

public class Executor {

	public static void main(String[] args) {
		// Creating an object of sub class inside main()
        // method
        Child obj = new Child();
 
        // Printing the reference of child type
        System.out.println("Reference of Child Type :"
                           + obj.value);
 
        // Note that doing "Parent par = new Child()"
        // would produce same result
        Parent par = obj;
 
        // Par holding obj will access the value
        // variable of parent class
 
        // Printing the reference of parent type
        System.out.println("Reference of Parent Type : "
                           + par.value);
        
        Parent dd = new Child();
        System.out.println("DD = " + dd.value);
        dd.doMe();
        obj.doMe();
        par.doMe();
        
        Parent pp = new Parent();
        pp.doMe();
        
        
    }
}
