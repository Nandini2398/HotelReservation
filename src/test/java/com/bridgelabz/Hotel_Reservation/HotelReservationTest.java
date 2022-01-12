package com.bridgelabz.Hotel_Reservation;

import org.junit.Assert;
import org.junit.Test;

	public class HotelReservationTest {
		@Test
		public void givenHotelDetails_WhenSizeMatches_ShoulReturnTrue()
		{
			HotelReservationInterface hotelReservation = new HotelReservation();
			hotelReservation.addHotel();
			int hotelListSize = hotelReservation.getHotelListSize();
			Assert.assertEquals(3, hotelListSize);
		}
}

