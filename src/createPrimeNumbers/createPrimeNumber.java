package createPrimeNumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class createPrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int[] arr= new int[n];
		Arrays.fill(arr, 1);
		arr[0]=arr[1]= 0;
		for(int i=2;i<n;i++){
				if(arr[i]!=0){
					System.out.print(i+" ");
					if(i!=(n-1)){
					for(int j=1;i*j<n;j++){
						arr[i*j]=0;
					}
					}
				}
			
		}
		System.out.println(" ");
		
	}

}
