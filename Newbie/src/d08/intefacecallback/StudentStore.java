package org.nitpro.intfback1;

import java.util.ArrayList;
import java.util.List;

public class StudentStore {
	List studentList = new ArrayList();
	
	public void addStudent(Student stu){
		studentList.add(stu);
	}
	
	public List getStudent(Filter filter){
		List showStudent = new ArrayList();
		for(int i=0;i<studentList.size();i++){
			Student stu = (Student)studentList.get(i);
			boolean flag = filter.matches(stu);
			if(flag){
				showStudent.add(stu);
			}
		}
		return showStudent;
	}

}
