import java.util.TimerTask;
import java.time.LocalTime;

public class Clock extends TimerTask{
    
    private LocalTime currentTime;
    
    Clock(){
        currentTime = LocalTime.now();
    }
    Clock(int hour, int minute, int second){
        currentTime = LocalTime.of(hour, minute, second);
    }
    public void run(){
        currentTime = currentTime.plusSeconds(1);
    }
    public LocalTime getCurrentTime(){
        return currentTime;
    }
}