package cardgame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> cards = new ArrayList();

	public Deck() {
		String suit = "";
		for (int i = 1; i < 4; i++) {
			switch (i) {
			case 0:
				suit = "Hearts";
				break;
			case 1:
				suit = "Spades";
				break;
			case 2:
				suit = "Diamonds";
				break;
			case 3:
				suit = "Clubs";
				break;

			}
			for (int j = 2; j <= 10; j++) {

				Card c = new Card(suit, Integer.toString(j), j);
				cards.add(c);
			}

			Card jack = new Card(suit, "Jack of", 11);
			Card queen = new Card(suit, "Queen of", 12);
			Card king = new Card(suit, "King of", 13);
			Card ace = new Card(suit, "Ace of", 14);
			cards.add(jack);
			cards.add(queen);
			cards.add(king);
			cards.add(ace);
			Collections.shuffle(cards);
		}

	}

	public Card getNextCard() {
		return cards.remove(0);
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

}
