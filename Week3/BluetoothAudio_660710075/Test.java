public class Test{
    public static void test(){
        SmartPhone myPhone = new SmartPhone();
        Bluetooth bt = new Bluetooth(myPhone);
        HeadPhone myHeadPhone = new HeadPhone();
        
        myPhone.turnOnBluetooth(bt);
        myPhone.getBluetooth().connectToHeadphone(myHeadPhone);
        myPhone.playMusic();
    }
}
