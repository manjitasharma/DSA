package follwoingThePattern;
import java.util.*;
import java.lang.*;
import java.io.*;

public class followingThePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {

		//code
				BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(b.readLine());
			StringBuilder sb = null;
			StringBuilder sb1 = null;
			while(T>0){
				T--;
				int count=0;
				String str = b.readLine();
				sb = new StringBuilder("");
				int i=0;
				boolean flag=false;
				while(i<str.length()){
				    if(String.valueOf(str.charAt(i)).equals("D")){
				        int j=i;
				        int k=i;
				        int s=0;
				        sb1 = new StringBuilder("");
				        while(i<str.length() && String.valueOf(str.charAt(j)).equals("D")){
				           j++;
				           i++;
				           s++;
				        }
				        if(flag==true){
				        	count=count+s+1;
					        s=count;
					        while(k<j+1){
					            System.out.print(s+" ");
					            j--;
					            s--;
					        }
					        flag=false;
				        }
				        else {
				        	count=count+s+1;
					        s=count;
				        while(k<j+1){
				            System.out.print(s+" ");
				            j--;
				            s--;
				        }
				        }
				    }
				    else if(String.valueOf(str.charAt(i)).equals("I")){
				        int j=i;
				        int k=i;
				        sb1 = new StringBuilder("");
				        while(i<str.length() && String.valueOf(str.charAt(j)).equals("I")){
				           j++;
				           i++;
				        }
				        if(i<str.length() && String.valueOf(str.charAt(j+1)).equals("I")){
				        while(k<j){
				            count++;
				            System.out.print(count+" ");
				            k++;
				        }
				        if(i==str.length()){
				        	count=count+1;
				        	System.out.print(count+" ");
				        }
				        else{
				        /*int ii=count+2;
				        int jj=count+1;
				        System.out.print(ii+" "+jj+" ");*/
				        /*i++;
				        count=count+2;*/
				        	flag=true;
				        }
				        }
				        else{
				        	flag=true;
				        }
				    }
				}
				System.out.println("");
			}
		}
}
