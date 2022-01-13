package com.bridgelabz.Hotel_Reservation;
import java.util.ArrayList;

public interface HotelReservationInterface {
	public void addHotel(String hotelName,int rating, double weekDayRate,double weekendRate);
	public int getHotelListSize();
	public void printHotelList();
	public ArrayList<Hotel> getHotelList();
}