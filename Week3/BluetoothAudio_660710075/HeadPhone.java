class HeadPhone {
    private boolean isConnectedToSmartphone;

    HeadPhone() {
        isConnectedToSmartphone = false;
    }

    public void connectToSmartphone() {
        isConnectedToSmartphone = true;
        System.out.println("Headphone connected to smartphone.");
    }

    public void disconnectFromSmartphone() {
        isConnectedToSmartphone = false;
        System.out.println("Headphone disconnected from smartphone.");
    }
}