package com.es.service;

import com.es.model.Hotel;
import com.es.model.HotelDetail;
import org.springframework.stereotype.Service;

@Service
public class AvorisHotelService {

    public HotelDetail getDetail(Hotel hotel) {
        HotelDetail hotelDetail = new HotelDetail();
        hotelDetail.setSearchId("JSd545");
        return hotelDetail;
    }
}
