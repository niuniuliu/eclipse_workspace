package template;
public class DoubleBubbleSorter extends BubbleSorter{
	private double[] array;
	public int sort(double[] array){
		this.array= array;
		length = array.length;
		return doSort();
	}
	protected void swap(int index){
		double temp = array[index];
		array[index]=array[index+1];
		array[index+1]=temp;
	}
	 protected boolean outOfOrder(int index){
	 	return array[index]>array[index+1];
	}
}
