package cyber.pack1;

public class Y {
	
	private X x;

	public Y() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Y(X x) {
		super();
		this.x = x;
	}

	public X getX() {
		return x;
	}

	public void setX(X x) {
		this.x = x;
	}
	
	public String showMsg()
	{
		return x.displayMsg();
	}

}
