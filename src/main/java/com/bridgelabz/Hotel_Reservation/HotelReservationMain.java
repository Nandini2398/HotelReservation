package com.bridgelabz.Hotel_Reservation;

public class HotelReservationMain {

		public static void main(String[] args) {
			System.out.println(" Welcome To Hotel Reservation");
			HotelReservationInterface hotelReservation = new HotelReservation();
			hotelReservation.addHotel();
			hotelReservation.printHotelList();
		}
	}

