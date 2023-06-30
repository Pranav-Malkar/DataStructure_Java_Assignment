package stack_assignments;

public class Emp{
	int eid,esal;
	String ename;
	
	public Emp(int eid,String ename,int sal)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=sal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", esal=" + esal + ", ename=" + ename + "]";
	}

	
	

}