package com.hotelreservation;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/*
 * Creating Class For HotelReservationTest 
 */

public class HotelReservationTest {
	//Writing Test 
	@Test
	/*
	 * Creating Method for hotelDetails
	 */
	public void hotelDetails() {
		//Creating the Object and Passing the Value
		Hotel h1 = new Hotel("Lakeewood",100,300,3);
		Hotel h2 = new Hotel("Bridgewood", 200,400, 4);
		Hotel h3 = new Hotel("Ridgewood", 300,500, 5);
		Hotel[] hotelList = { h1, h2, h3 };
		// Creating Object for HotelReservation
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.add(h1);
		hotelReservation.add(h2);
		hotelReservation.add(h3);
		//Check The Result
		List<Hotel> result = hotelReservation.getHotelList();
		assertEquals(hotelList, result);
	}
}
