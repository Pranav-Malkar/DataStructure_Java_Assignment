package dynamic_queue;


public class Node {
	
       Emp data;
       Node next;
       
       public Node(Emp e)
       {
    	   
    	   this.data=e;
    	   this.next=null;
       }
       
       
       public String toString()
       {
    	   return " "+data;
       }
}
