package com.hotelreservation;

import java.util.ArrayList;
import java.util.List;
/**
 * Purpose  - Ability to add weekday and weekend rates for each Hotel
 */

public class HotelReservationSystem {
    private List<Hotel> hotels;

    public HotelReservationSystem(){
        this.hotels = new ArrayList<Hotel>();
    }

    /**
     * This method is used to add hotel to the Hotel List
     */
    public boolean addHotel(Hotel hotel) {
        return this.hotels.add(hotel);
    }

    /**
     * This method is used to find the cheapest hotel in the HotelList
     * @return - cheapestHotel - The cheapest hotel in the list
     */
    public int findCheapestHotel(){
        int LakeWoodRate = 110; int BridgeWoodRate = 160; int Ridgewood = 220;
        int cheapestHotel = (LakeWoodRate>BridgeWoodRate) ?
                (LakeWoodRate>Ridgewood ? LakeWoodRate : Ridgewood) :
                (BridgeWoodRate>Ridgewood ? BridgeWoodRate : Ridgewood) ;
        System.out.println("The cheapest Hotel is " +cheapestHotel);
        return cheapestHotel;
    }
}