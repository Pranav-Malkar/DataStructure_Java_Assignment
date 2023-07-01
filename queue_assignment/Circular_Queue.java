package queue_assignment;

public class Circular_Queue {
	int size,front ,rear;
	int []a;
	
	public Circular_Queue(int size)
	{
		this.size=size;
		this.a=new int[size];
		front=rear=-1;
	}
	
	public boolean isEmpty()
	{
		if(front==-1 && rear ==-1)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if ((rear+1)%size==front)
			return true;
		else
			return false;
		
	}
	
	public void enQueue(int e)
	{
		if(!isFull())
		{
			if(front==-1)
				front=0;
		rear=(rear+1)%size;
		a[rear]=e;
		}
		else {
		this.deQueue();
		this.enQueue(e);
			//System.out.println("Queue Is Full !!!");
		}
		System.out.println();
		System.out.println(" Front "+front);
		System.out.println(" Rear  "+rear);
		
			
	}
	
	public boolean deQueue()
	{
		boolean flag=false;
		if(!isEmpty())
		{	flag=true;
		
				if(front==rear)
					front=rear=-1;
		
				else
					front=(front+1)%size;
			
		}
		
	
		else
			System.out.println("Queue Is Empty!!!");
		
		System.out.println();
		System.out.println(" Front "+front);
		System.out.println(" Rear  "+rear);
		return flag;
				
			
	}
	
	public void display()
	{
		int i;
		if(!isEmpty())
		{
		for(i=front;i!=rear;i=(i+1)%size)
			System.out.print(" "+a[i]);
		if(i==rear)
			System.out.print(" "+a[i]);
	
		System.out.println(" Front "+front);
		System.out.println(" Rear  "+rear);
		}
		else
			System.out.println("queue is empty");
		
	}
}
	
		
