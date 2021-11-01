package com.hotelreservation;

import java.util.ArrayList;
import java.util.List;

/*
 * Creating class for HotelReservation
 */
public class HotelReservation {
	private List<Hotel> hotels;

	public HotelReservation() {
		this.hotels = new ArrayList<Hotel>();
	}
	/*
	 * Creating Method
	 */
	public void add(Hotel hotel) {
		this.hotels.add(hotel);
	}

	public List<Hotel> getHotelList() {
		return this.hotels;
	}
}