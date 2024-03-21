package ntou.cs.java2024;
import ntou.cs.java2024.*;
import ntou.cs.java.simplepoker.DeckOfCards;
public class PokerGame {
	private DeckOfCards myDeckOfCards;

	public PokerGame() {
        myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();
    }
	public PokerGame(PokerGame game) {
		myDeckOfCards = game.getMyDeckOfCards();
        myDeckOfCards.reset(); // Reset currentCard to 0
	}

	public DeckOfCards getMyDeckOfCards() {
		return this.myDeckOfCards;
	}
	
	public void dealFiveCards() {
		try {
            int totalPoints = 0;
            for (int i = 0; i < 5; i++) {
                Card dealtCard = myDeckOfCards.dealCard();
                if (dealtCard == null) {
                    throw new NullPointerException("No card can be dealt, please restart the game!");
                }
                int cardPoints = dealtCard.getPoint();
                System.out.printf("You got %s, %d points.\n", dealtCard, cardPoints);
                totalPoints += cardPoints;
            }
            System.out.printf("Your total points are %d\n\n", totalPoints);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
	}

} // end class PokerGame
