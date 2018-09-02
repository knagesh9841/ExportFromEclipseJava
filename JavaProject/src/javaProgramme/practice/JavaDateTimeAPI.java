package javaProgramme.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class JavaDateTimeAPI {
	
	public static void show()
	{
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);  
		LocalDate tomorrow = yesterday.plusDays(2);  
		System.out.println("Today date: "+date);  
		System.out.println("Yesterday date: "+yesterday);  
		System.out.println("Tommorow date: "+tomorrow);  

		LocalDate date1 = LocalDate.of(2017, 1, 13);  
		System.out.println(date1.isLeapYear());  
		System.out.println("Date : "+date1);
		
		LocalDateTime datetime = date.atTime(1,50,9);      
	    System.out.println(datetime); 
	    
	    LocalTime time = LocalTime.now();  
	    System.out.println("Time: "+time); 
	    
	   
	    LocalTime time1 = LocalTime.of(10,43,12);  
	    System.out.println("Time: = "+time1);  
	    LocalTime time2=time1.minusHours(2);  
	    LocalTime time3=time2.minusMinutes(34);  
	    System.out.println("Time = "+time2);
	    System.out.println("Time = "+time3);  
	    
	    ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
	    time1 = LocalTime.now(zone1);  
	    System.out.println("India Time Zone: "+time1);  
	    
	    datetime = time1.atDate(date);    
	    System.out.println(datetime); 
	    
	    LocalDateTime now = LocalDateTime.now();  
        System.out.println("Before Formatting: " + now);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");  
        String formatDateTime = now.format(format);  
        System.out.println("After Formatting: " + formatDateTime);  
        
        
        System.out.println("Two Date Equals = "+date.equals(date1));
	      
	}

}
