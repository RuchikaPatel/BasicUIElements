package newproject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YY HH:mm::ss");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.AM_PM));


	}
}
