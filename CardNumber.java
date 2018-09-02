package next.com;

//카드에 적힌 숫자를 반환해서 계산하는.
public class CardNumber {
	
	Card card;
	
	CardNumber(){
		card = new Card();
	}
	
	//카드에 적힌 숫자를 반환
	public int getCardNum(Card c){		
		
		int cardNum=0;
		
		String s= c.getCard();
		char numCh = s.charAt(1);
		
		switch(numCh) {
		
		case '1': cardNum=10;
		break;
		case '2': cardNum=2;
		break;
		case '3': cardNum=3;
		break;
		case '4': cardNum=4;
		break;
		case '5': cardNum=5;
		break;
		case '6': cardNum=6;
		break;
		case '7': cardNum=7;
		break;
		case '8': cardNum=8;
		break;
		case '9': cardNum=9;
		break;
		case 'K': cardNum=10;
		break;
		case 'Q': cardNum=10;
		break;
		case 'J' : cardNum=10;
		break;
		
		}
		
		return cardNum;
	}
	
}
