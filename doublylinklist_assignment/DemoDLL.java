package doublylinklist_assignment;

import java.util.Scanner;

public class DemoDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Scanner sc= new Scanner(System.in);
	 
	 DoublyLinkedList list = new DoublyLinkedList();
	 
	 int ch;
	 do {
		 System.out.println("1.create DLL");
		 System.out.println("2.Display DLL");
		 System.out.println("3.Display reverse");
		 System.out.println("4.delete data");
		 System.out.println("5.Search data");
		 System.out.println("6.length of DLL");
		 System.out.println("7.insert data at pos");
		 ch=sc.nextInt();
		 
		 switch(ch)
		 {
		 case 1: 
			 System.out.println("enter data ");
			 int data=sc.nextInt();
			 
			 list.createDoublyLL(data);
			 break;
		 case 2:
			 list.display();
			 break;
		 case 3: 
			 list.displayRev();
			 break;
		 case 4:
			 System.out.println("enter data to delete");
			 int data2=sc.nextInt();
			 list.deleteNode(data2);
			 break;
		 case 5:
			 System.out.println("enter data to search");
			 int d=sc.nextInt();
			 list.search(d);
			 break;
		 case 6:
			 System.out.println("Length of DLL: "+list.length());
			 break;
		 case 7:
			 int pos=sc.nextInt();
			 System.out.println("enter data ");
			 int da=sc.nextInt();
			 list.insertNode(pos, da);
		 }
	 }while(ch!=0);

	}

}