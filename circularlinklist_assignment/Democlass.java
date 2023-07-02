package circularlinklist_assignment;

import java.util.Scanner;

public class Democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularLL cls = new CircularLL();
		int ch;
		Scanner sc = new Scanner(System.in);
		
		
		do{
			System.out.println("1.create CircularLL");
			System.out.println("2.display");
			System.out.println("3.display length");
			System.out.println("4.modify data");
			System.out.println("5.Insert Element");
			System.out.println("6.delete data");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter dataa");
				int data= sc.nextInt();
				cls.createCircularLL(data);
				break;
			case 2: 
				cls.display();
				break;
			case 3:
			System.out.println("length: "+cls.length());
			break;	
			case 4:
				System.out.println("enter data to modify");
				int od =sc.nextInt();
				System.out.println("enter new data");
				int nd=sc.nextInt();
				cls.modify(od,nd);
				break;
			case 5:
				System.out.println("enter data");
				int data1=sc.nextInt();
				System.out.println("enyter pos");
				int pos=sc.nextInt();
				cls.insert(data1, pos);
				
				break;
			case 6: 
				System.out.println("enter data to delete...");
				int d = sc.nextInt();
				System.out.println(cls.delete(d));
				//cls.delete(d);
				break;
			case 7:	
				System.out.println("enter data to delete...");
				int d1 = sc.nextInt();
				System.out.println(cls.delete(d1));
			}
			
		}while(ch!=0);

	}

}