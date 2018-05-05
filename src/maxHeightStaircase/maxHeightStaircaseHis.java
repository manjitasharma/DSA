package maxHeightStaircase;
import java.util.*;
import java.lang.*;
import java.io.*;

public class maxHeightStaircaseHis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			int T;
			
				T = Integer.parseInt(b.readLine());
			
			while(T>0){
				T--;
				long num = Long.parseLong(b.readLine());
				int n = 0;
				while((n*(n+1))/2<num){
					n++;
				}
				if((n*(n+1))/2>num)
					n--;
				System.out.println(n);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	

}
