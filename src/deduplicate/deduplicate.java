package deduplicate;
import java.io.BufferedWriter;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class deduplicate {

	/**
	 * @param args
	 */
	
    /*
     * Complete the function below.
     */
    /*
     * Complete the function below.
     */
    static String dedup(String inp, int chunkSize) {
        String res="";
        Map<String,List<Integer>> map = new HashMap<String,List<Integer>>();
        for(int i=0;i<inp.length();i+=chunkSize){
            String str = inp.substring(i,i+chunkSize);
            if(map.get(str)==null){
                List<Integer> l = new ArrayList<Integer>();
                l.add(i);
                map.put(str,l);
            }
            else{
                List<Integer> list = map.get(str);
                list.add(i);
                map.put(str,list);
            }
        }
        for(Map.Entry<String,List<Integer>> hmap:map.entrySet()){
            res+=hmap.getKey()+",";
            List<Integer> value = hmap.getValue();
            for(int i:value){
                res+=i+",";
            }
            res= res.substring(0,res.length()-1);
            res+="-";
        }
        return res.substring(0,res.length()-1)+"~"+inp.length();
    }

    static String redup(String dedup, int chunkSize) {
    	System.out.println(dedup);
        String[] lena = dedup.split("~");
        int len = Integer.valueOf(lena[1]);
        String[] arr = lena[0].split("-");
        StringBuilder res = new StringBuilder();
        for(int i=0;i<len;i++){
        	res.append("|");
        }
        for(int i=0;i<arr.length;i++){
            String pos[]= arr[i].split(",");
            String ori = pos[0];
            for(int j=1;j<pos.length;j++){
                //res.insert(Integer.valueOf(pos[j]),ori);
            	res.replace(Integer.valueOf(pos[j]), Integer.valueOf(pos[j])+ori.length(), ori);
            }
        }
        return res.toString();
    }


    
    private static final Scanner scan = new Scanner(System.in);
    
    static String test(String inputStr, int chunkSize) {
        String deduplicatedStr = dedup(inputStr, chunkSize);
        if (deduplicatedStr.length() >= inputStr.length()) return "Deduplicated string length is greater than the input string length";
        String originalStr = redup(deduplicatedStr, chunkSize);
        return originalStr;
    }
    

    public static void main(String[] args) throws IOException {

        String inputStr = "aaaaaaaaaabbbbbbbbbbaaaaaaaaaabbbbbbbbbbaaaaaaaaaabbbbbbbbbbaaaaaaaaaabbbbbbbbbbaaaaaaaaaabbbbbbbbbbaaaaaaaaaabbbbbbbbbbcccccccccc";

        int chunkSize = 10;

        String res = test(inputStr, chunkSize);

       System.out.println(res);
    }


}
