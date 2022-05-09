package com.training.model.mavenproject_CreditCardService;

public class CrditCard {
	private int cardNumber;
	private int cardHolderName;
	private double dueAmoumnt;
	public CrditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CrditCard(int cardNumber, int cardHolderName, double dueAmoumnt) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.dueAmoumnt = dueAmoumnt;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(int cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public double getDueAmoumnt() {
		return dueAmoumnt;
	}
	public void setDueAmoumnt(double dueAmoumnt) {
		this.dueAmoumnt = dueAmoumnt;
	}
	@Override
	public String toString() {
		return "CrditCard [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", dueAmoumnt="
				+ dueAmoumnt + "]";
	}
	

}
