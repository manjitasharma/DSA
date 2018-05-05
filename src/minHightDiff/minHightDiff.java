package minHightDiff;
import java.util.*;
import java.lang.*;
import java.io.*;

public class minHightDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
			//code
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(b.readLine());
		while(T>0){
			T--;
			int k = Integer.parseInt(b.readLine());
			int n= Integer.parseInt(b.readLine());
			String s = b.readLine();
			String[] stringArray= s.split(" ");
			int max=0;
			int min=500;
			/*for(int i=0;i<n;i++){
			    if(Integer.parseInt(stringArray[i])<min){
			        min=Integer.parseInt(stringArray[i]);
			    }
			    if(Integer.parseInt(stringArray[i])>max){
			        max=Integer.parseInt(stringArray[i]);
			    }
			}*/
			int[] inputArray=new int[n];
			for(int i=0;i<n;i++){
				inputArray[i]=Integer.parseInt(stringArray[i]);
			}
			Arrays.sort(inputArray);
			for(int i=0;i<n;i++){
				if(i==0){
				    if(inputArray[i]+k>inputArray[n-1]-k){
				        max=inputArray[i]+k;
				    }
				    else{
					min=inputArray[i]+k;
				    }
				}
				else if(i==(n-1)){
				    if(inputArray[i]-k<inputArray[0]+k){
				        min=inputArray[i]-k;
				    }
				    else{
					max=inputArray[i]-k;
				    }
				}
				else{
					if(inputArray[i]-k<min){
						min=inputArray[i]-k;
					}
				}
			}
		
			int minDiff=max-min;
			System.out.println(minDiff);
		}
	}
}
