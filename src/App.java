
public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Player player1 = new Player("Joey");
		Player player2 = new Player("Ashley");
		
		deck.shuffle();
		dealTheCards(deck, player1, player2);
		
		player1.describe();
		player2.describe();
		
		playTheGame(player1, player2);
		printTheScore(player1, player2);
		}
				
		private static void printTheScore(Player player1, Player player2) {
		if(player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " is the winner with a score of " + player1.getScore());
			System.out.println(player2.getName() + " is the loser with a score of " + player2.getScore());
		}
		else if(player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " is the winner with a score of " + player2.getScore());
			System.out.println(player1.getName() + " is the loser with a score of " + player1.getScore());	
		}else {
			System.out.println("Both " + player1.getName() + " and " + player2.getName() + " tied with a score of " + player1.getScore());
		}
		
	}

		private static void dealTheCards(Deck deck, Player player1, Player player2) {
			for(int i = 0; i < 52; i++) {
				if(i % 2 == 0) {
					player1.draw(deck);
				}else {
					player2.draw(deck);
		}
	}
}
		private static void playTheGame(Player player1, Player player2) {
			for(int i = 0; i < 26; i++) {
				Card player1Card = player1.flip();
				Card player2Card = player2.flip();
				
				if(player1Card.getValue() > player2Card.getValue()) {
					player1.incrementScore();
				}
				else if(player2Card.getValue() > player1Card.getValue()) {
					player2.incrementScore();	
			}
			}
}
}
