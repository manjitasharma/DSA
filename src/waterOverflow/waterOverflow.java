package waterOverflow;
import java.util.*;
import java.lang.*;
import java.io.*;

public class waterOverflow {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws IOException {
			//code
		/*1
		11
		111
		1111
		11111*/
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		while(T>0){
			T--;
			String str= br.readLine();
			String str1= br.readLine();
			String str2= br.readLine();
			int glass=1;
			int remaining=0;
			int right=0;
			int left=0;
			int water = Integer.parseInt(str);
			int row= Integer.parseInt(str1);
			int col= Integer.parseInt(str2);
			for(int i=1;i<=row;i++){
				if(water<1){
					
				}
				water=water-glass;
				right=water/2;
				left=water/2;
				if(i-2>0){
					
				}
			}
		}
		
		}
}
