package numberContaining123;
import java.util.*;
import java.lang.*;
import java.io.*;

public class numberContaining123 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		
			//code
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(b.readLine());
			while(T>0){
				T--;
				int flag=0;
				int n = Integer.parseInt(b.readLine());
				String s= b.readLine();
				String[] stringArray= s.split(" ");
			int[] inputArray=new int[n];
			ArrayList<Integer> outputArray = new ArrayList<Integer>();

			for(int i=0;i<n;i++){
			    inputArray[i]=Integer.parseInt(stringArray[i]);
			}
			int arrayLength=0;
			for(int i=0;i<n;i++){
				String number=String.valueOf(inputArray[i]);
			    if(number.contains("4") || number.contains("5") || number.contains("6") ||  number.contains("7") || number.contains("8") ||  number.contains("9") ||number.contains("0")){
			        continue;
			    }
			    else{
			    	outputArray.add(inputArray[i]);
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
