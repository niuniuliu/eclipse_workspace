package template;
public class Client{
	public static void main(String[] args){
		int[] intArray = {20,14,16,9,10,13,18};
		double[] dbArray = {20.50,20.43,20.88,20.45,20.72};
		IntBubbleSorter ibs = new IntBubbleSorter();
		ibs.sort(intArray);
		System.out.println("Int sorter");
		for(int i =0;i<intArray.length;i++)
			System.out.print(intArray[i]+",");
		System.out.println();
		DoubleBubbleSorter dbs = new DoubleBubbleSorter();
		dbs.sort(dbArray);
		System.out.println("Double sorter");
		for(int i =0;i<dbArray.length;i++)
			System.out.print(dbArray[i]+",");
		System.out.println();
	}
}

