package cardgame;

public class Card {

	private String suit;
	private String name;
	private int value;

	public Card(String suit, String name, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}

	public String toString() {
		return name + " " + suit;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

}
