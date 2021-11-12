package OopsConcept;

public class Player {
	private String name;
	private Card[] cards = new Card[9];

	Player(String name) {
		this.name = name;
	}

	void showPlayerCards() {
		System.out.println("---------------------------------------------");
		for (Card card : cards) {
			System.out.printf("%s of %s\n", card.rank, card.suit);
		}
		System.out.println("---------------------------------------------");
	}

	void receiveCard(Card card, int position) {
		cards[position] = card;
	}

	String getName() {
		return name;
	}
}
