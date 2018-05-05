package intrestingPattern;
import java.util.*;
import java.lang.*;
import java.io.*;

public class intrestingPattern {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws IOException {
		//code
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			while(T>0){
				T--;
				String str = br.readLine();
				int n= Integer.parseInt(str);
				int i=0;
				int j=0;
				int size = 2*n-1;
				int num=n;
				
				while(i<n){
					num=n;
					int k=0;
					while(k<j){
						System.out.print(num);
						num--;
						k++;
					}
					int s= size-(2*j);
					k=0;
					while(k<s){
						System.out.print(num);
						k++;
					}
					k=0;
					num++;
					while(k<j){
						System.out.print(num);
						num++;
						k++;
					}
					System.out.println("");
					j++;
					i++;
				}
				j=n-2;
				while(i<size){
					num=n;
					int k=0;
					while(k<j){
						System.out.print(num);
						num--;
						k++;
					}
					int s= size-(2*j);
					k=0;
					while(k<s){
						System.out.print(num);
						k++;
					}
					k=0;
					num++;
					while(k<j){
						System.out.print(num);
						num++;
						k++;
					}
					System.out.println("");
					j--;
					i++;
				}
			}
		}

}
