package dynamic_queue;

public class Polynomial {
	int coef,expo;
	
	public Polynomial(int coef,int expo)
	{
		this.coef=coef;
		this.expo=expo;
	}
	
	public String toString()
	{
		return ""+coef+"x^"+expo;
	}

}