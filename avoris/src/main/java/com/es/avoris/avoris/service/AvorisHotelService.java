package com.es.avoris.avoris.service;

import com.es.avoris.avoris.model.Hotel;
import com.es.avoris.avoris.model.HotelDetail;
import org.springframework.stereotype.Service;

@Service
public class AvorisHotelService {

    public HotelDetail getDetail(Hotel hotel) {
        HotelDetail hotelDetail = new HotelDetail();
        hotelDetail.setSearchId("JSd545");
        return hotelDetail;
    }
}
