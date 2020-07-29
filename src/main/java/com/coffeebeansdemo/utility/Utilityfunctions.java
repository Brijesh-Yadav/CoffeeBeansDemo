package com.coffeebeansdemo.utility;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utilityfunctions {
	
	public static String getTodysDate() {
		// getting current date and time using Date class
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dateobj = new Date();
		Calendar c = Calendar.getInstance();
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String day = days[c.get(Calendar.DAY_OF_WEEK) - 1];
		String dated = df.format(dateobj);
		String daysplitted = day.substring(0, 3);
		String mnth = dated.substring(4, 5);
		String mnthdate = dated.substring(0,2);
		String year = dated.substring(dated.length()-4);
		String monthname = getMonthForInt(Integer.parseInt(mnth));
		String fnst = daysplitted+", "+mnthdate+" "+monthname+", "+year;
		return fnst;
	}

	public static String getFutureDate(int dt) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, dt); // Adding 5 days
		String output = sdf.format(c.getTime());
//		System.out.println(output);
//		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
//		System.out.println("day of week " + dayOfWeek);
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String day =  days[c.get(Calendar.DAY_OF_WEEK) - 1];
		String mnth = output.substring(4, 5);
		String mnthdate = output.substring(0,2);
		String year = output.substring(output.length()-4);
		String daysplitted = day.substring(0, 3);
		String monthname = getMonthForInt(Integer.parseInt(mnth));
		String fnst = daysplitted+", "+mnthdate+" "+monthname+", "+year;
		return fnst;
	}

	private static String  getMonthForInt(int number) {
		int num = number-1;
		String month = "wrong";
		DateFormatSymbols dfs = new DateFormatSymbols();
		String[] months = dfs.getMonths();
		if (num >= 0 && num <= 11) {
			month = months[num];
		}
		String monthnm = month.substring(0, 3);
		return monthnm;
	}

}
