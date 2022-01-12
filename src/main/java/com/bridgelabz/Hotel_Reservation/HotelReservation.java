package com.bridgelabz.Hotel_Reservation;

import java.util.Scanner;
import java.util.ArrayList;
	
	public class HotelReservation implements HotelReservationInterface {
		String hotelName;
		int rating;
		double CustomerRate;
		Scanner sc = new Scanner(System.in);
		ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
		Hotel hotel;
		public void addHotel() {
			System.out.println("How many hotels you want to add");
			int numOfHotels = sc.nextInt();
			while(numOfHotels > 0) {
				System.out.println("Enter hotel name:");
				hotelName = sc.next();
				System.out.println("Enter hotel rating:");
				rating = sc.nextInt();
				System.out.println("Enter  customer rate:");
				CustomerRate = sc.nextDouble();
				hotel = new Hotel(hotelName,rating,CustomerRate);
				hotelList.add(hotel);
				numOfHotels;
			}
		}
		public int getHotelListSize() {
			return hotelList.size();
		}
		public void printHotelList() {
			System.out.println(hotelList);
		}
	}

