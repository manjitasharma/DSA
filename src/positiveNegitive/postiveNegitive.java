package positiveNegitive;
import java.util.*;
import java.lang.*;
import java.io.*;

public class postiveNegitive {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws IOException {
			//code
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			/*int T = Integer.parseInt(br.readLine());*/
			int T=1;
			String str="2 3 -1 4 5 -5 -7 -2";
			while(T>0){
				T--;
				/*String str = br.readLine();*/
				String[] inputArray = str.split(" ");
				int flag=0;
				int count=0;
				StringBuilder sb= new StringBuilder("");
				for(int i=0;i<inputArray.length;i++){
					if(flag==0){
					if(Integer.parseInt(inputArray[i])>0){
					sb.append(inputArray[i]+" ");
					flag=1;
					}
					}
					if(flag==1){
						for(int j=count;j<inputArray.length;j++){
							if(Integer.parseInt(inputArray[j])<0){
								sb.append(inputArray[j]+" ");
								count=j+1;
								flag=0;
								break;
							}
						}
				}
				}
				System.out.println(sb);
			}
		}
	

}
