package circularlinklist_assignment;

public class CircularLL {
	
	Node head;
	
	public CircularLL()
	{
		this.head=null;
	}
	
	
	public void  createCircularLL(int data)
	{
		Node record = new Node(data);
		
		if(head==null)
		{
			head=record;
			head.next=head;
			return;
		}
		
		Node move=head;
		//Node temp;
		
		while(move.next!=head)
		{
			
			move=move.next;
		}
		record.next=head;
		move.next=record;
		
		
	
	}
	
	public void display()
	{
		Node move=head;
		System.out.println("*************************");
		while(move.next!=head)
		{
			System.out.print(" "+move.data);
			move=move.next;
		}
		System.out.print(" "+move.data);
		System.out.println();
		System.out.println("**************************");
			
	}
	
	public void insert(int data,int pos)
	{
		Node record = new Node(data);
		if(pos<1)
		{
			System.out.println("position should be greater than 0");
			return;
		}
		if(pos==1&& head==null)
		{
			head=record;
			head.next=record;
			return;
		}
		if(pos==1 && head!=null)
		{
			head.next=record;
			record.next=head;
			head=record;
			return;
		}
		
		if(1 < pos && pos<=length())
		{
			Node move=head;
			
			for(int i=1;i<pos-1;i++)
				move=move.next;
			
			record.next=move.next;
			move.next=record;
			
			return;
			}
		
		if(pos>length())
		{
			Node move=head;
			while(move.next!=head)
				move=move.next;
			
			record.next=move.next;
			move.next=record;
			return;
		}		
	}	
	
	public int delete(int temp)
	{
		
		if(head==null)
			return -999;
		
		if(head.data==temp && length()==1 )
		{
			int a=head.data;
			head=null;
			return a;
			
		}
		
		if(head.data==temp && length()>1)
		{
			int a=head.data;
			Node move=head;
			Node del=head;
			
			while(move.next!=head)
				move=move.next;
			
			head=del.next;
			move.next=head;
		      return a;
			
		}
		
		
		Node move=head;
		int count=0;
		
		for(int i=1;i<=length();i++)
		{
			
		   if(move.data==temp)
		   {
			   count=i;
			   
		       break;
		   }
		   move=move.next;
	    }
		
		
		if(count==length())
		{
			for(int i=0;i<length();i++)
		             move=move.next;
			
			move.next=head;
		     
		}
		
		
		Node move1=head;
		for(int i=1;i<count-1;i++)
			move1=move1.next;
		
		int a=move1.next.data;
		move1.next=move1.next.next;	
		return a;
	}		
	
	
//madams method
	
	public Node deleteNode(int data)
	{
		Node del=null;
		if(head==null)
		{
			return null;
		}
		 
		if(head.data==data)
		{
			del=head;
			Node move;
			for(move=head;move.getNext()!=head;move=move.getNext());
			move.setNext(del.getNext());
			head=head.getNext();
			return del;
		}
		Node move=head;
	
		while(move.getNext()!=head)
		{
		  if(move.getNext().getData()==data)
		  {
			  del=move.getNext();
			  move.setNext(del.getNext());
			  return del;
			  
		  }
		  move=move.getNext();
			  
		}
		return null;
		
	}
	
	public int length()
	{
		Node move=head;
		int count=0;
		while(move.next!=head)
		{
			count++;
			move=move.next;
		}
		
		return (count+1);
		
	}
	
	public void modify(int d,int newdata)
	{
		Node move=head;
		
		while(move.next!=head)
		{
			if(move.data==d)
			{
				move.data=newdata;
				break;
			}
			move=move.next;
		}
		
	}
}
	
