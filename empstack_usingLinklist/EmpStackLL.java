package empstack_usingLinklist;

public class EmpStackLL {

	Node top;
	
	
	public EmpStackLL()
	{
		this.top=null;
	}
	
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	public void push(Emp e1)
	{
	Node record = new Node(e1);
	
	if(isEmpty())
	{
	  top=record;
	  return;
	  
	}
	top.next=record;
	top=record;
	}
	
	public Node pop()
	{
		if(isEmpty())
			return null;
		Node temp=top;
		top=top.next;
		
		return temp;
	}
	
	public void display()
	{
		Node move =top;
		while(top.next!=null)
		{
			System.out.println(" "+move);
	        move=move.next;
	}
	}
	
}