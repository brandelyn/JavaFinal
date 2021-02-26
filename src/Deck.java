import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards = new ArrayList<>();

	private static final String[] types = { "Hearts", "Spades", "Clubs", "Diamonds" };

	private static final String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
			"King", "Ace" };

	public Deck() {

		for (int i = 0; i < types.length; i++) {
			String type = types[i];
			addNumbersToTypes(type);
		}
	}
	
	private void addNumbersToTypes(String type) {
			  for (int x = 0; x < numbers.length; x++) {
				String number = numbers[x];
                String cardName = number + " of " + type;
				int value = x + 2;

				cards.add(new Card(cardName, value));
			}
		}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card draw() {
		return cards.remove(0);
	}
}
