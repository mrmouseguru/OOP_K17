package buoi14;

public class Account {
	
	//fields
	private int a;
	private int b;
	//functions - methods

	public void setData(int a, int b) {
		/*thay thế biến acc vào this*/this.a = a;
		this.b = b;
	}
	
	public void showData() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
