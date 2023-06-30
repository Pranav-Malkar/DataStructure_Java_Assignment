package stack_assignments;

public class Balance_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String str ="{()}";
		CharStack c = new CharStack(str.length());
	//	System.out.println(c.pop());
		
	
		 boolean flag=false;
		for(int i=0;i<str.length();i++)
		{   
			char ch=str.charAt(i);
			if(ch=='('||ch=='{'||ch=='[')
				{
				c.push(ch);
			}
			else
			{
			char ch1=c.pop();
			//System.out.println(ch1);
			if((ch=='}'&&ch1=='{')||(ch==']'&&ch1=='[')||(ch==')'&&ch1=='('))
			{
				flag=true;
				
			}
			else {
				flag=false;
				break;
			}
			
			}
			
		}
			if(flag==true && c.isEmpty() )
			{
				System.out.println("balanced");
			}
			else
			{
				System.out.println("UNBALANCED");
			} 

	}

}