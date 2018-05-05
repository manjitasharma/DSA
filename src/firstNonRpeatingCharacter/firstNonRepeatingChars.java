package firstNonRpeatingCharacter;
import java.util.*;
import java.lang.*;
import java.io.*;

public class firstNonRepeatingChars {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
	
			//code
				BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(b.readLine());
			while(T>0){
				T--;
				String count = "-1";
				int n = Integer.parseInt(b.readLine());
				String s = b.readLine();
				String subs=null;
				String output=null;
				for(int i=0;i<n;i++){
				    /*j=i+1;
				    while(j<n){
				    if(s.charAt[i]){
				        
				        
				    }
				}*/
				subs=s.substring(0,i)+s.substring(i+1,n);
				if(subs.contains(String.valueOf(s.charAt(i)))){
				    continue;
				}
				else{
				    output=String.valueOf(s.charAt(i));
				    break;
				}
				}
				if(output==null){
				    System.out.println("-1");
				}
				else{
				    System.out.println(output);
				}
				
			}
		}

}
