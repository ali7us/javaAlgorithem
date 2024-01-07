package com.java.algorithm.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplixateInList {

	public static void main(String[] args) 
	{
		List<Person> personList = new ArrayList<>(
				Arrays.asList(
						new Person("Syed", "Haider", 500000),
						new Person("Arif", "Mohd", 40000),
						new Person("Khan", "Lala", 70000),
						new Person("Saeed", "Khan", 60000),
						new Person("Khan", "Lala", 70000)
						));
		
		personList.stream().forEach(e-> System.out.print(e.getfName()+ ", "));
		System.out.println("");
		List<Person> newPerson = removeDuplicate(personList);
		newPerson.stream().forEach(e-> System.out.print(e.getfName()+ ", "));
	}
	
	/**
	 * Using new list
	 * @param <E>
	 * @param list
	 * @return
	 */
	public static <E> List<E> removeDuplicate(List<E> list) 
	{
		List<E> ls = new ArrayList<>();

		for(int i = 0; i<list.size(); i++) 
		{
			if(!ls.contains(list.get(i))) {
				ls.add(list.get(i));
			}
		}
		return ls;
	}
	
	/**
	 * Using Set
	 * @param <T>
	 * @param lst
	 * @return
	 */
	public static <T> List<T> removeDuplicateList(List<T> lst) {
		Set<T> sets = new HashSet<>(lst);
		lst.clear();
		lst.addAll(sets);
		return lst;
	}
	
	/**
	 * using java 8 Stream.
	 * @param <T>
	 * @param lst
	 * @return
	 */
	public static <T> List<T> removeDuplicateJava8(List<T> lst) {
		return lst.stream().distinct().collect(Collectors.toList());
	}
	
}
