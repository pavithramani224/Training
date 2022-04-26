package com.example.entity;

import java.time.LocalDate;

public class Member {
	private int memeberId;
	private String memberName;
	private String memberAddress;
	private LocalDate accountOpenDate;
	private String memberShipType;
	private double fesspaid;
	private int maxBookAllowed;
	private double penaltyAmount;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(int memeberId, String memberName, String memberAddress, LocalDate accountOpenDate,
			String memberShipType, double fesspaid, int maxBookAllowed, double penaltyAmount) {
		super();
		this.memeberId = memeberId;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.accountOpenDate = accountOpenDate;
		this.memberShipType = memberShipType;
		this.fesspaid = fesspaid;
		this.maxBookAllowed = maxBookAllowed;
		this.penaltyAmount = penaltyAmount;
	}
	public int getMemeberId() {
		return memeberId;
	}
	public void setMemeberId(int memeberId) {
		this.memeberId = memeberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public LocalDate getAccountOpenDate() {
		return accountOpenDate;
	}
	public void setAccountOpenDate(LocalDate accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}
	public String getMemberShipType() {
		return memberShipType;
	}
	public void setMemberShipType(String memberShipType) {
		this.memberShipType = memberShipType;
	}
	public double getFesspaid() {
		return fesspaid;
	}
	public void setFesspaid(double fesspaid) {
		this.fesspaid = fesspaid;
	}
	public int getMaxBookAllowed() {
		return maxBookAllowed;
	}
	public void setMaxBookAllowed(int maxBookAllowed) {
		this.maxBookAllowed = maxBookAllowed;
	}
	public double getPenaltyAmount() {
		return penaltyAmount;
	}
	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
	@Override
	public String toString() {
		return "Member [memeberId=" + memeberId + ", memberName=" + memberName + ", memberAddress=" + memberAddress
				+ ", accountOpenDate=" + accountOpenDate + ", memberShipType=" + memberShipType + ", fesspaid="
				+ fesspaid + ", maxBookAllowed=" + maxBookAllowed + ", penaltyAmount=" + penaltyAmount + "]";
	}
	

}
