package closestPalindrome;
import java.util.*;
import java.lang.*;
import java.io.*;

public class closestPalindrome {

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
			    int mid=0;
			    String palindrome= null;
			    
			    if(str.length()==1){
			       int intNumber= Integer.parseInt(str.trim())-1;
			       palindrome= String.valueOf(intNumber);
			    }
			    else if(str.length()==2){
			        palindrome= getClosestNumber(str,0,1);
			    }
			    else{
			    if(str.length()%2==0){
			        mid= str.length()/2 +1;
			    }
			    else{
			        mid= str.length()+1/2;
			    }
			    
			    Stack<Character> stk= new Stack<Character>();
			    if(str.length()%2==0){
			    	 for(int i=0;i<mid-1;i++){
					        stk.push(str.charAt(i));
					    }
			    }
			    else{
			    	for(int i=0;i<mid-2;i++){
				        stk.push(str.charAt(i));
				    }
			    }
			   int first=0;
			    int second=0;
			    int i_count=0;
			    boolean alreadyPalindrome=true;
			    for(int i=mid-1;i<str.length();i++){
			        char number= stk.pop();
			        
			        if(number!=str.charAt(i)){
			            first=i;
			            second=i_count;
			            alreadyPalindrome= false;
			            break;
			        }
			        i_count++;
			    }
			    if(alreadyPalindrome==true){
			    	String n1= String.valueOf(Integer.parseInt(str)-1);
			    	String n2= String.valueOf(Integer.parseInt(str)+1);
			    	int firstStr= Integer.parseInt(fillIndex(n1,first,second));
				    int secondStr= Integer.parseInt(fillIndex(n2,second,first));
				    
				    int firstDiff= Math.abs(Integer.parseInt(str)-firstStr);
				    int secondDiff= Math.abs(Integer.parseInt(str)-secondStr);
				   
				    int min= Math.min(firstDiff,secondDiff);
				    if(min==firstDiff){
				        palindrome= String.valueOf(firstStr);
				    }
				    else{
				        palindrome= String.valueOf(secondStr);
				    }
				    
			    }
			    else{
			    palindrome =getClosestNumber(str,first,second);
			    }
			    }
			    System.out.println(palindrome);
			}
		}
		
		public static String fillIndex(String str, int i , int j){
		    char[] charArr= str.toCharArray();
		    charArr[j]=charArr[i];
		    String result= String.valueOf(charArr);
		    return result;
		}
		
		public static String getClosestNumber(String str,int first,int second){
		    
		    int firstStr= Integer.parseInt(fillIndex(str,first,second));
			    int secondStr= Integer.parseInt(fillIndex(str,second,first));
			    
			    int firstDiff= Math.abs(Integer.parseInt(str)-firstStr);
			    int secondDiff= Math.abs(Integer.parseInt(str)-secondStr);
			    String result=null;
			    int min= Math.min(firstDiff,secondDiff);
			    if(min==firstDiff){
			        result= String.valueOf(firstStr);
			    }
			    else{
			        result= String.valueOf(secondStr);
			    }
			    return result;
			    
		}
}
