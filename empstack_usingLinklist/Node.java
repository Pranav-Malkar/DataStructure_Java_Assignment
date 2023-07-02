package empstack_usingLinklist;

public class Node {
	
	Node next;
	Emp e;
	
	public Node()
	{
		next=null;
		e=null;
	}
	
	public Node(Emp e)
	{
		this.e=e;
		next=null;
		
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Emp getE() {
		return e;
	}

	public void setE(Emp e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return e.toString();
	}
}
	
	
	
