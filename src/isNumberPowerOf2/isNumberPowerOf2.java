package isNumberPowerOf2;
import java.util.*;
import java.lang.*;
import java.io.*;

public class isNumberPowerOf2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {

		//code
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(b.readLine());
			while(T>0){
				T--;
				int n = Integer.parseInt(b.readLine());
				int rem=0;
				String output=null;
				if(n==1){
					output="YES";
					System.out.println(output);
				}
				else if(n==0){
					output="NO";
					System.out.println(output);
				}
				else{
				while(n>1){
				    rem=n%2;
				    if(rem!=0){
				        output="NO";
				        break;
				    }
				    else{
				    	output="YES";
				        n=n/2;
				    }
				}
				if(output.equals("NO")){
				    System.out.println(output);
				}
				else{
				    output="YES";
				    System.out.println(output);
				}
				}
			}
		}

}
