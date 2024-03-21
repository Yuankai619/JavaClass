package ntou.cs.java2024;

public class Game {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        System.out.printf("Player1 -> HP: %,d, attack points: %,d%n", player1.getHp(), player1.getAttackPoints());
        System.out.printf("Player2 -> HP: %,d, attack points: %,d%n", player2.getHp(), player2.getAttackPoints());

        while (true) {
            player1.attack(player2);
            System.out.printf("Player1 attacks! Player2's HP becomes %,d%n", player2.getHp());
            
            if (player2.getHp() <= 0) {
                System.out.println("Player1 wins!");
                break;
            }

            player2.attack(player1);
            System.out.printf("Player2 attacks! Player1's HP becomes %,d%n", player1.getHp());

            if (player1.getHp() <= 0) {
                System.out.println("Player2 wins!");
                break;
            }
        }
    }
}
