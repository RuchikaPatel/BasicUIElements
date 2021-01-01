package newproject;

public class ThisDemo {
	
	int a= 3;
	static int c;
	 public int sum()
	 {
		 int a=5;
		  c= a + this.a;
		 return c;
	 }
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo d = new ThisDemo();
		d.sum();
		 System.out.println(d);
		System.out.println(c);
		
		
	}

}
