import java.util.TimerTask;
import java.time.LocalTime;

public class Clock extends TimerTask{
    
    private LocalTime currentTime;
    Clock(){
        currentTime = LocalTime.now();
    }
    public void run(){
        currentTime = currentTime.plusSeconds(1);
    }
    public LocalTime getCurrentTime(){
        return currentTime;
    }
}