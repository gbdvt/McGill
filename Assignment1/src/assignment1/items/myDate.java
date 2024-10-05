package assignment1.items;
import java.time.LocalDate;

public class myDate {
	int day;
	int month;
	int year;
	
	public static int[] SUMMER_MONTHS();
	public static int[] WINTER_MONTHS();
	
	public myDate(int day, int month, int year) {
		if(!isValidDate(day, month, year)) {
			throw new IllegalArgumentException("Invalid date provided: " + day + "/" + month + "/" + year);
		}
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() 	{
		return year;
	}
	
	
	private boolean isValidDate(int day, int month, int year) {
		if (month < 1 || month >12) {
			return false;
		}
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return day >= 1 && day <= daysInMonth[month - 1];
	}
	
	/*public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Reference equality
        }
        if (obj instanceof myDate) {
            myDate other = (myDate) obj;
            return this.day == other.day && this.month == other.month && this.year == other.year;
        }
        return false; // Not the same type
    }

    // Static method to get today's date
    public static myDate today() {
        LocalDate today = LocalDate.now();
        return new myDate(today.getDayOfMonth(), today.getMonthValue(), today.getYear());
    }

    // Override toString() for a formatted date output
    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }*/
}
