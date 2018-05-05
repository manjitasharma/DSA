package smallestPositiveInt;
import java.util.*;
import java.lang.*;
import java.io.*;

public class smallesPossibleInteger {

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
			String s=b.readLine();
			String[] stringArray=s.split(" ");
			ArrayList<Integer> inputArray=new ArrayList<Integer>();
			int min=1;
			int j=0;
			for(int i=0;i<n;i++){
				if(Integer.parseInt(stringArray[i])>0){
					inputArray.add(Integer.parseInt(stringArray[i]));
					j++;
				}
			}
			Collections.sort(inputArray);
			int output=0;
			int k=0;
			while(k<j){
				if(k==0){
					min=min;
				}
				else{
					if(inputArray.get(k-1)==inputArray.get(k)){
						min=min;
					}
					else{ 
						min++;
						}
				}
				if(inputArray.get(k)==min){
					k++;
				}
				else{
					output=min;
					break;
				}
				output=min;

			}

			System.out.println(output);


		}
	}
}
