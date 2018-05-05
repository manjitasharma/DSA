package similarExpressions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class similarExpressions {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws IOException {
		//code
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		while(T>0){
			T--;
			String str= br.readLine();
			String str2= "+"+br.readLine();
			int sign =1;
			StringBuilder sb=new StringBuilder("");
			Stack<String> stack= new Stack<String>();
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)=='(' && i>0){
					stack.push(String.valueOf(str.charAt(i-1)));
					stack.push(String.valueOf(str.charAt(i)));
					if(str.charAt(i-1)=='-'){
						sign=(-1)*sign;
					}
					else if(str.charAt(i-1)=='+'){
						continue;
					}
				}
				else if(str.charAt(i)==')' && i>0){
					stack.pop();
					String s= stack.pop();
					if(s.equals("-")){
						sign=(-1)*sign;
					}
					else{
						continue;
					}
					/*if(sign==-1){
					sign=sign=(-1)*sign;
				}
				else if(sign==1){
					continue;
				}*/
				}
				else{
					if(str.charAt(i)=='-' && sign==-1){
						sb.append("+");
					}
					else if(str.charAt(i)=='+' && sign==-1){
						sb.append("-");
					}
					else{
						if(sb.equals(null)){
							sb.append("+");
						}
						sb.append(str.charAt(i));
					}
				}
			}
			String firstStr=sb.toString();
			for(int i=0;i<firstStr.length()-1;i++){
				if(firstStr.charAt(i)!='+' && firstStr.charAt(i)!='-'){
					String alpha= String.valueOf(firstStr.charAt(i));
					char symbol= firstStr.charAt(i-1);
					if(str2.contains(alpha)){
						int j= str2.indexOf(alpha);
						char checkSymbol= str2.charAt(j-1);
						if(checkSymbol!=symbol){
							System.out.println("NO");
						}
						
					}
				}
			}
				System.out.println("YES");
		}
	}
}
