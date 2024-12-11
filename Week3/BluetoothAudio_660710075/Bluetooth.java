class Bluetooth {
    private boolean bluetoothStatus; // true or false
    private boolean connection; // true or false
    private HeadPhone headPhone;
    private SmartPhone smartPhone;

    Bluetooth(SmartPhone smartPhone) {
        bluetoothStatus = false;
        connection = false;
        this.smartPhone = smartPhone;
    }

    public void connectToHeadphone(HeadPhone headPhone) {
        this.headPhone = headPhone;
        if (bluetoothStatus) {
            connection = true;
            headPhone.connectToSmartphone();
            smartPhone.setConnectionDevice("Headphone");
            System.out.println("Device Connected to Headphone.");
        } else {
            System.out.println("Please turn on Bluetooth first.");
        }
    }

    public void disconnect() {
        if (connection) {
            connection = false;
            headPhone.disconnectFromSmartphone();
            smartPhone.setConnectionDevice("Speaker");
            headPhone = null;
            System.out.println("Device Disconnected.");
        }
    }

    public boolean getBluetoothStatus() {
        return bluetoothStatus;
    }

    public void setBluetoothStatus(boolean status) {
        this.bluetoothStatus = status;
    }
}
