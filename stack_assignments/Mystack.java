package stack_assignments;

import java.util.Arrays;

public class Mystack {
	int arr[];
	int size;
	int top;
	
	public Mystack(int size)
	{
		this.size=size;
		arr = new int[size];
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
		if(top==size-1)
			return true;
		else
			return false;
	}
	
	public void push(int ele)
	{
		if(isFull())
			System.out.println("Stack is Full");
		else
			arr[++top]=ele;			
		
	}
	public int pop()
	{
		int element=-999;
		if(!isEmpty())
		  element=arr[top--];
			
		
		return element;
		
	}
	
	public void peak()
	{
		if(isEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println(arr[top]);
	}

	@Override
	public String toString() {
		String str=" ";
		for(int i=top;i>=0;i--)
		{
			str=str+arr[i]+" ";
		}
		return str;
	}
}
	
