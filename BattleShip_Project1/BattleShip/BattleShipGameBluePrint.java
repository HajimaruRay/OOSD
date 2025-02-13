interface BattleShipGameBluePrint {
    boolean shoot(int playerID, int yAxis, int xAxis);

    boolean placeShip2Long(int playerID, int firstSpotyAxis, int firstSpotxAxis, int secendSpotyAxis,
            int secendSpotxAxis);

    boolean placeShip3Long(int playerID, int firstSpotyAxis, int firstSpotxAxis, int secendSpotyAxis,
            int secendSpotxAxis, int thirdSpotyAxis, int thirdSpotxAxis);

    void display(int playerID);

    boolean isGameOver();
}
