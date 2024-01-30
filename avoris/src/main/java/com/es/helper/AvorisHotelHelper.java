package com.es.helper;

import com.es.model.Hotel;
import com.es.model.HotelCount;
import com.es.model.HotelDetail;
import com.es.service.AvorisHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvorisHotelHelper {

    @Autowired
    private AvorisHotelService avorisHotelService;

    public HotelDetail getHotelDetail(Hotel hotel) {
        return avorisHotelService.getDetail(hotel);
    }

    public HotelCount getCountRequest(String searchId) {
        return avorisHotelService.getCountHotel(searchId);
    }

}