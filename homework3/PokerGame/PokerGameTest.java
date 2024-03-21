package ntou.cs.java2024;
import java.security.SecureRandom;
import java.util.Scanner;
import ntou.cs.java.simplepoker.DeckOfCards;
import ntou.cs.java2024.*;
public class PokerGameTest {
	public static void main(String[] args) {
		PokerGame game = new PokerGame();
		Scanner input = new Scanner(System.in);
		while (true) {
            System.out.print("Please input your choice (0: quit, 1: play, 2: restart, 3: repeat): ");
            int choice = input.nextInt();

            switch (choice) {
                case 0: // Quit
                    System.out.println("Game over!!");
                    return;
                case 1: // Play
                    game.dealFiveCards();
                    break;
                case 2: // Restart with a new deck
                    game = new PokerGame();
					game.dealFiveCards();
					break;
				case 3: // Repeat with the current deck (shallow copy)
					PokerGame repeatGame = new PokerGame(game);
					repeatGame.dealFiveCards();
					break;
				default:
					System.out.println("Invalid choice. Please enter 0, 1, 2, or 3.");
					break;
			}
		}// end class PokerGameTest
	}
} // end class PokerGameTest
