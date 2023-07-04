package polynominal_queue_linklist;

public class Node {
	Polynomial data;
     Node next;
     
     public Node(Polynomial e)
     {
  	   
  	   this.data=e;
  	   this.next=null;
     }
     
     
     public String toString()
     {
  	   return data.toString();
     }

}