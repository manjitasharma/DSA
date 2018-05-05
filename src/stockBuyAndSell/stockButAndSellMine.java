package stockBuyAndSell;
import java.util.*;
import java.lang.*;
import java.io.*;

public class stockButAndSellMine {

	public static void main(String[] args) {
	
			//code
				BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		try{
			int T = Integer.parseInt(b.readLine());
			int n=0;
			String input;
			String output;
			while(T>0){
				T--;
				n = Integer.parseInt(b.readLine());
				int[] inputArray= new int[n];
				input = b.readLine();
				 String[] stringArray = input.split("\\s+");
	             for (int i = 0; i < n; i++) {
	         String numberAsString = stringArray[i];
	         inputArray[i] = Integer.parseInt(numberAsString);
	             }
	             output = maxProfit(inputArray,n);
	             System.out.println(output);
			}
		}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		static String maxProfit(int[] input, int n){
		    int i=0;
		    int j=0;
		    int start=0;
		    StringBuilder sb= new StringBuilder("");
		    while(i<n){
		        while(i<n){
		        if(input[i+1]>input[i]){
		            /*sb.append("(");
		            sb.append(input[i]);
		            sb.append(" ");*/
		        	start=input[i];
		            j++;
		            i++;
		            break;
		            
		        }
		        else if(input[i+1]<=input[i]){
		            i++;
		            continue;
		        }
		        }
		        while(i<n){
		        	if(i==(n-1)){
		        		 if(input[i-1]<input[i]){
		        			 
		        			 sb.append("(");
		 		            sb.append(start);
		 		            sb.append(" ");
		 		            
		 		            sb.append(input[i]);
		 		            sb.append(")");
		 		            sb.append(" ");
		 		            i++;
		 		            j++;
		 		            break;
		 		        }
		        		 else{
		        			 i++;
		        			 j++;
		        		 }
		        	}
		        	else{
		        if(input[i+1]<=input[i]){
		        	
		        	sb.append("(");
		            sb.append(start);
		            sb.append(" ");
		            
		            sb.append(input[i]);
		            sb.append(")");
		            sb.append(" ");
		            i++;
		            j++;
		            break;
		        }
		        else if(input[i+1]>input[i]){
		            i++;
		            continue;
		        }
		        
		        }
		        	
		    }
		    }
		    if(sb.toString().isEmpty()||sb.toString().equals(null)){
		        return "No Profit";
		    }
		    else{
		        return sb.toString();
		    }
		    }

}
