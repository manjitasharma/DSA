package jumpingNumber;
import java.util.*;
import java.lang.*;
import java.io.*;

public class jumpingNumber2 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	
		public static void main (String[] args) throws  IOException {
			//code
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int T=Integer.parseInt(br.readLine());
			while(T>0){
				T--;
				String str= br.readLine();
				int number=Integer.parseInt(str);
				printJumpingNumbers(number);
		}
		}
		static void printJumpingNumbers(int number){
			System.out.print("0 ");
			for(int i=1;i<=9;i++){
				checkAndPrint(number,i);
			}
		}
		
		static void checkAndPrint(int number , int i){
			
			Queue<Integer> q= new LinkedList<Integer>();
			q.add(i);
			
			while(!q.isEmpty()){
				int digit=q.poll();
				if(digit<number){
					System.out.print(digit+" ");
					int unitDigit=digit%10;
					if(unitDigit==0){
						q.add((digit*10)+(unitDigit+1));
					}
					else if(unitDigit==9){
						q.add((digit*10)+(unitDigit+-1));
					}
					else{
						q.add((digit*10)+(unitDigit-1));
						q.add((digit*10)+(unitDigit+1));
					}
				}
			}
			
			
		}
}
