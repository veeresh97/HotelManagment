package com.HotelSystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class HotelReservationTest {
    //added one hotel with regular rate
    @Test
    public void givenHotel_whenInvokeAddHotel_shouldBeAbleToAdd() {
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel hotel = new Hotel("Lakewood",110);
        hotelReservationService.addHotel(hotel);
        List hotelList = hotelReservationService.getHotels();
        System.out.println(hotelList);
        Assertions.assertTrue(hotelList.contains(hotel));
    }
    //3 hotels are present with regular rates
    @Test
    public void given3Hotels_whenInvokeFindCheapestHotel_shouldBeAbleToReturnCheapestHotel() {
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
    //added a weekday and weekend rate for a hotel
    @Test
    public void givenHotel_with3Parameters_whenInvokeAddHotel_shouldBeAbleToAdd() {
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel hotel = new Hotel("Lakewood", 110, 90);
        hotelReservationService.addHotel(hotel);
        List hotelList = hotelReservationService.getHotels();
        System.out.println(hotelList);
        Assertions.assertTrue(hotelList.contains(hotel));
    }
}

