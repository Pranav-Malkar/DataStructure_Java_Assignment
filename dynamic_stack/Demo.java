package dynamic_stack;

import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data,ch;
		MystackLL s1=new MystackLL();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("0. Push");
			System.out.println("Enter Your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println(" Enter Data ");
				data=sc.nextInt();
				s1.push(data);
				break;
			case 2:
				System.out.println(s1.pop());
				break;
			case 3:
				s1.display();
				break;
			}
		}while(ch!=0);

	}

}