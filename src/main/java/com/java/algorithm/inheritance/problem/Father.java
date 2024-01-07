package com.java.algorithm.inheritance.problem;

public class Father {

	public String x;

    public Father() {
        this.init();
        System.out.println(this + " 1");
        System.out.println(this.x + " 2");
    }

    protected void init() {
        x = "Father";
    }

    public String toString() {
        return "I'm Father";
    }

    void ParentclassMethod(){

        System.out.println("Parent Class");
    }
}
