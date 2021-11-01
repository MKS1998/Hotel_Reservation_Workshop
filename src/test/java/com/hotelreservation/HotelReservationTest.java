package com.hotelreservation;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/*
 * Creating Class For HotelReservationTest 
 */

public class HotelReservationTest {
	
	//Creating Object for HotelReservation 
	HotelReservation hotelReservation = new HotelReservation();

	@Test
	public void whenHotelAdded_ToSystem_ShouldGetAdded() {
		Hotel h1 = new Hotel("Lakeewood", 110, 90, 80, 80, 3);
		Hotel h2 = new Hotel("Bridgewood", 160, 60, 110, 50, 4);
		Hotel h3 = new Hotel("Ridgewood", 220, 150, 100, 40, 5);
		Hotel[] hotelList = { h1, h2, h3 };
		hotelReservation.add(h1);
		hotelReservation.add(h2);
		hotelReservation.add(h3);
		List<Hotel> result = hotelReservation.getHotelList();
		assertEquals(hotelList, result);
	}
}
