import java.util.Date;

public class Day{
    private String d;
    private int day;
    private Date date;
    
    Day(){
        date = new Date();
        day = date.getDate();
    }
    Day(String d){
        if (d.equalsIgnoreCase("sun")){
            day = 1;
        }
        else if (d.equalsIgnoreCase("mon")){
            day = 2;
        }
        else if (d.equalsIgnoreCase("tue")){
            day = 3;
        }
        else if (d.equalsIgnoreCase("wed")){
            day = 4;
        }
        else if (d.equalsIgnoreCase("thu")){
            day = 5;
        }
        else if (d.equalsIgnoreCase("fri")){
            day = 6;
        }
        else if (d.equalsIgnoreCase("sat")){
            day = 7;
        }
    }
    
    public int getDay(){
        return day;
    }
}
