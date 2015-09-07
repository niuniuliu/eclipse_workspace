package org.nitpro.util;

public class Dog implements Comparable {
	int age;
	String name;
	public Dog(int age1) {
		this.age = age1;
	}
	
	public Dog(int age1,String name1){
		this.age = age1;
		this.name = name1;
	}

	public void enjoy(){
		System.out.println("狗叫声。。。");
	}
	
	public String toString(){
		return age + "岁" + name;
	}
		
	public boolean equals(Object obj){
		if(obj instanceof Dog){
			Dog dog = (Dog)obj;
			return dog.age == age;
		}
		else 
			return false;
	}
	
	public int compareTo(Object obj){
		Dog dog = (Dog)obj;
		return this.name.compareTo(dog.name);
	}
	
	public int hashCode(){
		return age;
	}
}
