public class Test{
    public static void test(){
        SmartPhone sp = new SmartPhone();
        HeadPhone hp = new HeadPhone();
    
        sp.turnOnBluetooth();
        sp.connecting(hp);
        sp.playMusic();
    }
}
