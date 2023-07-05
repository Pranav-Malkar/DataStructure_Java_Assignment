package dynamic_queue;

public class Emp {
	int eid;
	String ename;
	int sal;
	
	public Emp(int eid,String ename,int sal)
	{
		this.eid=eid;
		this.ename=ename;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
	

}