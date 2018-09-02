package next.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StartGame {
	
	//난 지금 딱 한장의 카드를 저장할 자료형이 필요한건데,
	private Card card;
	
	private CardCase cardCase;
	private List<Card> playCard;
	
	
	//흠... 근데, 카드케이스에 들어있는 ㅣㄹ스트를 가져와야되는데
	public StartGame() {
		cardCase = new CardCase();
		playCard = new ArrayList<>();
		
	}

	//테스트용playcard 
	public List<Card> getPlayCard() {
		return playCard;
	}

	
	public void startNewGame() {
		
		makeNewPlayCard();
		
		
	}

	//playCard안에 있는 값을 모두 삭제하고, 다시 새로운 312장을 가져와 섞는다
	public void makeNewPlayCard() {
		playCard.removeAll(playCard);
		playCard = cardCase.getCardCase();
		shuffleCard(playCard);
	}
	
	//playCard의 크기가 52보다.. 
	//52보다 크면, false
	//52보다 작으면, true
	public boolean isCCLow(List<Card> pc) {
		boolean isc = false;
		if(pc.size()<52) {
			isc = true;
		}
		System.out.println("pc의 사이즈는 ? : "+pc.size());
		return isc;
	}

	
	private void shuffleCard(List<Card> listCard) {
		Collections.shuffle(listCard);
	}
	
	//카드타입으로 반환해줌
	public Card getOneCard() {

		int idx = (int)(Math.random()*playCard.size());
//		System.out.println(idx);
		Card card = playCard.get(idx);
//		System.out.println(card);

		playCard.remove(idx);
//		System.out.println(playCard.size());
		return card;
	}

}
