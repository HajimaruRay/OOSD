public class SmartPhone{
   private boolean bluetoothStatus; // true , false
   private boolean connection; // true, false
   private boolean musicPlay; // true , false
   private String connectionDevice; //"Speeker","HeadPhone"
   private HeadPhone headphone;
   
   SmartPhone(){
       bluetoothStatus = false;
       connection = false;
       musicPlay = false;
       connectionDevice = "Speeker";
   }
   
   public void turnOnBluetooth(){
       if (!bluetoothStatus){
           bluetoothStatus = true;
           System.out.println("Bluetooth is on.");
       }
       else{
           System.out.println("Bluetooth is already on.");
       }
   }
   
   public void turnOffBluetooth(){
       if (bluetoothStatus){
           pauseMusic();
           disconnecting();
           bluetoothStatus = false;
           System.out.println("Bluetooth is off.");
       }
       else{
           System.out.println("Bluetooth is already off.");
       }
   }
   
   public void connecting(HeadPhone headphone){
       if (bluetoothStatus){
           connection = true;
           this.headphone = headphone;
           headphone.connectedToSmartphone();
           connectionDevice = "Headphone";
           System.out.println("Device Connected.");
       }
       else{
           System.out.println("Please turn on bluetooth.");
       }
   }
   
   public void disconnecting(){
       if (connection){
           connection = false;
           pauseMusic();
           headphone.disconnectedToSmartphone();
           this.headphone = null;
           connectionDevice = "Speeker";
           System.out.println("Device Disconnected.");
       }
       else{
           System.out.println("Don't have any device is connected.");
       }
   }
   
   public void playMusic(){
       musicPlay = true;
       if (connectionDevice.equals("Speeker")){
           System.out.println("Music is playing through the speaker.");
       }
       else if (connectionDevice.equals("Headphone") && headphone.getIsConnectedToHeadPhone()){
           System.out.println("Music is playing through the Headphone.");
       }
   }
   
   public void pauseMusic(){
       musicPlay = false;
       System.out.println("Music Pause");
   }
}
