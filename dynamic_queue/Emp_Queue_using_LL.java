package dynamic_queue;

public class Emp_Queue_using_LL {
	
	Node rear,front;
	
	public Emp_Queue_using_LL()
	{
		rear=front=null;
	}
	
	public void enQueue(Emp data)
	{
		Node record = new Node(data);
		if(front==null) 
		{
		 rear=front=record;
		 return;
		} 
		rear.next=record;
		rear=record;
		
	}
	
	public Emp deQueue()
	{
		if(front==null&& rear==null)
		{   System.out.println("Que is empty..");
		    return null;
		}
		
		Node move=front;
		front=move.next;
		
		return move.data;
		
		
	}
	
	public void display()
	{
		Node move=front;
		System.out.println("***********Dynamic queue*************");
		while(move!=null)
		{
			System.out.println(" "+move.data);
			move=move.next;
			
		}
		//System.out.println(move.data);
		System.out.println("***********Dynamic queue*************");
	}

}
