package chocolateStation;
import java.util.*;
import java.lang.*;
import java.io.*;

public class chocolateStation {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws IOException {
			//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T>0){
			T--;
			int n = Integer.parseInt(br.readLine());
			String str =br.readLine();
			String[] inputArray = str.split(" ");
			int cost =Integer.parseInt(br.readLine());
			//10 6 11 4 7 1
			

			int chocolate=1;
			int buy=1;
			for(int i=1;i<n;i++){
				int c1=Integer.parseInt(inputArray[i-1]);
				int c2 = Integer.parseInt(inputArray[i]);
				if(c1-c2>0){
					chocolate=chocolate+(c1-c2);
				}
				else{
					chocolate=chocolate+(c1-c2);
					if(chocolate<1){
						buy=buy+1;
						chocolate=1;;
					}
					
				}
			}
			int totalCost= buy*cost;
			System.out.println(totalCost);
		}
		}
}
