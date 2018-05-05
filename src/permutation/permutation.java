package permutation;
import java.util.*;
import java.lang.*;
import java.io.*;

public class permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
			//code
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			int T= Integer.parseInt(br.readLine());
			while(T>0){
			    T--;
			    String str= br.readLine();
			    permute(str,0,str.length()-1);
			    System.out.println("");
			}
		    
		}
		
		public static void permute(String str , int l , int r){
		    if(l==r){
		        System.out.print(str+" ");
		    }
		    else{
		    for(int i=l;i<=r;i++){
		        str= swap(str,l,i);
		        permute(str,l+1,r);
		        str= swap(str,l,i);
		    }
		    }
		}
		
		public static String swap(String str , int i , int j){
		    char temp;
		    char[] charArr= str.toCharArray();
		    temp= charArr[i];
		    charArr[i]= charArr[j];
		    charArr[j]= temp;
		    return String.valueOf(charArr);
		}
}
