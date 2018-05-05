package checkEqualArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class checkArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int T;
		try {
			T = Integer.parseInt(b.readLine());
	
			int checkStatus = 0;
		while(T>0){
			T--;
			int n = Integer.parseInt(b.readLine());
            int[] inputArray1 = new int[n];
            int[] inputArray2 = new int[n];
            String input1 = b.readLine();
            String input2 =b.readLine();
            String[] stringArray1 = input1.split("\\s+");
            String[] stringArray2 = input2.split("\\s+");
             for (int i = 0; i < n; i++) {
         String numberAsString1 = stringArray1[i];
         inputArray1[i] = Integer.parseInt(numberAsString1);
         String numberAsString2 = stringArray2[i];
         inputArray2[i] = Integer.parseInt(numberAsString2);
             }
          checkStatus = checkEqual(inputArray1,inputArray2);
          System.out.println(checkStatus);
		    
		}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static int checkEqual(int[] inputArray1, int[] inputArray2){
		
		Arrays.sort(inputArray1);
	    Arrays.sort(inputArray2);
	    for(int i=0;i<inputArray1.length;i++){
	        if(inputArray1[i]!=inputArray2[i]){
	            return 0;
	        }
	    }
	  return 1;
	}

}
