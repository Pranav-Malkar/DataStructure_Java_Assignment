package stack_assignments;

import java.util.Scanner;

public class CharStackDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CharStack b = new CharStack(10);
		int choice ;
		do {
			System.out.println();
			System.out.println("ENTER 1 TO CHECK IF STACK ISEMPTY");
			System.out.println("ENTER 2 TO CHECK IF STACK ISFULL" );
			System.out.println("ENTER 3 to push element in stack");
			System.out.println("ENTER 4 to pop element from stack");
			System.out.println("ENTER 5 TO display stack");
			System.out.println("ENTER 6 TO display topmost element");
			System.out.println("ENTER 0 to exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println(b.isEmpty());
				break;
			case 2:
				System.out.println(b.isFull());
				break;
			case 3:
				System.out.println("enter character to push");
				char ele =sc.next().charAt(0);
				b.push(ele);
				break;
			case 4: 
			  System.out.print(b.pop());
			  break;
			case 5:
				System.out.println(b.toString());
				break;
			case 6:
				b.peak();
				break;
			}
			
		}while(choice!=0);
		


	}

}