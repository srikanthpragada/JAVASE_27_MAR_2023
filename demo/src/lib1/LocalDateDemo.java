package lib1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateDemo {

	public static void main(String[] args) {
		var d1 = LocalDate.now();
		var d2 = LocalDate.of(2023, 1, 1);
		var d3 = LocalDate.parse("10-04-2023", DateTimeFormatter.ofPattern("dd-MM-uuuu"));

		var d4 = d1.plusDays(10);

		System.out.println(d1); // d1.toString()
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);

		LocalTime singtime = LocalTime.now(ZoneId.of("Asia/Singapore"));
		System.out.println(singtime);

		var format = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(d1.format(format));

		format = DateTimeFormatter.ofPattern("dd-MM-uuuu");
		System.out.println(d1.format(format));

		
		format =  DateTimeFormatter.ofPattern("dd-MMM-uuuu HH:mm:ss"); 
		System.out.println(LocalDateTime.now().format(format));
		
	}

}
