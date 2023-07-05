package dynamic_queue;

import java.util.Scanner;

public class DEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Emp_Queue_using_LL q = new Emp_Queue_using_LL();
		
		int ch;
		int id,sal;
		String name;
		
		
		do {
			System.out.println("1.enequeue");
			System.out.println("2.deQueue");
			System.out.println("3.Display");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter empid,ename and sal");
				id=sc.nextInt();
				name=sc.next();
				sal=sc.nextInt();
				Emp e1= new Emp(id,name,sal);
				q.enQueue(e1);
				break;
			case 2:
				q.deQueue();
				break;
			case 3:
				q.display();
				break;
			}
		}while(ch!=0);

	}

}