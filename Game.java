package cardgame;

import java.util.Scanner;

/**
 *
 * @author Gebruiker
 */
public class Game {

	private static Card currentCard;
	private static Card nextCard;
	private static int points;

	public static void main(String[] args) {
		points = 0;
		Deck d = new Deck();
		boolean isPlaying = true;

		while (isPlaying) {
			currentCard = d.getNextCard();
			nextCard = d.getNextCard();

			System.out.println(currentCard);
			Scanner sc = new Scanner(System.in);
			System.out.println("Guess higher or lower.");
			System.out.print("Input here: ");
			String a1 = sc.nextLine();
			System.out.println(nextCard);
			if (nextCard.getValue() < currentCard.getValue() && a1.equals("lower")) {
				points++;
				System.out.println("Correct choice. You have now this amount of " + points + " points!");
				System.out.println("Next one:");
			} else if (nextCard.getValue() > currentCard.getValue() && a1.equals("higher")) {
				points++;
				System.out.println("Correct choice! You have now this amount of points " + points + " points");
				System.out.println("Next one:");
			} else {
				System.out.println("Too bad, you lost the game jerky beefy pie. You had " + points
						+ " points. But now you have none, better luck next time. ¯\\_(ツ)_/¯");
				isPlaying = false;
			}
		}

	}
}
//int test = 1;
//    int test2 = 2;
//    
//    String test3 = "test";
//    
//    String test4 = test3+test+test2;
//        System.out.println(test4);
