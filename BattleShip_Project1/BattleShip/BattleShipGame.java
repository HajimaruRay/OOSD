public class BattleShipGame implements BattleShipGameBluePrint {
    private boolean boardPlayer1[][];
    private boolean boardPlayer2[][];

    public BattleShipGame() {
        boardPlayer1 = new boolean[6][6];
        boardPlayer2 = new boolean[6][6];
    }

    @Override
    public boolean shoot(int playerID, int yAxis, int xAxis) {

        if (playerID == 1) {
            if (boardPlayer2[yAxis][xAxis]) {
                System.out.println("Player 1 hit Player 2 at (" + yAxis+1 + " : " + xAxis+1 + ")");
                boardPlayer2[yAxis][xAxis] = false;
                return true;
            } else {
                System.out.println("Player 1 missed at (" + yAxis+1 + " : " + xAxis+1 + ")");
                return false;
            }
        }

        if (playerID == 2) {
            if (boardPlayer1[yAxis][xAxis]) {
                System.out.println("Player 2 hit Player 1 at (" + yAxis+1 + " : " + xAxis+1 + ")");
                boardPlayer1[yAxis][xAxis] = false;
                return true;
            } else {
                System.out.println("Player 2 missed at (" + yAxis+1 + " : " + xAxis+1 + ")");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean placeShip2Long(int playerID, int firstSpotyAxis, int firstSpotxAxis, int secendSpotyAxis,
            int secendSpotxAxis) {
        if (playerID == 1) {
            if (boardPlayer1[firstSpotyAxis][firstSpotxAxis] || boardPlayer1[secendSpotyAxis][secendSpotxAxis]) {
                System.out.println("This place already placed");
                return false;
            }

            boardPlayer1[firstSpotyAxis][firstSpotxAxis] = true;
            boardPlayer1[secendSpotyAxis][secendSpotxAxis] = true;
            System.out.println("Player 1 placed ship in (" + firstSpotyAxis+1 + ":" + firstSpotxAxis+1 + "),("
                    + secendSpotyAxis+1 + ":" + secendSpotxAxis+1 + ")");
            return true;
        } else if (playerID == 2) {
            if (boardPlayer2[firstSpotyAxis][firstSpotxAxis] || boardPlayer2[secendSpotyAxis][secendSpotxAxis]) {
                System.out.println("This place already placed");
                return false;
            }
            boardPlayer2[firstSpotyAxis][firstSpotxAxis] = true;
            boardPlayer2[secendSpotyAxis][secendSpotxAxis] = true;
            System.out.println("Player 2 placed ship in (" + firstSpotyAxis+1 + ":" + firstSpotxAxis+1 + "),("
                    + secendSpotyAxis+1 + ":" + secendSpotxAxis+1 + ")");
            return true;
        }

        return false;
    }

    @Override
    public boolean placeShip3Long(int playerID, int firstSpotyAxis, int firstSpotxAxis, int secendSpotyAxis,
            int secendSpotxAxis, int thirdSpotyAxis, int thirdSpotxAxis) {
        if (playerID == 1) {
            if (boardPlayer1[firstSpotyAxis][firstSpotxAxis] || boardPlayer1[secendSpotyAxis][secendSpotxAxis]
                    || boardPlayer1[thirdSpotyAxis][thirdSpotxAxis]) {
                System.out.println("This place already placed");
                return false;
            }
            boardPlayer1[firstSpotyAxis][firstSpotxAxis] = true;
            boardPlayer1[secendSpotyAxis][secendSpotxAxis] = true;
            boardPlayer1[thirdSpotyAxis][thirdSpotxAxis] = true;
            System.out.println("Player 1 placed ship in (" + firstSpotyAxis+1 + ":" + firstSpotxAxis+1 + "),("
                    + secendSpotyAxis+1 + ":" + secendSpotxAxis+1 + "),(" + thirdSpotyAxis+1 + ":" + thirdSpotxAxis+1 + ")");
            return true;
        } else if (playerID == 2) {
            if (boardPlayer2[firstSpotyAxis][firstSpotxAxis] && boardPlayer2[secendSpotyAxis][secendSpotxAxis]
                    && boardPlayer2[thirdSpotyAxis][thirdSpotxAxis]) {
                System.out.println("This place already placed");
                return false;
            }
            boardPlayer2[firstSpotyAxis][firstSpotxAxis] = true;
            boardPlayer2[secendSpotyAxis][secendSpotxAxis] = true;
            boardPlayer2[thirdSpotyAxis][thirdSpotxAxis] = true;
            System.out.println("Player 2 placed ship in (" + firstSpotyAxis+1 + ":" + firstSpotxAxis+1 + "),("
                    + secendSpotyAxis+1 + ":" + secendSpotxAxis+1 + "),(" + thirdSpotyAxis+1 + ":" + thirdSpotxAxis+1 + ")");
            return true;
        }

        return false;
    }

    @Override
    public boolean isGameOver() {
        boolean player1HasShips = false;
        boolean player2HasShips = false;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (boardPlayer1[i][j]) {
                    player1HasShips = true;
                    break;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (boardPlayer2[i][j]) {
                    player2HasShips = true;
                    break;
                }
            }
        }

        if (!player1HasShips) {
            System.out.println("Player 2 Win!");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    boardPlayer1[i][j] = false;
                    boardPlayer2[i][j] = false;
                }
        }
            return true;
        } else if (!player2HasShips) {
            System.out.println("Player 1 Win!");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    boardPlayer1[i][j] = false;
                    boardPlayer2[i][j] = false;
                }
        }
            return true;
        }
        return false;
    }

    @Override
    public void display(int playerID) {
        if (playerID == 1) {
            System.out.println("Player 1");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (boardPlayer1[i][j]){
                        System.out.print("0 ");
                    } else{
                        System.out.print("- ");
                    }
                }
                System.out.println();
            }
            System.out.println("----------------------------------------------------------------");
            return;
        }

        if (playerID == 2) {
            System.out.println("Player 2");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (boardPlayer2[i][j]){
                        System.out.print("0 ");
                    } else{
                        System.out.print("- ");
                    }
                }
                System.out.println();
            }
            System.out.println("----------------------------------------------------------------");
            return;
        }
    }
}
