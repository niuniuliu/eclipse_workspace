package org.nitpro.intfback1;

import java.util.*;

public class StudentTest {
	public static void main(String[] args){
		Student s1 = new Student("Tom",17,"male",79);
		Student s2 = new Student("Kitty",17,"female",89);
		Student s3 = new Student("Tommy",17,"female",90);
		Student s4 = new Student("Tom",17,"male",79);
		
		StudentStore ss = new StudentStore();
		ss.addStudent(s1);
		ss.addStudent(s2);
		ss.addStudent(s3);
		ss.addStudent(s4);
		
		List ssList = ss.getStudent(new SexFilter());
		System.out.println(ssList);

	}
}
