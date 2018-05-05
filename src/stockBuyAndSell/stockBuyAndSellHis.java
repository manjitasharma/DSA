package stockBuyAndSell;
import java.util.*;
import java.lang.*;
import java.io.*;

public class stockBuyAndSellHis {

	
	public static void main(String[] args)throws IOException {
		
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(buf.readLine());
			while(T>0)
			{
			    T--;
			    int size=Integer.parseInt(buf.readLine());
			    String l[]=buf.readLine().split(" ");
			    String op=""; String o="";
			    int arr[]=new int[size];
			    for(int i=0;i<l.length;i++)
			    {
			        arr[i]=Integer.parseInt(l[i]);
			    }
			    int flag=1;
			    for(int i=0;i<arr.length;i++)
			    {
			        if(i!=arr.length-1&&arr[i]<arr[i+1])
			            {
			                if(flag==1)
			                    {o+="("+i+" "; flag=0;}
			            }
			        else
			        {
			            if(i!=0&&arr[i]>arr[i-1])
			              { 
			                if(flag==0)
			                 { o+=i+") ";  op+=o; o="";flag=1;}
			              }
			        }
			    }
			    if(op.equals(""))
			     System.out.println("No Profit");
			     else
			     System.out.println(op);
			}
		}

}
