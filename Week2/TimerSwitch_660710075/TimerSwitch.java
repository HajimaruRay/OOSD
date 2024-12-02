import java.util.TimerTask;
import java.util.Timer;
import java.util.Date;

public class TimerSwitch{
    private Date date;
    private Timer timer;
    private Clock clock;
    private String currentTime; //"HH:MM:SS"
    private String onProgram; //"HH:MM:00"
    private String offProgram; //"HH:MM:00"
    private boolean eSwitch; //switch: True False
    private String state; //"On", "Off", "Auto"
    private int programMode; //1 - 15
    private boolean isUpdate;
        
    TimerSwitch(Clock clock){
        date = new Date();
        timer = new Timer();
        this.clock = clock;
        timer.schedule(new TimerTask() {
            public void run() {
                check();
                clock.run();
            }
        }, 0, 1000);
        state = "ON";
        eSwitch = true;
        programMode = 1;
        isUpdate = true;
    }
    
    public void check(){
        currentTime = clock.getCurrentTime().toString();
        currentTime = currentTime.substring(0,8);
        //System.out.println(date.getDate() + " " + currentTime);
        if(date.getDate() == 1){
            System.out.println("Sun " + currentTime);
        }
        else if(date.getDate() == 2){
            System.out.println("Mon " + currentTime);
        }
        else if(date.getDate() == 3){
            System.out.println("Tue " + currentTime);
        }
        else if(date.getDate() == 4){
            System.out.println("Wed " + currentTime);
        }
        else if(date.getDate() == 5){
            System.out.println("Thu " + currentTime);
        }
        else if(date.getDate() == 6){
            System.out.println("Fri " + currentTime);
        }
        else if(date.getDate() == 7){
            System.out.println("Sat " + currentTime);
        }
        program();
    }
   
    public void redButton(){
        if (state.equals("ON")){
            state = "OFF";
            //System.out.println("System OFF");
            System.out.println("Mode OFF");
            eSwitch = false;
            isUpdate = true;
        }
        else if(state.equals("OFF")){
            //System.out.println("Mode Auto");
            state = "AUTO";
        }
        else if(state.equals("AUTO")){
            state = "ON";
            //System.out.println("System ON");
            System.out.println("Mode ON");
            eSwitch = true;
            isUpdate = true;
        }

    }
  
    public void powerOff(){
        timer.cancel();
        clock.cancel();
    }
    
    public void powerOn(){
        date = new Date();
        timer = new Timer();
        clock = new Clock();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                check();
                clock.run();
            }
        }, 0, 1000);
        state = "ON";
        programMode = 1;
        isUpdate = true;
    }
    
    public void setOnProgram(String when){
        onProgram = when;
    }
    
    public void setOffProgram(String when){
        offProgram = when;
    }
    
    public void setProgramType(){
        if (programMode >= 1 && programMode <= 14){
            programMode++;
        }
        else{
            programMode = 0;
        }
    }
    
    public void clear(){
        onProgram = null;
        offProgram = null;
    }
    
    public boolean getIsUpdate(){
        return isUpdate;
    }
    
    public void setIsUpdate(boolean key){
        isUpdate = key;
    }
    
    public void program(){
        // Program 1
        if (programMode == 1){
            if((date.getDate() == 1 || date.getDate() == 2 || date.getDate() == 3 || date.getDate() == 4 || date.getDate() == 5 || date.getDate() == 6 || date.getDate() == 7) && currentTime.equals(onProgram) && state.equals("AUTO")){
                eSwitch = true;
                isUpdate = true;
                //System.out.println("System ON");
            }else if ((date.getDate() == 1 || date.getDate() == 2 || date.getDate() == 3 || date.getDate() == 4 || date.getDate() == 5 || date.getDate() == 6 || date.getDate() == 7) && currentTime.equals(offProgram) && state.equals("AUTO")){
                eSwitch = false;
                isUpdate = true;
                //System.out.println("System OFF");
            }
        }
        // Program 2
        else if (programMode == 2){
            if(date.getDate() == 2 && currentTime.equals(onProgram) && state.equals("AUTO")){
                eSwitch = true;
                isUpdate = true;
                //System.out.println("System ON");
            }else if (date.getDate() == 2 && currentTime.equals(offProgram) && state.equals("AUTO")){
                eSwitch = false;
                isUpdate = true;
                //System.out.println("System OFF");
            }
        }
        // Program 3
        else if (programMode == 3){
            if(date.getDate() == 3 && currentTime.equals(onProgram) && state.equals("AUTO")){
                eSwitch = true;
                isUpdate = true;
                //System.out.println("System ON");
            }else if (date.getDate() == 3 && currentTime.equals(offProgram) && state.equals("AUTO")){
                eSwitch = false;
                isUpdate = true;
                //System.out.println("System OFF");
            }
        }
        // Program 4
        else if (programMode == 4){
            if(date.getDate() == 4 && currentTime.equals(onProgram) && state.equals("AUTO")){
                eSwitch = true;
                isUpdate = true;
                //System.out.println("System ON");
            }else if (date.getDate() == 4 && currentTime.equals(offProgram) && state.equals("AUTO")){
                eSwitch = false;
                isUpdate = true;
                //System.out.println("System OFF");
            }
        }
        // Program 5
        else if (programMode == 5){
            if(date.getDate() == 5 && currentTime.equals(onProgram) && state.equals("AUTO")){
                eSwitch = true;
                isUpdate = true;
                //System.out.println("System ON");
            }else if (date.getDate() == 5 && currentTime.equals(offProgram) && state.equals("AUTO")){
                eSwitch = false;
                isUpdate = true;
                //System.out.println("System OFF");
            }
        }
        // Program 6
        else if (programMode == 6){
            if(date.getDate() == 6 && currentTime.equals(onProgram) && state.equals("AUTO")){
                eSwitch = true;
                isUpdate = true;
                //System.out.println("System ON");
            }else if (date.getDate() == 6 && currentTime.equals(offProgram) && state.equals("AUTO")){
                eSwitch = false;
                isUpdate = true;
                //System.out.println("System OFF");
            }
        }
        // Program 7
        else if (programMode == 7){
            if(date.getDate() == 7 && currentTime.equals(onProgram) && state.equals("AUTO")){
                eSwitch = true;
                isUpdate = true;
                //System.out.println("System ON");
            }else if (date.getDate() == 7 && currentTime.equals(offProgram) && state.equals("AUTO")){
                eSwitch = false;
                isUpdate = true;
                //System.out.println("System OFF");
            }
        }
        // Program 8
        else if (programMode == 8){
            if(date.getDate() == 1 && currentTime.equals(onProgram) && state.equals("AUTO")){
                eSwitch = true;
                isUpdate = true;
                //System.out.println("System ON");
            }else if (date.getDate() == 1 && currentTime.equals(offProgram) && state.equals("AUTO")){
                eSwitch = false;
                isUpdate = true;
                //System.out.println("System OFF");
            }
        }
        // Program 9
        else if (programMode == 9){
            if((date.getDate() == 2 || date.getDate() == 4 || date.getDate() == 6) && currentTime.equals(onProgram) && state.equals("AUTO")){
                eSwitch = true;
                isUpdate = true;
                //System.out.println("System ON");
            }else if ((date.getDate() == 2 || date.getDate() == 4 || date.getDate() == 6) && currentTime.equals(offProgram) && state.equals("AUTO")){
                eSwitch = false;
                isUpdate = true;
                //System.out.println("System OFF");
            }
        }
        // Program 10
        else if (programMode == 10){
            if((date.getDate() == 3 || date.getDate() == 5 || date.getDate() == 7) && currentTime.equals(onProgram) && state.equals("AUTO")){
                eSwitch = true;
                isUpdate = true;
                //System.out.println("System ON");
            }else if ((date.getDate() == 3 || date.getDate() == 5 || date.getDate() == 7) && currentTime.equals(offProgram) && state.equals("AUTO")){
                eSwitch = false;
                isUpdate = true;
                //System.out.println("System OFF");
            }
        }
        // Program 11
        else if (programMode == 11){
            if((date.getDate() == 7 || date.getDate() == 1) && currentTime.equals(onProgram) && state.equals("AUTO")){
                eSwitch = true;
                isUpdate = true;
                //System.out.println("System ON");
            }else if ((date.getDate() == 7 || date.getDate() == 1) && currentTime.equals(offProgram) && state.equals("AUTO")){
                eSwitch = false;
                isUpdate = true;
                //System.out.println("System OFF");
            }
        }
        // Program 12
        else if (programMode == 12){
            if((date.getDate() == 2 || date.getDate() == 3 || date.getDate() == 4) && currentTime.equals(onProgram) && state.equals("AUTO")){
                eSwitch = true;
                isUpdate = true;
                //System.out.println("System ON");
            }else if ((date.getDate() == 2 || date.getDate() == 3 || date.getDate() == 4) && currentTime.equals(offProgram) && state.equals("AUTO")){
                eSwitch = false;
                isUpdate = true;
                //System.out.println("System OFF");
            }
        }
        // Program 13
        else if (programMode == 13){
            if((date.getDate() == 5 || date.getDate() == 6 || date.getDate() == 7) && currentTime.equals(onProgram) && state.equals("AUTO")){
                eSwitch = true;
                isUpdate = true;
                //System.out.println("System ON");
            }else if ((date.getDate() == 5 || date.getDate() == 6 || date.getDate() == 7) && currentTime.equals(offProgram) && state.equals("AUTO")){
                eSwitch = false;
                isUpdate = true;
                //System.out.println("System OFF");
            }
        }
        // Program 14
        else if (programMode == 14){
            if((date.getDate() == 2 || date.getDate() == 3 || date.getDate() == 4 || date.getDate() == 5 || date.getDate() == 6) && currentTime.equals(onProgram) && state.equals("AUTO")){
                eSwitch = true;
                isUpdate = true;
                //System.out.println("System ON");
            }else if ((date.getDate() == 2 || date.getDate() == 3 || date.getDate() == 4 || date.getDate() == 5 || date.getDate() == 6) && currentTime.equals(offProgram) && state.equals("AUTO")){
                eSwitch = false;
                isUpdate = true;
                //System.out.println("System OFF");
            }
        }
        // Program 15
        else if (programMode == 15){
            if((date.getDate() == 2 || date.getDate() == 3 || date.getDate() == 4 || date.getDate() == 5 || date.getDate() == 6 || date.getDate() == 7) && currentTime.equals(onProgram) && state.equals("AUTO")){
                eSwitch = true;
                isUpdate = true;
                //System.out.println("System ON");
            }else if ((date.getDate() == 2 || date.getDate() == 3 || date.getDate() == 4 || date.getDate() == 5 || date.getDate() == 6 || date.getDate() == 7) && currentTime.equals(offProgram) && state.equals("AUTO")){
                eSwitch = false;
                isUpdate = true;
                //System.out.println("System OFF");
            }
        }
        
        }
        
    public boolean geteSwitch(){
        return eSwitch;
    }
}