package queue_assignment;

public class Customer {
	int cid;
	String cname;
	
   public Customer(int cid,String name)
   {
	        this.cid=cid;
			this.cname=name;
    }

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + "]";
}
   
}