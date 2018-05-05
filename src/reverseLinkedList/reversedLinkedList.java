package reverseLinkedList;


public class reversedLinkedList {

	/**
	 * @param args
	 */
	
	public static Node head;
	public static Node h1;
	public static Node h2;
	public static void main(String[] args) {
		
		
		/*Node node= new Node(1);*/
		/*head=node;*/
		/*add(2,head);
		add(3,head);
		add(4,head);
		add(5,head);
		
		print(head);
		head= swapPairwise(head);*/
		/*h1=node;
		add(10,h1);
		add(15,h1);
		add(20,h1);
		add(25,h1);
		add(32,h1);
		add(45,h1);
		add(48,h1);
		print(h1);
		
		Node node1= new Node(18);
		h2=node1;
		add(22,h2);
		add(25,h2);
		add(35,h2);
		print(h2);*/
		
		Node node= new Node(5);
		h1=node;
		add(10,h1);
		add(15,h1);
		add(40,h1);
		
		print(h1);
		
		Node node1= new Node(2);
		h2=node1;
		add(3,h2);
		add(20,h2);
		print(h2);
		
		head=mergeSorted(h1,h2);
		print(head);
		/*head= rotateLinkedList(head, 2);*/

		/*reverse(head);*/
		/*deleteValue(2 , head);*/
		/*deleteValue(5 , head);*/  //not working for this
		/*deleteValue(1 , head);*/
		/*recursiveReverse(head, null , null);*/
		/*Node finalresult=new Node(0);*/
		/*recursReverse(head, finalresult , null);*/
		
		
		
		
	}
	
	public static void print(Node n){
		Node printNode=n;
		for(int i=0; printNode.next != null; i++)
		{
			System.out.print(printNode.value+"-");
			printNode = printNode.next;
		}
		System.out.println(printNode.value);
		System.out.println("");
	}
	
	public static void add(int value, Node head){
		Node new_node= new Node(value);
		new_node.next=null;
		Node temp=head;
		
		for(int i=0; temp.next != null; i++)
		{
			temp = temp.next;
		}
	temp.next = new_node;
	temp.next.next = null;
	
	}
	
	public static void recursiveReverse(Node n , Node resultback , Node result){
		/*Node result=null;
		Node resultback= null;*/
		Node temphead= n;
		Node finalresult=null;
		if(temphead!= null){
		Node temp= temphead.next;
		temphead.next= null;
		result=temphead;
		result.next= resultback;
		resultback= result;
		temphead=temp;
		recursiveReverse(temphead , resultback , result);
		}
		print(result);
		return;
		/*print(result);*/
		
		
	}
	
	public static int recursReverse(Node n  , Node finalresult , Node result){
		/*Node result=null;
		Node resultback= null;*/
		Node temphead= n;
		if(temphead!= null){
		Node temp= temphead.next;
		temphead.next= null;
		result=temphead;
		int count=0;
		/*result=temphead;
		result.next= resultback;
		resultback= result;
		temphead=temp;*/
		temphead=temp;
		int value=recursReverse(temphead ,finalresult ,  result);
		
		add(value,finalresult);
	
		print(finalresult);
		count++;
		}
		print(result);
		head=finalresult;
		return result.value;
		/*print(result);*/
		
		
	}
	
	public static void reverse(Node n){
		Node result=null;
		Node resultback= null;
		Node temphead= n;
		while(temphead!= null){
		Node temp= temphead.next;
		temphead.next= null;
		result=temphead;
		result.next= resultback;
		resultback= result;
		temphead=temp;
		}
		print(result);
		
		
	}
	
	public static void deleteValue(int n , Node head){
		Node travNode=head;
		Node prev= null;
		for(int i=0; travNode != null; i++)
		{
			System.out.println(travNode.value);
			if(travNode.value==n){
				head= travNode.next;
				travNode=head;
				break;
			}
			else{
			/*if(travNode.next.value==n && travNode.next.next==null){
				Node temp=travNode.next;
				travNode.next=null;
				break;
			}*/
			/*else{*/
				if(travNode.next.value==n){
					travNode.next=travNode.next.next;
				}
				
					travNode = travNode.next;
			
		/*}*/}
	
		}
		head=travNode;
		print(head);
	}
	
	
	public static Node rotateLinkedList(Node n , int k ){
		Node curr= n;
		while(k>0){
			Node temp1=curr.next;
			curr.next=null;
			Node temp=temp1;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=curr;
			curr=temp1;
			k--;
		}
		Node result=curr;
		return result;
	}
	
	public static Node swapPairwise(Node n){
		Node curr= n;
		while(curr!=null && curr.next!=null){
			int k= curr.value;
			curr.value=curr.next.value;
			curr.next.value=k;
			curr=curr.next.next;
		}
		return n;
	}
	
	public static Node mergeSorted(Node n1 , Node n2){
		if(n1==null){
			return n2;
		}
		if(n2==null){
			return n1;
		}
		else if(n1.value<n2.value){
			return mergeSortedUtil(n1,n2);
		}
		else{
		return mergeSortedUtil(n2,n1);
		}
	}

	private static Node mergeSortedUtil(Node n1, Node n2) {
		
		if(n1.next==null){
			n1.next=n2;
		}
		else{
			Node curr1= n1;
			Node curr2= n2;
			while(curr1.next!=null && curr2!=null){
				if(curr1.value<=curr2.value && curr2.value<=curr1.next.value){
					Node temp=curr1.next;
					curr1.next=curr2;
					curr2=curr2.next;
					curr1.next.next=temp;
					curr1=curr1.next.next;
				}
				else{
					if(curr1.value<=curr2.value){
						curr1=curr1.next;
					}
					else if(curr1.value>curr2.value){
						curr1=curr2.next;
						curr2=curr2.next;
					}
				}
			}
			if(curr1.next!=null && curr2==null){
				/*while(curr1!=null){*/
				//curr1.next= curr1.next.next;
				/*}*/
				return n1;
			}
			if(curr1.next==null && curr2!=null){
				if(curr1.value<=curr2.value){
					curr1.next=curr2;
				}
				else if(curr1.value>curr2.value){
					Node temp=curr1;
					curr1=curr2;
					Node temp2=curr2.next;
					curr1.next=temp;
					curr1.next.next=temp2;
				}
				/*curr2=curr2.next;*/
			}
		}
		return n1;
	}
	

}
