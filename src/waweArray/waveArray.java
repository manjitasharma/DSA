package waweArray;
import java.util.*;
import java.lang.*;
import java.io.*;

public class waveArray {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
			//code
			
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(b.readLine());
			while(T>0)
			{
			    T--;
			    int n=Integer.parseInt(b.readLine());
			    int[] inputArray= new int[n];
			    String input=b.readLine();
			    String stringArray[]=input.split(" ");
			    int outputArray[]=new int[n];
			    StringBuilder sb=new StringBuilder("");
			    for(int i=0;i<n;i++)
			    {
			        inputArray[i]=Integer.parseInt(stringArray[i]);
			    }
			    Arrays.sort(inputArray);
			    outputArray = waveArray(inputArray,n);
			    for(int i=0;i<n;i++){
			        sb.append(outputArray[i]);
			        sb.append(" ");
			    }
			    System.out.println(sb.toString());
			}
			    
		}
		
		static int[] waveArray(int[] input , int n){
		    int[] output = new int[n];
		    int i=0;
		    while(i<n){
		        if(i==(n-1)){
		            output[i]=input[i];
		            i++;
		        }
		        else{
		        output[i]=input[i+1];
		        output[i+1]=input[i];
		        i=i+2;
		        }
		    }
		    return output;
		}

}
