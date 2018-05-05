package neatNumber;

import java.io.*;

public class neatNumber {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
		String output=null;
		boolean checkStatus=false;
		while(checkStatus!=true){
		int i=0;
		StringBuilder sb= new StringBuilder("");
		while(i<str.length()-1){
			int number1=Character.getNumericValue(str.charAt(i));
			int number2=Character.getNumericValue(str.charAt(i+1));
			if(number1>number2){
				number1--;
				sb.append(number1);
				System.out.println(number1);
				System.out.println(i);
				i++;
				break;
			}
			else{
				System.out.println(i);
				System.out.println(number1);
				sb.append(number1);
			}
			i++;
		}
		if(i==str.length()-1 && Character.getNumericValue(str.charAt(i))>=Character.getNumericValue(str.charAt(i-1))){
			sb.append(str.charAt(i));
		}
		while(i<str.length()){
			System.out.println(i);
			sb.append("9");
			i++;
		}
		str=sb.toString();
		output=str;
		checkStatus=checkNeatNumber(sb.toString());
		}
		System.out.println(output);
	}
	
	static boolean checkNeatNumber(String str){
		int i=0;
		while(i<str.length()-1){
			if(Character.getNumericValue(str.charAt(i))>Character.getNumericValue(str.charAt(i+1))){
				return false;
			}
			i++;
		}
		return true;
	}

}
