package smallestSubArrayWithSumGreaterThnK;

import java.util.*;
import java.lang.*;
import java.io.*;

public class smallestSubArrayGreaterThnK {

	
	public static void main(String[] args) {
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int T=0;
		try{
		    
			    T = Integer.parseInt(b.readLine());
			}catch(IOException e){
	  e.printStackTrace();
			}
			StringBuilder sb = null;
			StringBuilder sb1 = null;
			int n=0;
			int k=0;
			String input;
			int output=0;
			String nk;
			/*String[] inputArray=new String[T];*/
			while(T>0){
				T--;
				try{
				        nk=b.readLine();
				        String[] in = nk.split("\\s+");
					    n = Integer.parseInt(in[0]);
					    k= Integer.parseInt(in[1]);
					    input = b.readLine();
					    output= findSmallestArray(input,n,k);
					    System.out.println(output);
					   } catch(IOException e){
	  e.printStackTrace();
					    }
					    
					    
			}

					    

		}
		
		static int findSmallestArray(String input, int n , int k){
		    int minDiff=k;
		    int minDiffPlace=0;
		    int diff=0;
		    int sum;
		     String[] stringArray = input.split("\\s+");
		     int[] inputArray = new int[n];
	      for (int i = 0; i < n; i++) {
	         String numberAsString = stringArray[i];
	         inputArray[i] = Integer.parseInt(numberAsString);
		         if(inputArray[i]>k){
	             System.out.println("1st condition : "+inputArray[i]+" k "+k);
	            return 1;
		         }
		         else{
		             
		             diff=k-inputArray[i];
	System.out.println("2nd condition : "+inputArray[i]+" k "+k+" diff "+diff+" min diff "+minDiff);
	                 if(diff<minDiff){
		                 minDiff=diff;
		                 minDiffPlace=i;
		             }
		             
		         }
		     }
		     int j=minDiffPlace-1;
		     
		     int sum1=inputArray[minDiffPlace];
		     int sum2=inputArray[minDiffPlace];
		     int count=1;
		     int i=minDiffPlace+1;
		     int place=0;
		     int direction=0;
		         sum1=sum1+inputArray[minDiffPlace+1];
		         sum2=sum2+inputArray[minDiffPlace-1];
		         System.out.println("j : "+j+" sum 1 "+sum1+" sum2  "+sum2+" i "+i+" minDiffPlace "+minDiffPlace+" minDiff "+minDiff);
	          count++;
		         if(sum1>k||sum2>k){
	              System.out.println("in or : "+count);
		             return count;
		             
		         }
		         else if((sum1+sum2-inputArray[minDiffPlace])>k){
		             return 3;
		         }
		         else if(sum1>sum2){
		             place=i+1;
		             direction=1;
		             
		         }
		         else if(sum1<sum2){
		             place=j-1;
		             direction=0;
		         }
		         if(direction==1){
		             sum=sum1;
		             System.out.println("in dir 1 : "+count+" "+sum+" "+sum1+" place "+place);
		            for(int z=place;z<n;z++) {
		                sum=sum+inputArray[z];
		                count++;
		                if(sum>k){
		                    return count;
		                }
		            }
		         }
		         else if(direction==0){
		              sum=sum2;
		              place=minDiffPlace-1;
		              System.out.println("in dir 0 : "+count+" "+sum+" "+sum2+" place "+place);
		            for(int z=place;z>0;z--) {
		                sum=sum+inputArray[z];
		                count++;
		                if(sum>k){
		                    return count;
		                }
		            }
		         }
		         
		         return count;
		     }
		     
		
	

}
