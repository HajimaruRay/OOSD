import java.util.TimerTask;
import java.util.Timer;

public class IndicatorLight{
    private TimerSwitch timerSwitch;
    private Timer timer;
    private TimerTask timerTask;
    private boolean light;
    
    public IndicatorLight(TimerSwitch timerSwitch){
        this.timerSwitch = timerSwitch;
        timer = new Timer();
        timer.schedule(new TimerTask(){
                public void run(){
                    if (timerSwitch.getIsUpdate()){
                        if (timerSwitch.geteSwitch()){
                            System.out.println("Indicator Light On");
                            light = true;
                        }
                        else if (!timerSwitch.geteSwitch()){
                            System.out.println("Indicator Light Off");
                            light = false;
                        }
                        timerSwitch.setIsUpdate(false);
                    }
                }
            },0,1000);
        light = false;
    }
}
