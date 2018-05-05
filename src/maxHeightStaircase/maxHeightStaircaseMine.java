package maxHeightStaircase;
import java.util.*;
import java.lang.*;
import java.io.*;

public class maxHeightStaircaseMine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			//code
			
				Scanner reader = new Scanner(System.in);  
	    /*System.out.println("Enter a number of Test cases: ");*/
	int t = reader.nextInt();
	int[] inputArray= new int[t];
	int[] outputArray =new int[t];
	for(int i=0;i<t;i++){
	        /*System.out.println("Enter inputs: ");*/
	        inputArray[i] = reader.nextInt();

	}
	for(int i=0;i<t;i++){
	    outputArray[i] = maxHeight(inputArray[i]);
		
		System.out.println(outputArray[i]);
	}
		}
		
		static  int maxHeight(int input){
			int steps=1;
			while(input!=0 && input>=steps){
			   input=input-steps;
			steps++;
			}
			return steps;
			
		}
	

}
