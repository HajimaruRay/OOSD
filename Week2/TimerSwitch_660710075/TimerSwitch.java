import java.util.TimerTask;
import java.util.Timer;

public class TimerSwitch{
    private Timer timer;
    private Clock clock;
    private String currentTime; //"HH:MM:SS"
    private String onProgram; //"HH:MM:00"
    private String offProgram; //"HH:MM:00"
    private boolean eSwitch; //switch: True False
    private String state; //"On", "Off", "Auto"
        
    TimerSwitch(Clock clock){
        timer = new Timer();
        this.clock = clock;
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                check();
                clock.run();
            }
        }, 0, 1000);
        state = "ON";
    }
    
    public void check(){
        currentTime = clock.getCurrentTime().toString();
        currentTime = currentTime.substring(0,8);
        System.out.println(currentTime);
        if (currentTime.equals(onProgram) && state.equals("AUTO")){
            eSwitch = true;
            System.out.println("System ON");
        }
        else if (currentTime.equals(offProgram) && state.equals("AUTO")){
            eSwitch = false;
            System.out.println("System OFF");
        }
    }
   
    public void redButton(){
        if (state.equals("ON")){
            state = "OFF";
            System.out.println("System OFF");
            eSwitch = false;
        }
        else if(state.equals("OFF")){
            state = "AUTO";
        }
        else if(state.equals("AUTO")){
            state = "ON";
            System.out.println("System ON");
            eSwitch = true;
        }
    }
    
    public String getState(){
        System.out.println(state);
        return state;
    }
    
    public void powerOff(){
        timer.cancel();
        clock.cancel();
    }
    
    public void powerOn(){
        timer = new Timer();
        clock = new Clock();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                check();
                clock.run();
            }
        }, 0, 1000);
        state = "ON";
    }
    
    public void setOnProgram(String when){
        onProgram = when;
    }
    
    public void setOffProgram(String when){
        offProgram = when;
    }
}