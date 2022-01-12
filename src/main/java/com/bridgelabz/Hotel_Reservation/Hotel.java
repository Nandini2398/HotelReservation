package com.bridgelabz.Hotel_Reservation;


public class Hotel {
	private String hotelName;
	private int rating;
	private double CustomerCost;
	public Hotel() {
	}
	public Hotel(String hotelName, int rating, double regularCustomerCost) {
		this.hotelName = hotelName;
		this.rating = rating;
		this.CustomerCost = regularCustomerCost;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public double getCustomerCost() {
		return CustomerCost;
	}
	public void setCustomerCost(double CustomerCost) {
		this.CustomerCost = CustomerCost;
	}
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rating=" + rating + ", CustomerCost=" + CustomerCost
				+ "]";
	}
}