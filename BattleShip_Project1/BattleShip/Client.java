public class Client {
    BattleShipGameBluePrint game = new Proxy();

    public void shoot(int playerID, int yAxis, int xAxis) {
        game.shoot(playerID, yAxis-1, xAxis-1);
    }

    public void placeShip2Long(int playerID, int firstSpotyAxis, int firstSpotxAxis, int secendSpotyAxis,
            int secendSpotxAxis) {
        game.placeShip2Long(playerID, firstSpotyAxis-1, firstSpotxAxis-1, secendSpotyAxis-1, secendSpotxAxis-1);
    }

    public void placeShip3Long(int playerID, int firstSpotyAxis, int firstSpotxAxis, int secendSpotyAxis,
            int secendSpotxAxis, int thirdSpotyAxis, int thirdSpotxAxis) {
        game.placeShip3Long(playerID, firstSpotyAxis-1, firstSpotxAxis-1, secendSpotyAxis-1, secendSpotxAxis-1, thirdSpotyAxis-1,
                thirdSpotxAxis-1);
    }

    public void display(int playerID) {
        game.display(playerID);
    }
}
