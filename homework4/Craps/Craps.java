// Craps class modified for simulation.
package ntou.cs.java2024;

import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status {CONTINUE, WON, LOST};
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    
    // Method to simulate one game of craps and return the result
    public static Result simulateGame() {
        int myPoint = 0;
        Status gameStatus;
        int rollsCount = 0;

        int sumOfDice = rollDice();
        rollsCount++;

        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                break;
        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();
            rollsCount++;
            
            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            else if (sumOfDice == SEVEN)
                gameStatus = Status.LOST;
        }

        return new Result(gameStatus == Status.WON, rollsCount);
    }

    private static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        return die1 + die2;
    }
    
    // Inner class to represent the result of a game
    public static class Result {
        public final boolean won;
        public int rollsCount;

        public Result(boolean won, int rollsCount) {
            this.won = won;
            this.rollsCount = rollsCount;
        }
    }
}
