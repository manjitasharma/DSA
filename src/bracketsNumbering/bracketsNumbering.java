package bracketsNumbering;
import java.util.*;
import java.lang.*;
import java.io.*;

public class bracketsNumbering {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
			//code
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(b.readLine());
			StringBuilder sb = null;
			StringBuilder sb1 = null;
			String temp="";
			while(T>0){
				T--;
				
			int bracketcount=0;
				String str = b.readLine();
				sb = new StringBuilder(str);
				sb = new StringBuilder();
				Stack<Integer> stck=new Stack();
				for(int i=0;i<str.length();i++){
				    if(str.charAt(i)=='('){
				    	bracketcount++;
				    	stck.push(bracketcount);
				        System.out.print(bracketcount+" ");
				    }
				    if(str.charAt(i)==')'){
				    	int bracketcount2=stck.pop();
				    	System.out.print(bracketcount2+" ");
				    }
				}
			}
		}
}
