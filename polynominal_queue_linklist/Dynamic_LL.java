package polynominal_queue_linklist;

public class Dynamic_LL {
	
	Node head;
	
	public Dynamic_LL()
	{
		this.head=null;
	}
	
	public void addend(Polynomial data)
	{
		Node record = new Node(data);
		
		if(head==null)
		{
			head=record;
			return;
		}
		Node move=head;
		while(move.next!=null)
			move=move.next;
		
		move.next=record;
		
	}	
	
	public Node deleteEnd()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return null;
		}
		if(head.next==null)
		{
			head=null;
			return null;
		}
			
		
		Node move= head;
		Node temp=head;
		while(move.next!=null)
		{
			temp=move;
			move=move.next;
		}
		
		temp.next=null;
		
		return move;
		

	}
	
	public String toString()
	{
		String display="";
		Node move=head;
		while(move!=null)
		{
			display= display+"+("+move+")  ";
			move=move.next;
		}
		return display;
	}

}