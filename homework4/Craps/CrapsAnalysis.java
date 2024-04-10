// CrapsAnalysis class for running simulations and collecting data.
package ntou.cs.java2024;

import ntou.cs.java2024.Craps.Result;

public class CrapsAnalysis {
    private int[] wins = new int[22];
    private int[] losses = new int[22];
    private int totalGames = 0;
    private int totalRolls = 0;

    public void runSimulation(int games) {
        for (int i = 0; i < games; i++) {
            Result result = Craps.simulateGame();
            totalGames++;
            totalRolls += result.rollsCount;

            if (result.rollsCount > 20) result.rollsCount = 21; // Index 21 for "after 20th roll"
            if (result.won)
                wins[result.rollsCount]++;
            else
                losses[result.rollsCount]++;
        }
    }

    public void printStatistics() {
        System.out.println("Craps Game Simulation Statistics:");
        for (int i = 1; i < wins.length; i++) {
            if (i == 21) {
                System.out.printf("%d games won and %d games lost after the 20th roll%n%n", wins[i], losses[i]);
            } else {
                System.out.printf("%d games won and %d games lost on roll #%d%n", wins[i], losses[i], i);
            }
        }

        int totalWins = 0;
        for (int win : wins) {
            totalWins += win;
        }

        double winningPercentage = (double) totalWins / totalGames * 100;
        double averageRolls = (double) totalRolls / totalGames;

        System.out.printf("The chances of winning are %d / %d = %.2f%%%n",totalWins,totalGames, winningPercentage);
        System.out.printf("The average game length is %.2f rolls.%n", averageRolls);
    }
}
