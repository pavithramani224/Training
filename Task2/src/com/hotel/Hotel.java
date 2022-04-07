package com.hotel;

/**
 * @author Pavithra.M
 *
 */
public class Hotel {
	private String hotelName;
	private String hotelPlace;
	private String hotelType;
	private String hotelInfo;
	
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String hotelName, String hotelPlace, String hotelType, String hotelInfo) {
		super();
		this.hotelName = hotelName;
		this.hotelPlace = hotelPlace;
		this.hotelType = hotelType;
		this.hotelInfo = hotelInfo;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelPlace() {
		return hotelPlace;
	}
	public void setHotelPlace(String hotelPlace) {
		this.hotelPlace = hotelPlace;
	}
	public String getHotelType() {
		return hotelType;
	}
	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}
	public String getHotelInfo() {
		return hotelInfo;
	}
	public void setHotelInfo(String hotelInfo) {
		this.hotelInfo = hotelInfo;
	}
}
