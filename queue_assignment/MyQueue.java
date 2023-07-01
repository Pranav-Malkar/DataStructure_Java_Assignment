package queue_assignment;

public class MyQueue {
	int size,front,rear;
	int []arr;
	
	public MyQueue(int size)
	{
		this.size=size;
		this.arr=new int[size];
		front=rear=-1;
	}

	public boolean isFull()
	{
		if(rear==size-1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(front==-1&&rear==-1)
			return true;
		else
			return false;
	}
	
	public void enQueue(int ele)
	{
		if(isFull())
			throw new QueueException("Queue is full...");
		else
		{
			if(front==-1)
			    front=0;
			
				//rear++;
		    arr[++rear]=ele;
				
			
				
		}
	}
	
	public int deQueue()
	{
		int ele;
		if(isEmpty())
			throw new QueueException("Queue is Empty");
		
		ele=arr[front];
		
		if(front==rear)
			front=rear=-1;
		else
			front++;
		return ele;
		
	}
	
	public void display()
	{
		if(isEmpty())
			throw new QueueException("NOTHING TO PRINT");
		System.out.println();
		for(int i=front;i<=rear;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
}