public class SmartPhone {
   private boolean musicPlay; // true or false
   private Bluetooth bluetooth;
   private String connectionDevice; // "Speaker", "Headphone"
   
   SmartPhone() {
       musicPlay = false;
       connectionDevice = "Speaker";
   }
   
   public void turnOnBluetooth(Bluetooth b) {
       bluetooth = b;
       if (!bluetooth.getBluetoothStatus()) {
           bluetooth.setBluetoothStatus(true);
           System.out.println("Bluetooth is on.");
       } else {
           System.out.println("Bluetooth is already on.");
       }
   }

   public void turnOffBluetooth() {
       if (bluetooth.getBluetoothStatus()) {
           bluetooth.disconnect();
           bluetooth.setBluetoothStatus(false);
           System.out.println("Bluetooth is off.");
       } else {
           System.out.println("Bluetooth is already off.");
       }
   }

   public void playMusic() {
       musicPlay = true;
       if (connectionDevice.equals("Speaker")) {
           System.out.println("Music is playing through the speaker.");
       } else if (connectionDevice.equals("Headphone")) {
           System.out.println("Music is playing through the headphone.");
       }
   }

   public void pauseMusic() {
       musicPlay = false;
       System.out.println("Music Paused.");
   }

   public void setConnectionDevice(String device) {
       this.connectionDevice = device;
   }
   
   public String getConnectionDevice() {
       return this.connectionDevice;
   }
   
   public Bluetooth getBluetooth() {
       return this.bluetooth;
   }
}