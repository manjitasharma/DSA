package largestElementAfterDigit;
import java.util.*;
import java.lang.*;
import java.io.*;

public class largestElementAfterDigit {

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
				String s= b.readLine();
				StringBuilder sb= new StringBuilder();
				String[] stringArray=s.split(" ");
				int notFound=0;
				for(int i=0;i<n-1;i++){
				    for(int j=i+1;j<n;j++){
				        if(Integer.parseInt(stringArray[i])<Integer.parseInt(stringArray[j])){
				            sb.append(stringArray[j]);
				            sb.append(" ");
				            notFound=0;
				            break;
				        }
				        else{
				            notFound=-1;
				        }
				    }
				    if(notFound==-1){
				        sb.append("-1 ");
				    }
				}
				sb.append("-1");
				System.out.println(sb.toString());
			}
		}

}
