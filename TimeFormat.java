// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String time,sMinutes;
		if (hours>12) {
			hours=hours-12;
			time="PM";
		} else if (hours==12)
			time="PM";
				else time="AM"; // h is before 12 PM
		if(minutes<10)
			sMinutes="0"+minutes;
		else 
			sMinutes=""+minutes;
		System.out.println(hours+":"+sMinutes+" "+time);
	}
}