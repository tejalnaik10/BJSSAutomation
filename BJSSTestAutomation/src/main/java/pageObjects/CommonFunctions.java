package pageObjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommonFunctions {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date today = new Date();
	Calendar calendar = Calendar.getInstance();

	public String nextBusinessDay() {

		calendar.setTime(today);

		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		if (dayOfWeek == Calendar.FRIDAY) {
			calendar.add(Calendar.DATE, 3);
		} else if (dayOfWeek == Calendar.SATURDAY) {
			calendar.add(Calendar.DATE, 2);
		} else {
			calendar.add(Calendar.DATE, 1);
		}

		Date nextBusinessDay = calendar.getTime();
		return dateFormat.format(nextBusinessDay);
	}

}
