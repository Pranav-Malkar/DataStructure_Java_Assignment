package empstack_usingLinklist;

public class Emp {
	
	int empid;
	String ename;
	int sal;
	
	public Emp()
	{
		empid=0;
		ename="null";
		sal=0;
	}
	
	public Emp(int id,String name,int sal)
	{
		this.empid=id;
		this.ename=name;
		this.sal=sal;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	

}