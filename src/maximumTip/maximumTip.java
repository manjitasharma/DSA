package maximumTip;
import java.util.*;
import java.lang.*;
import java.io.*;

public class maximumTip {

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
			String str= br.readLine();
			String[] inputArray= str.split(" ");
			int n= Integer.parseInt(inputArray[0]);
			int a= Integer.parseInt(inputArray[1]);
			int b= Integer.parseInt(inputArray[2]);
			String str1= br.readLine();
			String str2= br.readLine();
			String[] str1Array= str1.split(" ");
			for(int i=0;i<str1Array.length;i++){
				
			}
			
		}
		}
	class Tips{
		private int value;
		private int position;
		public Tips(int value , int position){
			this.value=value;
			this.position=position;
		}
		
	}
}


