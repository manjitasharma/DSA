package secondRepetedString;
import java.util.*;
import java.lang.*;
import java.io.*;

public class secondRepetedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
			//code
			try{
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(b.readLine());
			StringBuilder sb = null;
			StringBuilder sb1 = null;
			while(T>0){
				T--;
				int n = Integer.parseInt(b.readLine());
				String input = b.readLine();
				
				/*sb = new StringBuilder(str);*/
				 String[] stringArray = input.split("\\s+");
				 Arrays.sort(stringArray);
				 int[] outputArray=new int[n];  
				 int j=0;
				 int count=1;
				 int maxCount=0;
				 int secondMaxCount=0;
				 int z=0;
				 int[] countArray = new int[n];
				 Map<String,Integer> map = new TreeMap<String,Integer>();

				 while(j<n){
				 for(int i=j+1;i<n;i++){
				     if(stringArray[j].equals(stringArray[i])){
				         count++;
			                System.out.println("in count increasing count "+count+" stringArray[j] "+stringArray[j]+" i "+i+" j "+j);
			                if(i==(n-1)){
			                	map.put(stringArray[j],count);
						         System.out.println("in i==ni-1 coundition "+count+" stringArray[j] "+stringArray[j]);
						         j=j+count;
						         count=1;
						         
						         System.out.println("in i=n-1 condition 2nd part count "+count+" j "+j);
			                }

				     }
				     else{
				         map.put(stringArray[j],count);
				         System.out.println("in else condition "+count+" stringArray[j] "+stringArray[j]);
				         j=j+count;
				         count=1;
				         
				         System.out.println("in else condition 2nd part count "+count+" j "+j);
				         break;
				     }
				 }
				   }
				  Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();
				String outputString=null;
				String highestCountString=null;
				while(it.hasNext()){
					Map.Entry<String, Integer> entry = it.next();
					int val = entry.getValue();
					if( val > maxCount) {
		                secondMaxCount = maxCount;
		                maxCount=val;
		                outputString=highestCountString;
		                highestCountString=entry.getKey();
		                System.out.println("val "+val+" maxCount "+maxCount+" second max "+secondMaxCount+" highStr "+highestCountString+" outputStr "+outputString);
					}
					else if(val>secondMaxCount && val<maxCount){
					    secondMaxCount=val;
					    outputString=entry.getKey();
		                System.out.println("val "+val+" maxCount "+maxCount+" second max "+secondMaxCount+" outputStr "+outputString);

					}
				}

	        System.out.println(outputString);
	            
				
			}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

}
