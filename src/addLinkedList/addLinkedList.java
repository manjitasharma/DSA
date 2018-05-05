package addLinkedList;


public class addLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node n1= new Node(1);
		Node n2= new Node(2);
		Node result=null;
		/*add(8 ,n1);
		add(7 ,n1);
		add(2 ,n1);
		add(9 ,n1);
		add(4 ,n2);
		add(5 ,n2);
		add(7 ,n2);
		add(8 ,n2);*/
		add(2 ,n1);
		add(0 ,n1);
		add(1 ,n2);
	
		/*result= addLinkedList(n1,n2);*/
		result= multiplyLinkedList(n1,n2);
		print(result);
		
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
	
	public static Node reverse(Node n){
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
		return result;
		
		
	}
	public static Node multiplyLinkedList(Node node1 ,Node node2){
		
		Node result= null;
		Node resultTemp=null;
		int digitFlow=0;
		Node n1= null;
		Node n2=reverse(node2);
		Node sumResult=null;
		Node temp1=node1;
		Node temp2= node2;
		int carry=0;
		while(n2!=null){
			n1=reverse(node1);
			while(n1!=null){
				int total= (n1.value*n2.value)+carry;
						if(total>9){
							carry=total/10;
							total=total%10;
						}
						else{
							carry=0;
						}
						
						Node new_node=new Node(total);
						result=new_node;
						result.next=resultTemp;
						resultTemp=result;
						n1=n1.next;
						
			}
			int flow= digitFlow;
			if(flow>0){
				Node r1=result;
				Node r2=sumResult;
			while(flow>0){
				add(0,r1);
				flow--;
			}
				sumResult= addLinkedList(r1,r2);
				
			}
			else{
				sumResult=result;
			}
			digitFlow++;
			n2=n2.next;
		}
		
		return sumResult;
		
	}
	
	public static Node addLinkedList(Node n1 , Node n2){
		Node result=null;
		
		n1=reverse(n1);
		n2=reverse(n2);
		print(n1);
		print(n2);
		Node temp1= n1;
		Node temp2= n2;
		Node resultTemp=null;
		int carry=0;
		int sum=0;
		int total=0;
		while(temp1!=null || temp2!=null){
			if(temp1==null && temp2!=null){
				/*result.value=temp2.value+carry;
				result.next=resultTemp;
				resultTemp=result;
				temp2=temp2.next;*/
				total=temp2.value+carry;
				temp2=temp2.next;
				
			}else if(temp1!=null && temp2==null){
				/*result.value=temp1.value+carry;
				result.next=resultTemp;
				resultTemp=result;
				temp1=temp1.next;*/
				total= temp1.value+carry;
				temp1= temp1.next;
			}
			else{
				total=temp1.value+temp2.value+carry;
				temp1=temp1.next;
				temp2=temp2.next;
			}
				if(total>9){
				carry=total/10;
				total=total%10;
				 
				}
				else{
					carry=0;
				}
				sum=total;
				Node new_node=new Node(sum);
				result=new_node;
				result.next=resultTemp;
				resultTemp=result;			
		}
		return result;
		
	}
	
	public static void print(Node n){
		Node printNode=n;
		for(int i=0; printNode.next != null; i++)
		{
			System.out.print(printNode.value+" ");
			printNode = printNode.next;
		}
		System.out.print(printNode.value);
		System.out.println(" ");
	}

}
