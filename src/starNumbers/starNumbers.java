package starNumbers;
import java.util.*;
import java.lang.*;
import java.io.*;

public class starNumbers {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws IOException {
			//code
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T =Integer.parseInt(br.readLine());
		while(T>0){
			T--;
			int n= Integer.parseInt(br.readLine());
			String str= br.readLine();
			String[] inputArray = str.split(" ");
			int[] temp = new int[n];
			checkStarNumber(inputArray);
		}
		}
	
	static void checkStarNumber(String[] inputArray){
		int max=0;
		int tempmax=0;
		int j=0;
		StringBuilder sb =new StringBuilder("");
		sb.append(inputArray[inputArray.length-1]);
		for(int i=inputArray.length-2;i>0;i--){
			if(Integer.parseInt(inputArray[i])>Integer.parseInt(inputArray[i+1])){
				if(Integer.parseInt(inputArray[i])>max){
					max=Integer.parseInt(inputArray[i]);
					sb.append(" "+Integer.parseInt(inputArray[i]));
				}
			}
		}
		sb.reverse();
		System.out.println(sb);
		System.out.println(max);
	}

}
