package linkedlist_Assignment;


import java.util.Scanner;

public class LinkedList {
	Node head;
	
	public LinkedList()
	{
		head=null;
	}

	public void display()
	{
		Node move =head;
		
		while(move!=null)
		{
			System.out.println(" "+move.data);
			move=move.next;
		}
	}
	
	public void createLinkedlist(int term)
	{
		Scanner sc = new Scanner(System.in);
		int no;
		for(int i=1;i<=term;i++)
		{
			System.out.println("enter integer to insert: ");
			no=sc.nextInt();
		Node record = new Node(no);
		
		if(head==null) //if empty add node to front
			head=record;
		else //add node to end
		{Node move=head;
		 while(move.next!=null)
			 move=move.next;
		move.next=record;	
		}
		
		}
		
	
	}
	
	public void display1()
	{
		Node move=head;
		while(move!=null)
		{
			System.out.print(" "+move.data);
			move = move.next;
		}
		System.out.println();
	}
	
	
}