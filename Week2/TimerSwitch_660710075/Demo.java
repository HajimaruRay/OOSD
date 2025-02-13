
public class Demo
{
   public static void test(){
       Clock clock = new Clock(9,00,00);
       Day day = new Day("Sun");
       TimerSwitch timerSwitch = new TimerSwitch(clock, day);
       IndicatorLight indicatorLight = new IndicatorLight(timerSwitch);
       ElectricalAppliance electricalAppliance = new ElectricalAppliance(timerSwitch);
       timerSwitch.redButton();
       timerSwitch.redButton();
       timerSwitch.setOnProgram("00:00:00");
       timerSwitch.setOffProgram("00:00:20");
   }
}
