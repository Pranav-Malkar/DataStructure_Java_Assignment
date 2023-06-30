package stack_assignments;

import java.util.Arrays;

public class EmpStack {
	int size;
	Emp []e1;
	int top;
	
	public EmpStack(int size)
	{
		this.size=size;
		this.e1= new Emp[size];
		top=-1;
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
	     return true;
		else
			return false;
		
	}
	
	public boolean isFull()
	{
		if(top== size-1)
	     return true;
		else
		  return false;
		
	}
	
	public void push(Emp e)
	{
		if(!isFull())
		   e1[++top]=e;
		else
			System.out.println("Stack is full..");
		  	
    }
	public Emp pop()
	{ Emp temp=null;
		
			if(!isEmpty())
				temp=e1[top--];
			
		
		return temp;
	}
	
	public void peak()
	{
		Emp temp=null;
		if(!isEmpty())
		 System.out.println(e1[top]); 
		else
			System.out.println("stack is empty");
	}

	@Override
	public String toString() {
		return "Emp [e1=" + Arrays.toString(e1) + "]";
	}

	
	
}