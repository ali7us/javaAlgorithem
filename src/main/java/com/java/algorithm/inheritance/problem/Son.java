package com.java.algorithm.inheritance.problem;

public class Son extends Father {

	public String x;


    protected void init() {
        System.out.println("Init Called- [In-Son]");

        x = "Son";
    }

    public String toString() {
        return "I'm Son";
    }

    void ParentclassMethod(){
        super.ParentclassMethod();
        System.out.println("Child Class");
    }
    
}
