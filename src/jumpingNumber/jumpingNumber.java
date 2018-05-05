package jumpingNumber;
import java.util.*;
import java.lang.*;
import java.io.*;

public class jumpingNumber {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	
		public static void main (String[] args) throws  IOException {
			//code
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int T=Integer.parseInt(br.readLine());
			while(T>0){
				T--;
				String str= br.readLine();
				int i=0;
				int prev=0;
				int next=0;
				int current=0;
				while(i<Character.getNumericValue(str.charAt(0))){
					System.out.print(i+" ");
					if(i!=0){
						prev=i-1;
						next=i+1;
						String s= String.valueOf(i)+String.valueOf(prev);
						System.out.print(s+" "+i+next+" ");
					}
					i++;
				}
				if(i-1<Character.getNumericValue(str.charAt(1))){
					String s= String.valueOf(i)+String.valueOf(i-1);
					System.out.print(i+" ");
					System.out.print(s+" ");
				}
				if(Character.getNumericValue(str.charAt(1))==i+1){
					String s = String.valueOf(i)+String.valueOf(i+1);
					System.out.print(s+" ");
				}
				i++;
				if(str.length()!=1){
					while(i<=9){
						System.out.print(i+" ");
						i++;
					}
				}
			}
		}
}
