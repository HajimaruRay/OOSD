class HeadPhone{
    private boolean isConnectedToHeadPhone;
    
    HeadPhone(){
        isConnectedToHeadPhone = false;
    }
    
    public void connectedToSmartphone(){
        isConnectedToHeadPhone = true;
        System.out.println("Connected to smartphone Successful.");
    }
    
    public void disconnectedToSmartphone(){
        isConnectedToHeadPhone = false;
        System.out.println("Disconnected to smartphone Successful.");
    }
    
    public boolean getIsConnectedToHeadPhone(){
        return isConnectedToHeadPhone;
    }
}