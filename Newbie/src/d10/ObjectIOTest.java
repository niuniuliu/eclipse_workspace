package org.nitpro.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOTest {

	/**
	 * @param args
	 */
	public void testOOS() throws Exception {		
		 FileOutputStream fos = new FileOutputStream("d:/student.dat");
		 ObjectOutputStream oos = new ObjectOutputStream(fos); 
		 Student stu = new Student("oracle",12);
		 oos.writeObject(stu);
		 oos.close();
		 
	}

	public void testOIS() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"d:/student.dat"));
		Student stu = (Student) ois.readObject();
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
		ois.close();

	}

	public static void main(String[] args) throws Exception {
		ObjectIOTest test = new ObjectIOTest();
		test.testOOS();
		test.testOIS();
	}
}
