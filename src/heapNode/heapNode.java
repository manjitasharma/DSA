package heapNode;

public class heapNode {

	/**
	 * @param args
	 */
	
	private int capacity= 10;
	private int size= 0;
	
	int[] items= new int[capacity];
	
	public int getLeftChild(int index){
		return ((2*index)+1);
	}
	
	public int getRightChild(int index){
		return ((2*index)+2);
	}
	
	public int getParent(int index){
		return ((index-1)/2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
