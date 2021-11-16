package com.hotelreservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	HotelReservationSystem hotelReservation = new HotelReservationSystem();

	@Test
	public void whenAddedHotel_ShouldReturn_AddedHotel() {
		try {
			boolean isValid1 = hotelReservation.addHotel(new Hotel("LakeWood", "Regular", 110, 90, 3));
			Assert.assertTrue(isValid1);
			boolean isValid2 = hotelReservation.addHotel(new Hotel("Bridgewood", "Regular", 160, 50, 4));
			Assert.assertTrue(isValid2);
			boolean isValid3 = hotelReservation.addHotel(new Hotel("Ridgewood", "Regular", 220, 150, 5));
			Assert.assertTrue(isValid3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void toFindTheChepeastHotel() {
		HotelReservationSystem cheapHotel = new HotelReservationSystem();
		cheapHotel.findCheapestHotel();
	}

	@Test
	public void toFindTheCheapestHotel_OnWeekdayAndWeekend() {
		HotelReservationSystem cheapHotel = new HotelReservationSystem();
		cheapHotel.findCheapestHotel_Weekday_Weekend();
	}
}