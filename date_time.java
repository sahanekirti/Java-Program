import java.time.*;
import java.time.format.DateTimeFormatter;
public class date_time {
	public static void main(String[] args) {
		// for time
		LocalTime t1 = LocalTime.now();

	//	System.out.println(t1);
		// for date
		LocalDate d1 = LocalDate.now();

	//	System.out.println(d1);
		// date nd time
		LocalDateTime dt = LocalDateTime.now();

	//	System.out.println(dt);
		// date time formatting

DateTimeFormatter df = DateTimeFormatter.ofPattern("dd:MM:yyyy H:m:s a"); // This is the format
		 // This is the format
		String myDate = dt.format(df); // Creating date str
System.out.println(myDate);

 DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

	 // This is the format
	String myDate1 = dt.format(df2); 
	// Creating date str
  System.out.println(myDate1);


	}
}