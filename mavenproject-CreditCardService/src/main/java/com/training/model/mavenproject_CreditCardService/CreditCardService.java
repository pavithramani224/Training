package com.training.model.mavenproject_CreditCardService;

public class CreditCardService {
	public static int maxCount=4;
	int i=0;
	
  CrditCard[] cards=new CrditCard[maxCount];
	
	public boolean addCard(CrditCard card) {
		
		boolean result=false;
		if(i<maxCount && card!=null ) {
			cards[i]=card;
			System.out.println(i);
			i++;
			result=true;
		}
		return result;
	}
	
	public CrditCard[] getCard() {
		
		return cards;
	}

	public CreditCardService() {
		super();
		
	}
		
	
	public CreditCardService[] getCards() {
		return getCards();
	}

}
