package com.HotelSystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {

    //here 3 hotels are present with regular rates
    @Test
    public void given3Hotels_whenInvokedFindCheapestHotel_shouldBeAbleToReturnCheapestHotel() {
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel Lakewood = new Hotel("Lakewood",110);
        Hotel Bridgewood = new Hotel("BridgeWood",160);
        Hotel RidgeWood = new Hotel("RidgeWood",220);
        hotelReservationService.addHotel(Lakewood);
        hotelReservationService.addHotel(Bridgewood);
        hotelReservationService.addHotel(RidgeWood);
    //two dates are passed
        int countDays = hotelReservationService.countDays("2020-09-10","2020-09-12");
        System.out.println(countDays);
        Hotel result = hotelReservationService.findCheapestHotel(countDays);
        System.out.println(result);
        Assertions.assertTrue(hotelReservationService.getHotels().contains(result));
    }
}
