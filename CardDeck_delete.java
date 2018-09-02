package next.com;

import java.util.ArrayList;
import java.util.List;

public class CardDeck_delete {
	
	//Card[] cardDeck = new Card[52];
	private List<Card> cardDeck;
	
	
	public CardDeck_delete() {
		cardDeck = new ArrayList<Card>();
		//makeCardDeck();
		
	}
	
	public void makeCardDeck() {
		int count =0;
		int cardDeckSize = Card.CARDNUM.length*Card.CARDSHAPE.length;
		
		while (count < cardDeckSize) {
			Card card = new Card();
			// .contatins 함수는 리스트에 같은 값이 있나 확인해주는 메서드.
			
			if (!cardDeck.contains(card)) {
				cardDeck.add(card);
				System.out.print(card.toString());;
				count++;
			}
		}
		
	}
	

}
