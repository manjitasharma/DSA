package mergeSortedArrays;

public class mergeSortedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,2,3,4,5};
		int[] arr2={6,7,8,9};
		int[] arr = new int[arr1.length+arr2.length];
		int j=0,i=0,k=0;
		while(k<arr.length){
		if(i>=arr1.length && j<arr2.length){
			arr[k]=arr2[j];
			k++;
			j++;
		}
		else if(j>=arr2.length && i<arr1.length){
			arr[k]=arr1[i];
			k++;
			i++;
		}
		else{
			if(j<arr2.length && i<arr1.length){
			if(arr1[i]<=arr2[j]){
				arr[k]=arr1[i];
				k++;
				i++;
			}
			else{
				arr[k]=arr2[j];
				k++;
				j++;
			}
			}
		}
		}
		for(i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}

	}

}
