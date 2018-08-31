package javaProgramme.practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateCalenderClass {
	
	public static void show()
	{
		Calendar cal = Calendar.getInstance();
		
		/*System.out.println("Date = "+cal.get(Calendar.DATE));
		
		Date dt = new Date();
		
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT,Locale.UK);
		
		String str = df.format(dt);
		
		System.out.println("Syatem date: "+str);*/
		
		DateFormat df;
		
		df = new SimpleDateFormat("MM-dd-yy h:mm a");
		
		df.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		
		cal.add(Calendar.DAY_OF_MONTH, 2);
		
		Date dt = cal.getTime();
		
		String date = df.format(dt);
		
		
		System.out.println("Date: "+date);
		
		System.out.println("Timezone = "+TimeZone.getTimeZone("America/New_York"));
		
		
	}

}
