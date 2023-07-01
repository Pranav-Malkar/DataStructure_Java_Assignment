package queue_assignment;

import java.util.Scanner;

public class Demo_Circular_Queue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circular_Queue c = new Circular_Queue(5);
		
		int choice;
		do {
			System.out.println();
			System.out.println("1. isEmpty");
			System.out.println("2. isFull");
			System.out.println("3. enQueue");
			System.out.println("4. deQueue");
			System.out.println("5. Display");
			System.out.println("0. EXIT");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println(c.isEmpty());
				break;
			case 2:
				System.out.println(c.isFull());
				break;
			case 3:
				System.out.println("enter element to enqueue");
				int a=sc.nextInt();
				c.enQueue(a);
				break;
			case 4:
				System.out.println(c.deQueue());
				break;
			case 5:
				c.display();
				
			}
			
		}while(choice!=0);
	
	}

}