package linkedlist_Assignment;

import java.util.Scanner;
public class Menu_driven_LinkedList {

	public static void main(String[] args) {
		
		LinkedList_2 ls1 = new LinkedList_2();
		Scanner sc = new Scanner(System.in);
		int ch;
		
		
		do {
			
			System.out.println("1.add node at beg");
			System.out.println("2.add node at end");
			System.out.println("3.Display");
			System.out.println("4.Modify");
			System.out.println("5.delete Begining node");
			System.out.println("6.delete Ending node");
			System.out.println("7.print 1st node");
			System.out.println("8.print last node");
			System.out.println("9.search data");
			System.out.println("10.display length of linkedlist");
			System.out.println("11.Insert data at pos");
			System.out.println("12.delete data from pos");
			System.out.println("0.exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: 
				System.out.println("enter data: ");
				int data=sc.nextInt();
				ls1.addBeg(data);
				break;
			case 2: 
				System.out.println("enter data: ");
				int data1=sc.nextInt();
				ls1.addEnd(data1);
				break;
			case 3:
				ls1.display();
				break;
				
			case 4:
				System.out.println("enter data to modify");
				int a=sc.nextInt();
				System.out.println("enter new data to add");
				int b=sc.nextInt();
				ls1.modify(a, b);
				break;
			case 5: 
				ls1.deleteBeg();
				break;
			case 6: 
				ls1.deletEnd();
				break;	
			case 7: 
				System.out.println(ls1.firstNode());
				break;
			case 8: 
				System.out.println(ls1.lastNode());
				break;
			case 9:
				int d = sc.nextInt();
				ls1.searchNode(d);
				break;
			case 10:
				System.out.println("length of linkedlist= "+ls1.length());
				break;
			case 11:
				System.out.println("enter data");
				int da = sc.nextInt();
				System.out.println("enter pos");
				int pos=sc.nextInt();
				ls1.insertDataAtPos(da,pos);
				break;
			case 12:
				System.out.println("Enter pos to delete: ");
				int pos1 = sc.nextInt();
				ls1.deleteNth(pos1);
				break;
			}
			
			
			
		}while(ch!=0);
		

	}

}