package com.customer;

public class Customer {
	
		private int customerId;
		private String customerName;
		private long customerNumber;
		private String customerAddress;
		public Customer(int customerId, String customerName, int customerNumber, String customerAddress) {
			super();
			this.customerId=customerId;
			this.customerName=customerName;
			this.customerNumber=customerNumber;
			this.customerAddress=customerAddress;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public long getCustomerNumber() {
			return customerNumber;
		}
		public void setCustomerNumber(long customerNumber) {
			this.customerNumber = customerNumber;
		}
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getCustomerAddress() {
			return customerAddress;
		}
		public void setCustomerAddress(String customerAddress) {
			this.customerAddress = customerAddress;
		}
		

	}
