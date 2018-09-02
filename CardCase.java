package next.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardCase {

	// Card[] cardDeck = new Card[52];
	public List<Card> cardCaseList;

	public CardCase() {
		cardCaseList = new ArrayList<Card>();
		makeCardCase();
	
	}

	private List<Card> makeCardDeck() {

		List<Card> cardDeck = new ArrayList<Card>();

		int count = 0;
		int cardDeckSize = Card.CARDNUM.length * Card.CARDSHAPE.length;

		while (count < cardDeckSize) {
			Card card = new Card();
			card.cardMake();
			// .contatins 함수는 리스트에 같은 값이 있나 확인해주는 메서드.

			if (!cardDeck.contains(card)) {
				cardDeck.add(card);
				// System.out.print(card.toString());
				count++;
			}
		}
		return cardDeck;
	}

	public void makeCardCase() {
		cardCaseList.addAll(makeCardDeck());
		cardCaseList.addAll(makeCardDeck());
		cardCaseList.addAll(makeCardDeck());
		cardCaseList.addAll(makeCardDeck());
		cardCaseList.addAll(makeCardDeck());
		cardCaseList.addAll(makeCardDeck());
	}

	public List<Card> getCardCase() {
		return cardCaseList;
	}

}
