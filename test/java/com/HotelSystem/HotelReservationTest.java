package com.HotelSystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class HotelReservationTest {
    @Test
    public void givenHotel_whenInvokeAddHotel_shouldBeAbleToAdd() {
        HotelReservationService hotelReservationService = new HotelReservationService();
        Hotel hotel = new Hotel("Lakewood",110);
        hotelReservationService.addHotel(hotel);
        List hotelList = hotelReservationService.getHotels();
        Assertions.assertTrue(hotelList.contains(hotel));
    }

}
