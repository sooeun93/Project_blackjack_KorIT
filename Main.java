package next.com;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("테스트");
		
		/*
		CardDeck2 cd = new CardDeck2();
		
		cd.makeCardCase();
		
		System.out.println(cd.getCardCase());;
		System.out.println();
		
		cd.shuffleCard();
		System.out.println(cd.getCardCase());;
		*/
		CardNumber cn = new CardNumber();
		//cn.test();
		
		
		//startGame 단위실행
		StartGame sg = new StartGame();
		sg.startNewGame();
		
		sg.getOneCard();
		
	}
}