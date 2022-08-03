package Creational.factory;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class FactoryEverydayDemo {

	public static void main(String args []) {
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance(Locale.ENGLISH);
		Calendar cal3 = Calendar.getInstance(TimeZone.getDefault(), Locale.ENGLISH);
		
		System.out.println("\n"+cal1+"\n");
		System.out.println(cal1.get(Calendar.YEAR));
	}
	
}
