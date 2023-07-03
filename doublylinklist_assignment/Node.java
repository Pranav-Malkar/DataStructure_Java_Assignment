package doublylinklist_assignment;

public class Node {
	
	int data;
	Node next,prev;
	
	public Node(int data)
	{
		this.data=data;
		this.next=this.prev=null;
	}
	

	@Override
	public String toString() {
		return " "+data;
	}
	

}