package columnNameFromGivenColumn;
import java.util.*;
import java.lang.*;
import java.io.*;

public class columnNameFromGivenColumnHis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			try{
			int T = Integer.parseInt(b.readLine());
			while(T>0){
				T--;
				long num = Long.parseLong(b.readLine());
				StringBuilder str = new StringBuilder();
				while(num>0){
					long rem = num%26;
					if(rem==0){
						rem = 26;
						num = num -1;
					}
					str.append((char)('A'+(rem-1)));
					num = num/26;
				}
				str= str.reverse();
				System.out.println(str.toString());
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

}
