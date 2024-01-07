package com.java.algorithm.generics.sorting;

public class GenericWorking {

	public static void main(String[] args) {
		Test<String> str = new Test<>("String value");
		System.out.println(str.getObject());

		Test<Integer> ing = new Test<>(15);
		System.out.println(ing.getObject());
	}
}


class Test<T> {
	T obj;
	public Test(T obj) {
		this.obj = obj;
	}
	public T getObject() { return this.obj;} 
}