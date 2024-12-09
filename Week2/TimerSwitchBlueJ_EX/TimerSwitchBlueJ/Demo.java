public class Demo
{
    public static void test(){
    TSClock clock=new TSClock(9,0,0);
    TimerSwitch ts=new TimerSwitch(clock);
    Load light=new Light();
    ts.connectTo(light);
    ts.addOnProgram("09:01");//กำหนดเวลาเปิด
    ts.addOffProgram("09:02");//กำหนดเวลาปิด
    ts.redButton();
    ts.redButton();
    ts.powerOn();
    }
}
