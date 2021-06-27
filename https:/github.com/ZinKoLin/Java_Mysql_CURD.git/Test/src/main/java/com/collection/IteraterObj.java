package com.collection;

import java.util.*;

class Person{
	
	private int id;
	private String name;
	private int age;
	
	
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class IteraterObj {
	
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		
		people.add(new Person(1, "Mg Mg", 14));
		people.add(new Person(2, "Gone Girl", 47));
		people.add(new Person(3, "Zun Ag", 34));
		
		
		Iterator<Person> it = people.iterator();
		
		while(it.hasNext()) {
			Person person = it.next();
			if(person.getId()==1) {
				person.setName("Mg Mg");
			}
		}
		
		
		for(Person person: people) {
			System.out.println(person.getName());
		}
		
		
	}
	
	

}
