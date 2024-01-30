package com.es.service;

import com.es.model.Hotel;
import com.es.model.HotelCount;
import com.es.model.HotelDetail;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AvorisHotelService {

    public HotelDetail getDetail(Hotel hotel) {
        HotelDetail hotelDetail = new HotelDetail();
        hotelDetail.setSearchId("JSd545");
        return hotelDetail;
    }
    public HotelCount getCountHotel(String searchId) {
        HotelCount hotelCount= new HotelCount();
        hotelCount.setSearchId(searchId);
        Hotel hotel= new Hotel();
        hotel.setHotelId("1234aBc");
        hotelCount.setSearch(hotel);
        hotelCount.setCount(100);
        return hotelCount;
    }
}
