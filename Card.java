package next.com;
//card class--
public class Card {
	
	final static String[] CARDNUM = {"A","2","3","4","5","6","7","8","9","10","K","Q","J"};
	final static String[] CARDSHAPE = {"♠","◆","♥","♣"};

	//카드 문자(ex. A◆, 2♣)를 String 타입으로 저장한다.
	//getCard() 메소드가 있으니깐, card는 private으로 해도 될것 같다.
	//변수명 card에서 sCard로 바꿈. 헷갈려하시니깐~ String의 card라구~
	public String sCard;
	
	//생성자. 필요있나?
	public Card() {
		//cardMake 메소드를 생성자 안에서 만들려고 했지마나아아안
		//Card클래스에서 항상 카드를 만들어내는건 아니니깐, 
		//cardMake메서드는 외부에서 호출하는걸로 정함!
	}

	/**
	 * 멤버필드를 사용하여 무작위로 카드 한장을 만들어 냄
	 */
	public void cardMake() {
		int cardNumIdx = (int)(Math.random()*CARDNUM.length);
		int cardShapeIdx = (int)(Math.random()*CARDSHAPE.length);

		sCard =CARDSHAPE[cardShapeIdx]+CARDNUM[cardNumIdx];
	}

	
	//String문자 카드를 반환한다.(반환값 : String 타입 ex_A◆)
	public String getCard() {
		return sCard;
	}


	//Card클래스 객체의 해시코드값을 재정의하는 매서드
	//만약 sCard에 쓰여진 문자가 같으면, Card객체들의 해시코드값은 같게 만든다.
	@Override
	public int hashCode() {
		//문자열 card에 같은 값이 들어 있으면, 같은 hashcode가 나옴.
		return sCard.hashCode() +137;
	}

	
	
	//객체들의 비교는 해시코드값으로 한다.
	//만약 해시코드값이 같으면 같은 객체로 간주한다.
	@Override
	public boolean equals(Object obj) {
		boolean isc = false;
		
		Card cardObj =(Card)obj;

		//비교할 대상이 없으면,
		if(cardObj==null) {
			return false;
		}
		
		//비교할 대상이 현재 자신일때, 같은객체니깐, true반환
		if(this==cardObj) {
			return true;
		}
		
		if(sCard.equals(cardObj.sCard)){
			isc = true;
		}
		
		return isc;
	}

	
	@Override
	public String toString() {
		return "[" + sCard + "]";
	}



}
