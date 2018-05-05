package oddEven;
import java.util.*;
import java.lang.*;
import java.io.*;
public class oddEven {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
					//code
				BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(b.readLine());
			StringBuilder sb = null;
			StringBuilder sb1 = null;
			String out=null;
			while(T>0){
				T--;
				String str = b.readLine();
				int j=0;
				int number2=0;
				boolean gotEven=false;
				boolean gotEven1=false;
				sb = new StringBuilder(str);
			    int number=Character.getNumericValue(str.charAt(str.length()-1));
			    if(number%2==0){
			    	out=str;
			    }
			    else{
			    for(int i=0;i<=str.length()-2;i++){
			    	System.out.println(str.charAt(i));
			        if(Character.getNumericValue(str.charAt(i))<number && Character.getNumericValue(str.charAt(i))%2==0){
			       /* if(Character.getNumericValue(str.charAt(i))>max){
			            max=Character.getNumericValue(str.charAt(i));
			            j=i;
			            gotEven=true;
			        }*/
			        	number2=Character.getNumericValue(str.charAt(i));
			        	j=i;
			        	gotEven1=true;
			        	break;
			        }
			    }
			     if(gotEven1==false){
			    	 for(int i=str.length()-2;i>=0;i--){
			    	 if(Character.getNumericValue(str.charAt(i))%2==0){
					            number2=Character.getNumericValue(str.charAt(i));
					            j=i;
					            gotEven=true;
					            break;
				        }
			    	 }
			    	 if(gotEven==false){
			            out=str;
			    	 }else{
			    		 System.out.println(str.substring(0,j));
				        	System.out.println(number);
				        	System.out.println(str.substring(j+1,str.length()-1));
				        	System.out.println(str.charAt(j));
				         out=str.substring(0,j)+number+str.substring(j+1,str.length()-1)+str.charAt(j);
			    	 }
			        }
			        else{
			        	System.out.println(str.substring(0,j));
			        	System.out.println(number);
			        	System.out.println(str.substring(j+1,str.length()-1));
			        	System.out.println(str.charAt(j));
			         out=str.substring(0,j)+number+str.substring(j+1,str.length()-1)+str.charAt(j);

			        }
			}
			        System.out.println(out);
		}
		}

}
