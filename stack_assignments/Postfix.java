package stack_assignments;

import java.util.Scanner;

public class Postfix {

	public static void main(String[] args) {
		String str="ABC*+D-";
		Scanner sc = new Scanner(System.in);
		
		Mystack a = new Mystack(str.length());
		
		
		for(int i=0;i<str.length();i++)
		{char ch=str.charAt(i);
		System.out.println(ch);
		
			if(ch>='A'&& ch<='Z')
			{
				System.out.println("Enter value of: "+ch);
				int num=sc.nextInt();
				a.push(num);
				System.out.println(a.toString());
			}
			else
			{
				char ch1=str.charAt(i);
				int n1=a.pop();
				int n2=a.pop();
				
				
				switch(ch1)
				{
				case '+' :
					int sum=n1+n2;
					a.push(sum);
					
				break;
				case '-':
					int sub=n2-n1;
					a.push(sub);
				break;
				
				case '*':
					int mul =n2*n1;
					a.push(mul);
					break;
				case '/':
					int div=n2/n1;
					a.push(div);
					break;
					
				}
				
					
					
					
					
					
				}
			}
	  
		
		
	System.out.print("Final product: ");
	a.peak();
		
		}
		

	}
