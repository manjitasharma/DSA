package steppingNumber;
import java.util.*;
import java.lang.*;
import java.io.*;

public class steppingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		
			//code
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T= Integer.parseInt(br.readLine());
			while(T>0){
			    T--;
			    String[] inputArray= br.readLine().split(" ");
			    int n1= Integer.parseInt(inputArray[0]);
			    int n2= Integer.parseInt(inputArray[1]);
			    findSteppingNumber(n1,n2);
			}
		}
		
		static void findSteppingNumber(int n1 , int n2){
		    
		    int count=0;
		    if(n1==0 && n2==0){
		        System.out.println("0");
		        return;
		    }
		    if(n1>n2){
		        System.out.println("0");
		        return;
		    }
		    if(n1!=0 & n2==0){
		        System.out.println("0");
		        return;
		    }
		    
		    if(n2<9){
		        System.out.println(n2-n1+1);
		        return;
		    }
		    else{
		        if(n1==0){
		        count = 10;
		        }
		        else{
		            count= 9-n1;
		        }
		       int first1=n1;
		       int first2=n1;
		       int c2=0;
		       while(first1>0){
		           first1=first1/10;
		           first2=first1/10;
		           c2++;
		       }
		       while(c2>0){
		       first2=first2*10;
		       c2--;
		       }
		       int num1=n2;
		       int num2=n2;
		       int c1=0;
		       while(num1>0){
		    	   num2=num1;
		           num1=num1/10;
		           c1++;
		       }
		       num2++;
		       c1--;
		       while(c1>0){
		       num2=num2*10;
		       c1--;
		       }
		       if(first2==0){
		    	   first2=1;
		       }
		       for(int i=first2;i<num2;i++){
		           StringBuilder sb = new StringBuilder("");
		       sb.append(i-1);
		       sb.append(i);
		       if(Integer.parseInt(sb.toString())>=n1 && Integer.parseInt(sb.toString())<= n2){
		           count++;
		       }
		       StringBuilder sb1 = new StringBuilder("");
		       sb1.append(i);
		       sb1.append(i+1);
		       if(Integer.parseInt(sb1.toString())>=n1 && Integer.parseInt(sb1.toString())<= n2){
		           count++;
		       }
		       }
		       
		    }
		    System.out.println(count-1);
		}
}
