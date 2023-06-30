package stack_assignments;

import java.util.Scanner;

public class Mystack_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Mystack m = new Mystack(10);
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
				System.out.println(m.isEmpty());
				break;
			case 2:
				System.out.println(m.isFull());
				break;
			case 3:
				System.out.println("enter element to push");
				int ele =sc.nextInt();
				m.push(ele);
				break;
			case 4: 
			  System.out.print(m.pop());
			  break;
			case 5:
				System.out.println(m.toString());
				break;
			case 6:
				m.peak();
				break;
			}
			
		}while(choice!=0);

	}

}