package queue_assignment;

public class CustomerQueue {
	int size,front,rear;
	Customer []c;
	
	public CustomerQueue(int size)
	{
		this.size=size;
		this.c=new Customer[size];
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
	    if(rear==-1&&front==-1)
              return true;
	    else
	    	return false;
	
	
	}
	
	public void enQueue(Customer c1)
	{
		if(isFull())
			throw new QueueException("Queue is full..");
		else {
			if(front==-1)
				front=0;
			
			c[++rear]=c1;
				
		}	
	}
	
	public Customer deQueue()
	{
		Customer c1;
		if(isEmpty())
			throw new QueueException("Queue is Empty");
		
		c1=c[front];
		if(front==rear)
			front=rear=-1;
		else
			front++;
		
		return c1;
		}
	
	public void display()
	{
		if(isEmpty())
			throw new QueueException("Queue is Empty");
		
		for(int i=front;i<=rear;i++)
		{
		System.out.println(c[i]);
		}
	}
		
		
	}
		
	