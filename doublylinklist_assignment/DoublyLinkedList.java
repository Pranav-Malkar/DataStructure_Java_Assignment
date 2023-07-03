package doublylinklist_assignment;

public class DoublyLinkedList {
	
	Node head;
	
	public DoublyLinkedList()
	{
		this.head=null;
		
	}

	
	public void createDoublyLL(int data)
	{
		Node record = new Node(data);
		
		if(head==null)
		{
			head=record;
		
		}
		else
		{
			Node move=head;
			
			while(move.next!=null)
			{
			move=move.next;
			}
			move.next=record;
			record.prev=move;
		}
		
		System.out.println("data added succesfully");
			
		
	}
	
	public void deleteNode(int data)
	{
		Node move=head;
		
		
		int count=0;
		while(move!=null)
		{
			count++;
			if(move.data==data)
			break;
			
			move=move.next;
		}
		
		
		
		if(count==1 && head.next==null )
		{
			head=null;
			return;
		}
		
		if(count==1 &&head.next!=null)
		{
			Node move3=head;
//			for(int i=1;i<2;i++)
//			{
//			    move3=move3.next;
//			}
//			move3.prev=null;
//			head=move3;
			
			head=move3.next;
			head.prev=null;
			
			return;
		}
		
		Node move1=head;
	
	    for(int i =1;i<count-1;i++)
	    {
	    	move1 = move1.next;
	    }
	    move1.next=move1.next.next;
	    
	}
	
	public void insertNode(int pos,int data)
	{
		
		
		if(pos==1)
		{
			Node record = new Node(data);
			record.next=head;
			head.prev=record;
			head=record;
			
			return;
		}
		if(pos>length())
		{
			Node record= new Node(data);
			Node move=head;
			while(move.next!=null)
				move=move.next;
			
			move.next=record;
			record.prev=move;
			
		}
		
		Node move=head;
		Node record = new Node(data);
		for(int i=1;i<pos-1;i++)
			move=move.next;
		
		record.next=move.next;
		record.prev=move;
		move.next=record;
		move.next.prev=record;
	
	}
	
	public int length()
	{
		Node move=head;
		int count=0;
		while(move!=null)
		{
			count++;
			System.out.println(" "+move.data);
			move=move.next;
		}
		return count;
	}
	
	
	
	
	public void search(int d)
	{
		
	  Node move=head;
	  boolean flag=true;
	  int count=0;
	  while(move!=null)
	  {count++;
		  if(move.data==d)
		  {
		  flag=false;
		  System.out.println(d+" is at pos "+count);			  
			  break;
		  }
		  
		  move=move.next;
			  
	  }
	  if(flag==true)
		  System.out.println("data is not present..!!!1");
	 
	}
	
	public void displayRev()
	{
		Node move=head;
		for(move =head;move.next!=null;move=move.next);
		System.out.println("******************^^^^******************");
		while(move!=null)
		{
			System.out.print(move);
			move=move.prev;
		}
		
		System.out.println();
		System.out.println("******************^^^^******************");
			
	}
	
	
	public void display()
	{
		Node move=head;
		System.out.println("******************^^^^******************");
		while(move!=null)
		{
			
			System.out.print(" "+move.data);
			move=move.next;
		}
		System.out.println();
		System.out.println("******************^^^^******************");
	}
	
}