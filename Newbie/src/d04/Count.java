public class Count{
	private int serialNumber;

	public static int counter;

	{
		System.out.println("static自由块被执行");
		counter = 1;
	}

	public static int getTotalCount(){
		return counter;
	}
	
	public Count(){
		counter++;
		serialNumber = counter;
	}

	public static void main(String[] args){
		System.out.println("main() invoke");
		System.out.println("counter=" + Count.counter);
		System.out.println("counter=" + Count.counter);
	}
		
}