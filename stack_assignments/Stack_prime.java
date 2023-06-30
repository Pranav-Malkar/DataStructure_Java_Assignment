package stack_assignments;

public class Stack_prime {

	public static void main(String[] args) {
		
		Mystack a = new Mystack(10);
		//int n=0;
		//System.out.println(a.isEmpty()); 
		
	
			for(int i=2;i<=100;i++)
			{
				boolean temp=false;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						temp=true;
						break;
						
					}
				}
				if(temp==false)
				{
					if(!a.isFull())
					{
					a.push(i);
					}
			    }

			}
			
	
		
		System.out.println(a.toString());
			

	}

}
