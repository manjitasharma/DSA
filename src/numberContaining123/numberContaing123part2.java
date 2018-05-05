package numberContaining123;

import java.io.*;
import java.util.*;
import java.lang.*;

public class numberContaing123part2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		//code
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(b.readLine());
		while(T>0){
			T--;
			int n = Integer.parseInt(b.readLine());
			String s= b.readLine();
			String[] stringArray= s.split(" ");
		int[] inputArray=new int[n];
		ArrayList<Integer> outputArray = new ArrayList<Integer>();

		int arrayLength=0;
		for(int i=0;i<n;i++){
		    int input=Integer.parseInt(stringArray[i]);
		    int number=input;
		    int rem=0;
		    int flag=0;
		    while(number>0){
		    rem=number%10;
		    if(rem<1 || rem>3){
		        flag=0;
		        break;
		    }
		    else{
		        flag=1;
		        number=number/10;
		    }
		    
		}
		if(flag==1){
		    outputArray.add(input);
		    arrayLength++;
		}
		}
		
		
		        
		if(arrayLength!=0){
		Collections.sort(outputArray);
		    for(int j=0;j<arrayLength;j++){
		        System.out.print(outputArray.get(j));
		        System.out.print(" ");
		    }
		}
		else{
		    System.out.println("-1");
		}
		   
		
			
			
		}
	}

}
