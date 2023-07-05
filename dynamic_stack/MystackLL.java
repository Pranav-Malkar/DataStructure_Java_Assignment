package dynamic_stack;

public class MystackLL {
	
	Node top;

	
	public MystackLL()
	{
		
		Node top=null;
	}
	
	
	public boolean isEmpty()
	{
		if(top==null)
			return true;
		else
			return false;
	}
	
	
	public void push(int ele)
	{
		Node record = new Node(ele);
	 if(top==null)
	 {
		 top=record;
		 return;
	 }
	 record.next=top;
	 top=record;
	 
	}
	
	public boolean pop()
	{
		if(isEmpty())
		{
			System.out.println("STACK IS EMPTY ...");
			return false;
		}
		
		top=top.next;
		return true;
	}
	
	public void display()
	{
		System.out.println("------ Stack Is ----------");
		for(Node move=top;move!=null;move=move.getNext())
			System.out.println("  "+move.getData());
	}
}