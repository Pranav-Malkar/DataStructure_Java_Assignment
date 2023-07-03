package doublylinklist_primeNo;

public class DoublyLinkedList {
	
	Node head;
	
	public DoublyLinkedList()
	{
		this.head=null;
	}
	
	public void createDLLprime(int terms)
	{
		int data1=2;
		int i=1;
		while(i<=terms)
		{
			boolean flag=false;
			for(int j=2;j<i;j++)
			{
				if(data1%j==0)
				{
					flag=true;
				}
			}
			
			if(flag==false)
			{  i++;
				Node record = new Node(data1);
				if(head==null)
				{
					head=record;
					
				}
				else
				{
					Node move=head;
					while(move.getNext()!=null)
					{
						move=move.getNext();
					}
					move.setNext(record);
					record.setPrev(move);
					
				}
				
			}
			data1++;
		}
	}
	
	public void display()
	{
		Node move=head;
		
		System.out.println("*********************");
		while(move!=null)
		{
			System.out.print(" "+move);
			move=move.getNext();
		}
		System.out.println();
		System.out.println("     **********");
	}
	

}