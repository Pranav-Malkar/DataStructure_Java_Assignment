package linkedlist_Assignment;

public class LinkedList_2 {
	Node head;
	
	public LinkedList_2()
	{
		head=null;
	}
	
	
	//Add element at beginning
	
	public void addBeg(int data)
	{
		Node record  = new Node(data);  //we can manipulate head so we store it in record and use it
		//if we will manipulate head we may lost link
		
		if(head==null)
		{
			head=record;
			return;
		}
		record.next=head;
		head=record;
	}
	//add element at End
	
	public void addEnd(int data)
	{
		Node record=new Node(data);
		if(head==null)
		{
			head=record;
			return;
		}
		Node move=head;
		while(move.next!=null)
		{
			move=move.next;
		}

		move.next=record;
		
	}
	
	//Modify element
	
	public void modify(int data,int newdata)
	{
		boolean found=true;
	    Node move = head;
	    while(move!=null)
	    {
	    	if(move.data==data)
	    	{
	    		found =true;
	    		move.data=newdata;
	    		break;
	    	}
	    	move=move.next;
	    }
    }
	
	//delete 1st element
	
	public void deleteBeg()
	{
		Node move=head;
	  head = move.next;
		
	}
	
	//delete last element
	
	public void deletEnd()
	{
		
		int length=length();
		if(length==0)
		{
			System.out.println("Linkedlist is empty..!!!!!\n          ************");
			return;
		}
		System.out.println(length);
		if(length==1)
		{
			head=null;
			return;
		}
		
		Node move=head;
		Node temp=head;
		while(move.next!=null)
		{
			temp=move;
			move=move.next;
		}
		temp.next=null;
	}
	
	//display 1st node
	
	public int firstNode()
	{
		Node temp=head;
	   
	    return temp.data;
	}
	
	//display last node
	
	public int lastNode()
	{
		Node move =head;
		//Node temp=head;
		while(move.next!=null)
		{
			//temp=move;
			move= move.next;
		}
		
		return move.data;
	}
	
	//search
	
	public void searchNode(int data)
	{
		Node move=head;
		boolean flag=false;
		int count=0;
		while(move!=null)
		{
			count++;
			
			if(move.data==data)
			{
				System.out.println(data+" is at pos "+count);
				flag=true;
				 break;
			}
			    
			
			move=move.next;
			
		}
		
		if(flag==false)
		System.out.println("Data not found");
			
		
	}
	
	//display length of linkedlist
	public int length()
	{
	Node move=head;
	int count=0;
	while(move!=null)
	{
	count++;
	move=move.next;
	}
	return count;
	}

	
	//insert data at pos
	
//	public void insertDataAtPos(int data,int pos)
//	{
//	Node record =new Node(data);
//
//	Node move=head;
//	Node temp=null;
//	for(int i=1;i<pos;i++)
//	{
//		temp=move;
//	    move =move.next;
//	}
//
//	record.next=temp.next;
//	temp.next=record;
//	
//	}
	
	//more efficient code
	
	public void insertDataAtPos(int data,int pos)
	{
		int length=length();
		if(length<pos)
		{
			System.out.println("pos is greater than linkedlist length...!!");
			return;
		}
		
		if(pos==1)
		{
			Node record= new Node(data);
			record.next=head;
			head=record;
			return;
		}
		
		Node record = new Node(data);
		Node move=head;
		for(int i=1;i<pos-1;i++)
		{
			move=move.next;
		}
		record.next=move.next;
		move.next=record;
		
		
		
		
	}
	
	//delete from nth pos
	
	public void deleteNth(int pos)
	{
		Node temp=head;
		if(pos==1)
		{
			head=temp.next;
		}
		int length=length();
		if(pos>length)
		{
			System.out.println("pos is greater is then length of LinkedList");
			return;
		}
	
		Node move=head;
		Node temp1=null;
		for(int i=1;i<pos;i++)
		{
			temp1=move;
			move=move.next;
			
		}
		temp1.next=move.next;
		move=null;
		
		
	}
	
	
	
	public void display()
	{
		Node move=head;
		System.out.println("*********Linked List*********");
		
		while(move!=null)
		{
			System.out.print(" "+move.data);
			move=move.next;
			
		}
		System.out.println();
		System.out.println("         **********          ");
	}

}