package d03;

public class Test{

	public static void main(String[] args){
		//int x = 3;
		//int y = 5; 
		Point p1 = new Point(3,5);

		int or = 2;
		//int ox = 1;
		//int oy = 1;
		Point p0 = new Point(1,1);
		
		isIn(p1,or,p0);

		
	}
        public static void isIn(Point p2,int or,Point p3){
		
		
		int d = (p2.x-p3.x)*(p2.x-p3.x)+(p2.y-p3.y)*(p2.y-p3.y);
		
		if(d < or*or){
			System.out.println("in");
		} 
		else{
			System.out.println("out");
		} 				
	}
}