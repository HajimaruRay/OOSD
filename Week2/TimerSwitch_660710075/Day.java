import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Day {
    private int day;
    
    Day() {
        LocalDate currentDate = LocalDate.now();
        this.day = currentDate.getDayOfWeek().getValue(); // Get day as an integer (1 = Monday, 7 = Sunday)
    }

    Day(String d) {
        d = d.toLowerCase();
        switch (d) {
            case "sun":
                day = 7;
                break;
            case "mon":
                day = 1;
                break;
            case "tue":
                day = 2;
                break;
            case "wed":
                day = 3;
                break;
            case "thu":
                day = 4;
                break;
            case "fri":
                day = 5;
                break;
            case "sat":
                day = 6;
                break;
            default:
                throw new IllegalArgumentException("Invalid day string: " + d); // Handle invalid input
        }
    }

    public int getDay() {
        return day;
    }
}
