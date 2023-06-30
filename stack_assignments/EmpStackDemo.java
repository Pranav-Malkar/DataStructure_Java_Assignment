package stack_assignments;

import java.util.Scanner;

public class EmpStackDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpStack m = new EmpStack(10);
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
				System.out.println("enter emp id,ename,esal to push");
				int eid =sc.nextInt();
				String ename=sc.next();
				int sal =sc.nextInt();
				Emp e1=new Emp(eid,ename,sal);
				m.push(e1);
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