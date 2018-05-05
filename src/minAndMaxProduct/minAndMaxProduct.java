package minAndMaxProduct;
import java.util.*;
import java.lang.*;
import java.io.*;

public class minAndMaxProduct {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws IOException {
			//code
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		while(T>0){
			T--;
			int size= Integer.parseInt(br.readLine());
			String str= br.readLine();
			String[] inputArray= str.split(" ");
			int[] arr= new int[inputArray.length];
			for(int i=0;i<inputArray.length;i++){
				arr[i]=Integer.parseInt(inputArray[i]);
			}
			int maxProduct=1;
			int negCount=0;
			int temp=1;
			int minNegCount=0;
			int minProduct=1;
			int minTemp=1;
			boolean negFoundFlag=false;
			boolean minFound=false;
			Arrays.sort(arr);
			for(int i=0;i<arr.length;i++){
				if(arr[i]>0){
					maxProduct= arr[i]*maxProduct;
					if(negFoundFlag==true){
						minProduct= arr[i]*minProduct;
					}
					else if(negFoundFlag==false && minFound==false && arr[i]>0){
						minProduct= arr[i];
						minFound=true;
					}
				}
				if(arr[i]==0 && negFoundFlag==false){
					minProduct=0;
					minFound=true;
				}
				if(arr[i]<0 ){
					negCount++;
					minNegCount++;
					if(negCount%2!=0){
						temp=arr[i];
					}
					else{
						maxProduct= arr[i]*temp*maxProduct;
					}
					if(minNegCount==1){
						negFoundFlag=true;
					}
					if(minNegCount%2!=0){
						minProduct= arr[i]*minTemp*minProduct;
					}
					else{
						minTemp=arr[i];
					}
					
					
				}
			}
			System.out.println(maxProduct+" "+minProduct);
		}
		}

}
