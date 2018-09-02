package next.com;

public class Card {
	
	final static String[] CARDNUM = {"A","2","3","4","5","6","7","8","9","10","K","Q","J"};
	final static String[] CARDSHAPE = {"♠","◆","♥","♣"};
	
	public String card;
	
	//생성자
	public Card() {
		
	}
	
	
	public String getCard() {
		return card;
	}


	@Override
	public int hashCode() {
		//문자열 card에 같은 값이 들어 있으면, 같은 hashcode가 나옴.
		return card.hashCode() +137;
	}


	
	@Override
	public boolean equals(Object obj) {
		boolean isc = false;
		
		Card cardObj =(Card)obj;

		//비교할 대상이 없으면,
		if(cardObj==null) {
			return false;
		}
		
		//비교할 대상이 현재 자신일때,
		if(this==cardObj) {
			return true;
		}
		
		if(card.equals(cardObj.card)){
			isc = true;
		}
		
		return isc;
	}

	
	@Override
	public String toString() {
		return "[" + card + "]";
	}


	/**
	 * 멤버필드를 사용하여 무작위로 카드 한장을 만들어 냄
	 */
	public void cardMake() {
		int cardNumIdx = (int)(Math.random()*CARDNUM.length);
		int cardShapeIdx = (int)(Math.random()*CARDSHAPE.length);

		card =CARDSHAPE[cardShapeIdx]+CARDNUM[cardNumIdx];
		
	}
	

}
