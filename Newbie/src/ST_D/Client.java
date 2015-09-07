package demo;

public class Client {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("Word");
			 
			
			Office o = (Office)c.newInstance();
			o.start();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
