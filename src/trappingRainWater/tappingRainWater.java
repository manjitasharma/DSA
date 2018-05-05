package trappingRainWater;
import java.util.*;
import java.lang.*;
import java.io.*;

public class tappingRainWater {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
			
			//code
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			int T= Integer.parseInt(br.readLine());
			while(T>0){
			    T--;
			    int n= Integer.parseInt(br.readLine());
			    String[] strArr= (br.readLine()).split(" ");
			    int[] arr= new int[n];
			    for(int i=0;i<n;i++){
			        arr[i]= Integer.parseInt(strArr[i]);
			    }
			    int[] left= new int[n];
			    int[] right= new int[n];
			    left[0]=arr[0];
			    for(int i=1;i<n;i++){
			        if(arr[i]>left[i-1]){
			            left[i]= arr[i];
			        }
			        else{
			            left[i]=left[i-1];
			    }
			}
			right[n-1]=arr[n-1];
			    for(int j=n-2;j>=0;j--){
			        if(arr[j]>right[j+1]){
			            right[j]= arr[j];
			        }
			        else{
			            right[j]= right[j+1];
			    }
			}
			int water= 0;
			for(int j=0;j<n;j++){
			    water=water+ Math.min(left[j],right[j]) - arr[j];
			}
			System.out.println(water);
			}
		}
}
