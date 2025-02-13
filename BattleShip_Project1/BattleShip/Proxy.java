public class Proxy implements BattleShipGameBluePrint {
    private BattleShipGame realGame;
    private int User1Place2Long;
    private int User1Place3Long;
    private int User2Place2Long;
    private int User2Place3Long;
    private int turnNumber; // 1 = 1'st player, 2 = 2'nd player

    public Proxy() {
        realGame = new BattleShipGame();
        User1Place2Long = 0;
        User1Place3Long = 0;
        User2Place2Long = 0;
        User2Place3Long = 0;
        turnNumber = 1; // set turnNumber to 1 by defult
    }

    @Override
    public boolean shoot(int playerID, int yAxis, int xAxis) {
        if (turnNumber != playerID) {
            System.out.println("Not your turn!");
            return false;
        }
        if ((playerID < 1 || playerID > 2) || (xAxis < 0 || xAxis > 6) || (yAxis < 0 || yAxis > 6)) {
            System.out.println("Invalid input!");
            return false;
        }
        boolean isHit = realGame.shoot(playerID, yAxis, xAxis);
        realGame.isGameOver();
        if (isHit){
            return true; 
        }
        if (turnNumber == 1){
            turnNumber = 2;
        } else if (turnNumber == 2){
            turnNumber = 1;
        }
        return true;
    }

    @Override
    public boolean placeShip2Long(int playerID, int firstSpotyAxis, int firstSpotxAxis, int secendSpotyAxis,
            int secendSpotxAxis) {
        if (User1Place2Long >= 2 && playerID == 1) {
            System.out.println("This type of ship cannot be placed anymore please select another type!");
            return false;
        }
        if (User2Place2Long >= 2 && playerID == 2) {
            System.out.println("This type of ship cannot be placed anymore please select another type!");
            return false;
        }

        if ((firstSpotxAxis < 0 || firstSpotxAxis > 6) || (firstSpotyAxis < 0 || firstSpotyAxis > 6)
                || (secendSpotxAxis < 0 || secendSpotxAxis > 6) || (secendSpotyAxis < 0 || secendSpotyAxis > 6) 
                || ((firstSpotxAxis == secendSpotxAxis) && (firstSpotyAxis == secendSpotyAxis))) {
            System.out.println("Invalid Input!");
            return false;
        }
        boolean isXPass = false;
        boolean isYPass = false;
        
        if ((firstSpotxAxis - 1 == secendSpotxAxis) || (firstSpotxAxis + 1 == secendSpotxAxis) || (firstSpotxAxis == secendSpotxAxis)){
            isXPass = true;
        }
        if ((firstSpotyAxis - 1 == secendSpotyAxis) || (firstSpotyAxis + 1 == secendSpotyAxis) || (firstSpotyAxis == secendSpotyAxis)){
            isYPass = true;
        }
        if (!isXPass){
            System.out.println("The boats must be stuck together!");
            return false;
        } else if (!isYPass){
            System.out.println("The boats must be stuck together!");
            return false;
        }
        
        if (playerID == 1 && realGame.placeShip2Long(playerID, firstSpotyAxis, firstSpotxAxis, secendSpotyAxis,
                secendSpotxAxis)) {
            User1Place2Long++;
        } else if (playerID == 2 && realGame.placeShip2Long(playerID, firstSpotyAxis, firstSpotxAxis, secendSpotyAxis,
                secendSpotxAxis)) {
            User2Place2Long++;
        }
        realGame.display(playerID);
        return true;
    }

    @Override
    public boolean placeShip3Long(int playerID, int firstSpotyAxis, int firstSpotxAxis, int secendSpotyAxis,
            int secendSpotxAxis, int thirdSpotyAxis, int thirdSpotxAxis) {  
        if (User1Place3Long >= 2 && playerID == 1) {
            System.out.println("This type of ship cannot be placed anymore please select another type!");
            return false;
        }
        if (User2Place3Long >= 2 && playerID == 2) {
            System.out.println("This type of ship cannot be placed anymore please select another type!");
            return false;
        }
        
        if ((firstSpotxAxis < 0 || firstSpotxAxis > 6) || (firstSpotyAxis < 0 || firstSpotyAxis > 6)
                || (secendSpotxAxis < 0 || secendSpotxAxis > 6) || (secendSpotyAxis < 0 || secendSpotyAxis > 6)
                || (thirdSpotxAxis < 0 || thirdSpotxAxis > 6) || (thirdSpotxAxis < 0 || thirdSpotxAxis > 6)
                || ((firstSpotxAxis == secendSpotxAxis) && (firstSpotyAxis == secendSpotyAxis)) 
                || ((firstSpotxAxis == thirdSpotxAxis) && (firstSpotyAxis == thirdSpotyAxis))
                || ((thirdSpotxAxis == secendSpotxAxis) && (thirdSpotyAxis == secendSpotyAxis))) {
            System.out.println("Invalid Input!");
            return false;
        }

        boolean isXPass = false;
        boolean isYPass = false;
        
        if ((firstSpotxAxis - 1 == secendSpotxAxis) || (firstSpotxAxis + 1 == secendSpotxAxis) || (firstSpotxAxis == secendSpotxAxis) 
            && (firstSpotxAxis - 2 == thirdSpotxAxis) || (firstSpotxAxis + 2 == thirdSpotxAxis) || (firstSpotxAxis == thirdSpotxAxis)){
            isXPass = true;
        }
        if ((firstSpotyAxis - 1 == secendSpotyAxis) || (firstSpotyAxis + 1 == secendSpotyAxis) || (firstSpotyAxis == secendSpotyAxis) 
            && (firstSpotyAxis - 2 == thirdSpotyAxis) || (firstSpotyAxis + 2 == thirdSpotyAxis) || (firstSpotyAxis == thirdSpotyAxis)){
            isYPass = true;
        }
        /*System.out.println(isXPass);
        System.out.println(isYPass);*/
        if (!isXPass){
            System.out.println("The boats must be stuck together!");
            return false;
        } else if (!isYPass){
            System.out.println("The boats must be stuck together!");
            return false;
        }

        if (playerID == 1 && realGame.placeShip3Long(playerID, firstSpotyAxis, firstSpotxAxis, secendSpotyAxis,
                secendSpotxAxis, thirdSpotyAxis, thirdSpotxAxis)) {
            User1Place2Long++;
        } else if (playerID == 2 && realGame.placeShip3Long(playerID, firstSpotyAxis, firstSpotxAxis, secendSpotyAxis,
                secendSpotxAxis, thirdSpotyAxis, thirdSpotxAxis)) {
            User2Place2Long++;
        }
        realGame.display(playerID);
        return true;
    }

    @Override
    public boolean isGameOver() {
        return realGame.isGameOver();
    }

    @Override
    public void display(int playerID) {
        if (turnNumber != playerID) {
            System.out.println("Not your turn!");
            return;
        }
        realGame.display(playerID);
        return;
    }
}
