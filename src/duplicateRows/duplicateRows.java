package duplicateRows;

public class duplicateRows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {
		        {1, 1, 0, 1, 0, 1},
		        {0, 0, 1, 0, 0, 1},
		        {1, 0, 1, 1, 0, 0},
		        {1, 1, 0, 1, 0, 1},
		        {0, 0, 1, 0, 0, 1},
		        {0, 0, 1, 0, 0, 1},
		    };
		
		printDuplicateRows(mat,6,6);
		    

	}
	
	public static void printDuplicateRows(int[][] mat , int r, int c){
		TrieNode tn= new TrieNode();
		for(int i=0;i<r;i++){
			if(!insert(tn , mat[i],c)){
				int row=i+1;
				System.out.println("Duplicate Row at position : "+row);
			}
		}
	}

	public static boolean insert(TrieNode tn , int[] mat, int c){
		TrieNode curr= tn;
		
		for(int i=0;i<c;i++){
			if(curr.children[mat[i]]==null){
				curr.children[mat[i]]= new TrieNode();
			}
			curr=curr.children[mat[i]];
		}
		if(curr.isLeaf){
			return false;
		}
		return(curr.isLeaf=true);
	}
	
	static class TrieNode{
		boolean isLeaf;
		TrieNode[] children= new TrieNode[2];
		
		TrieNode(){
			isLeaf=false;
			for(int i=0;i<2;i++){
				children[i]=null;
			}
			
		}
	}
}
