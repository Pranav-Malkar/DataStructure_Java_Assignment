package polynominal_queue_linklist;

import java.util.Scanner;
public class Demo_POlynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Dynamic_LL p = new Dynamic_LL();
		
		
		int ch,coeff,exp;
		
		
		do {
			System.out.println("1.add");
			System.out.println("2.delete");
			System.out.println("3.display");
			ch=sc.nextInt();
			
			
			switch(ch)
			{
			case 1:
				System.out.println("enter coef and exp");
				coeff=sc.nextInt();
				exp=sc.nextInt();
				Polynomial p1 = new Polynomial(coeff, exp);
				p.addend(p1);
				break;
			case 2:
				p.deleteEnd();
				break;
			case 3:
				System.out.println(p.toString());
			     
			     break;
			}
			
		}while(ch!=0);

	}

}