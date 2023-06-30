package stack_assignments;

import java.util.Arrays;

public class CharStack {
	int size,top;
	char ch[];
	
	public CharStack(int size)
	{
		this.size = size;
		this.ch = new char[size];
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
	
	public char pop()
	{
		char temp=' ';
		if(!isEmpty())
			temp=ch[top--];
		return temp;
			
	}
	
	public void push(char c)
	{
		if(!isFull())
			ch[++top]=c;
		else
		    System.out.println("Stack is full");	
	}
   public void peak()
   {
	   if(!isEmpty())
		   System.out.println(ch[top]);
	   else
		   System.out.println("stack is empty");
   }

   
  
   
@Override
public String toString() {
    String str="";
  for(int i=top;i>=0;i--)
  {
	  str=str+ch[i]+" ";
  }
  return str;
	
}
   
   

}