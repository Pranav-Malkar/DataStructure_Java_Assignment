package stack_assignments;

import java.util.Scanner;

public class Mystack1 {
	
	 int top,size;
	 int []a;


	public Mystack1(int size)
	{
		this.size=size;
	  this.a = new int[size];
	  top=0;

	} 


	public boolean isEmpty()
	{
	 if(top==0)
	   return true;
	 else
	   return false;
	}
	 
	public boolean isFull()
	{
	  if(top ==size)
	      return true;
	  else
	     return false;
	}


	public void push(int ele)
	{
	  if(isFull())
         System.out.println("Stack is full.....!!!");
	  else
	  {
	    a[top]=ele;
	     top++;

	   }

	}

	public boolean pop()
	{
		boolean flag=false;
	 if(!isEmpty())
	{
	    top--;
	    flag=true;
	    return flag;
	}
	else
	System.out.println("stack is empty....!!!");
	return flag;

	}

	public int peak()
	{
	int p=a[top];
	return p;
	}

	public String display() {
		String str=" ";
		for(int i=top-1;i>=0;i--)
		{
			str=str+a[i]+" ";
		}
		return str;
	}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Mystack1 m=new Mystack1(5);
		
		int ch;
		
		do {
			System.out.println("1. isEmpty()");
			System.out.println("2. isFull()");
			System.out.println("3. push()");
			System.out.println("4. pop()");
			System.out.println("5. peak()");
			System.out.println("6. Display");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println(m.isEmpty());
				break;
			case 2:
				System.out.println(m.isFull());
				break;
			case 3:
				System.out.println("enter element to push");
				int ele=sc.nextInt();
				m.push(ele);
				break;
			case 4:
				m.pop();
				break;
			case 5:m.peak();
			break;
			case 6:m.display();
			break;
				
			}
		}while(ch!=0);

	}
}