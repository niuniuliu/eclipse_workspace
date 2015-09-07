package org.nitpro.intfback1;

public class SexFilter implements Filter {

	public boolean matches(Object obj) {
		if(obj instanceof Student){
			Student stu = (Student)obj;
			return "female" == stu.getSex();
		}else
			return false;
	}

}
