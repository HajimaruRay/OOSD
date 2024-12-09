import java.util.TimerTask;
import java.util.Timer;

public class ElectricalAppliance{
    private TimerSwitch timerSwitch;
    private Timer timer;
    private TimerTask timerTask;
    private boolean Electrical;
    
    public ElectricalAppliance(TimerSwitch timerSwitch){
        this.timerSwitch = timerSwitch;
        timer = new Timer();
        timer.schedule(new TimerTask(){
                public void run(){
                    if (timerSwitch.getIsUpdate()){
                        if (timerSwitch.geteSwitch()){
                            System.out.println("Electrical Appliance is working");
                            Electrical = true;
                        }
                        else if (!timerSwitch.geteSwitch()){
                            System.out.println("Electrical appliances stop working");
                            Electrical = false;
                        }
                        timerSwitch.setIsUpdate(false);
                    }
                }
            },0,1000);
        Electrical = false;
    }
}
