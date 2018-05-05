package reverseWords;
import java.util.*;
import java.lang.*;
import java.io.*;

public class reverseWordsHis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			int T;
			try {
				T = Integer.parseInt(b.readLine());
		
			StringBuilder sb = null;
			StringBuilder sb1 = null;
			while(T>0){
				T--;
				String str = b.readLine();
				sb = new StringBuilder(str);
				str = sb.reverse().toString();
				sb = new StringBuilder();
				for(int i=0;i<str.length();i++){
					int j = str.indexOf('.',i+1);
					if(j==-1)
						j= str.length();
					sb.append(new StringBuilder(str.substring(i, j)).reverse());
					i=j;
					if(j!=str.length())
					sb.append(".");
				}
				System.out.println(sb.toString());
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	

}
