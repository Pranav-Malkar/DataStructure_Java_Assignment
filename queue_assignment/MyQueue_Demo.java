package queue_assignment;

import java.util.Scanner;
public class MyQueue_Demo {

	public static void main(String[] args) {
		
		
		MyQueue m = new MyQueue(10);
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println();
			System.out.println("Enter 1 to check isEmpty");
			System.out.println("Enter 2 to check iFull");
			System.out.println("Enter 3 to enQueue");
			System.out.println("Enter 4 to deQueue");
			System.out.println("Enter 5 to Display");
			System.out.println("Enter 0 to Exit");
			
			choice= sc.nextInt();
			
			switch(choice)
			{
			case 1: 
				System.out.println(m.isEmpty());
				break;
			case 2: 
				System.out.println(m.isFull());
				break;
			case 3:
				System.out.println("enter element to enQueue");
				try {
				int ele = sc.nextInt();
			     m.enQueue(ele);
				}catch(QueueException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 4:
                 try {
                	 System.out.println("Element deleted :"+m.deQueue());
                 }catch(QueueException e)
                 {
                	 System.out.println(e.getMessage());
                 }
                 break;
			case 5:
				try {
					m.display();
				}catch(QueueException e)
				{
					System.out.println(e.getMessage());
				}
				break;
				
			}
		 
		}while(choice!=0);

	
	}

}