package newproject;

public class ChildDemo extends ParentDemo {
	
	public void getName()
	{
		super.getName();

		String name ="keyur";
		System.out.println(name);
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildDemo cd= new ChildDemo();
		cd.getName();

	}

}
