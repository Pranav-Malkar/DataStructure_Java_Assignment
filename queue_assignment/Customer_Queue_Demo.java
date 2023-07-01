package queue_assignment;

import java.util.Scanner;


public class Customer_Queue_Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CustomerQueue c = new CustomerQueue(5);
		
		
		int choice;
		
		do{
			
			System.out.println();
			System.out.println("1: isEmpty" );
			System.out.println("2: isFull" );
			System.out.println("3: enQueue" );
			System.out.println("4: deQueue" );
			System.out.println("5: Display" );
			System.out.println("0: Exit" );
			choice=sc.nextInt();
			
			switch(choice) {
			
			
			case 1:
				System.out.println(c.isEmpty());
			break;
			case 2: 
				
				System.out.println(c.isFull());
				break;
			case 3:
				try {
					System.out.println("Enter cid and cname to enQueue: ");
					int cid =sc.nextInt();
					String name=sc.next();
					Customer c1= new Customer(cid,name);
					c.enQueue(c1);
					
				}catch(QueueException e)
				{
					System.out.println(e.getMessage());
				}
			    break;    
			    
			case 4:
				try {
					System.out.println("Deleted Data: "+c.deQueue());
				}catch(QueueException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				try {
					c.display();
				}catch(QueueException e)
				{
					System.out.println(e.getMessage());
				}
			break;
			}
			
			}while(choice!=0);
		
	}
}
	
