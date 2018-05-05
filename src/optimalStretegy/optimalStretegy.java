package optimalStretegy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class optimalStretegy {

	/**
	 * @param args
	 */
	static class result{
		int x;
		int y;
		
		result(int first , int second){
			this.x=first;
			this.y=second;
		}
		result(){
			this.x=0;
			this.y=0;
		}
	}
	public static void main(String[] args)throws Exception {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		while(T>0){
			T--;
			String[] str= br.readLine().split(" ");
			int[] inputArray=new int[str.length];
			for(int i=0;i<str.length;i++){
				inputArray[i]= Integer.parseInt(str[i]);
			}
			result[][] res= new result[inputArray.length][inputArray.length];
			for(int i=0;i<inputArray.length;i++){
				int first = inputArray[i];
				int second= 0;
				res[i][i]= new result(first,second);
			}
			for(int i=0;i<inputArray.length;i++){
				for(int j=0;j<i;j++){
				int first = 0;
				int second= 0;
				res[i][j]= new result(first,second);
				}
			}
			
						/*0  1  2  3
					0
					1
					2
					3*/
			     int gap=1;
						while(gap<inputArray.length){
							
			    	 for(int k=0;k+gap<inputArray.length;k++){
			    		 int first= Math.max(inputArray[k]+res[k+1][k+gap].y , inputArray[k+gap]+res[k][k+gap-1].y);
			    		 int second=0;
			    		 if(inputArray[k]+res[k+1][k+gap].y>=inputArray[k+gap]+res[k][k+gap-1].y){
			    			 second=res[k+1][k+gap].x;
			    		 }
			    		 else{
			    			 second=res[k][k+gap-1].x;
			    		 }
			    		 res[k][k+gap]= new result(first,second);
			    	 }
			    	 gap++;
			     }
			/*for(int j=0;j<inputArray.length;j++){
				for(int k=j;k<inputArray.length;k++){
					i=k+1;
				if(i<str.length){
					int first= Math.max(inputArray[k]+res[k+1][i].y, inputArray[inputArray.length-1-k]+res[k][i-1].y);
					int second=0;
					if(inputArray[k]+res[k+1][i].y>=inputArray[inputArray.length-1-k]+res[k][i-1].y){
						second= res[k+1][i].x;
					}
					else{
						second= res[k][i-1].x;
					}
					res[k][i]= new result(first , second);
				}
				}
			}*/
			for(int l=0;l<inputArray.length;l++){
				for(int j=0;j<inputArray.length;j++){
					System.out.print(res[l][j].x+","+res[l][j].y+" ");
				}
				System.out.println(" ");
			}
			System.out.println(res[0][inputArray.length-1].x);
		}
		
	}

}
