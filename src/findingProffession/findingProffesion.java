package findingProffession;
import java.util.*;
import java.lang.*;
import java.io.*;

public class findingProffesion {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws IOException {
			//code
		    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		    int T = Integer.parseInt(br.readLine());
		    while(T>0){
		    	T--;
		    	String str= br.readLine();
		    	String[] inputArray= str.split(" ");
		    	int level =Integer.parseInt(inputArray[0]);
		    	int pos= Integer.parseInt(inputArray[1]);
		    	char profession =findProffessionOfChild(level,pos);
		    	if(profession=='e'){
		    		System.out.print("Engineer");
		    	}
		    	else{
		    		System.out.print("Doctor");
		    	}
		    	
		    }
     
     
		}
	
	static char findProffessionOfChild(int level , int pos){
		if(level==1){
			return 'e';
		}
		if(findProffessionOfChild(level-1,(pos+1)/2)=='d'){
			if((pos%2)!=0){
				return 'd';
			}
			else{
				return 'e';
			}
		}
		else{
			if((pos%2)!=0){
				return 'e';
			}
			else{
				return 'd';
			}
		}
	}

}
