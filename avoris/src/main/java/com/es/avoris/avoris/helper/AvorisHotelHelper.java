package com.es.avoris.avoris.helper;

import com.es.avoris.avoris.model.Hotel;
import com.es.avoris.avoris.model.HotelDetail;
import com.es.avoris.avoris.service.AvorisHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvorisHotelHelper {

    @Autowired
    private AvorisHotelService avorisHotelService;

    public HotelDetail getHotelDetail(Hotel hotel) {
        return avorisHotelService.getDetail(hotel);
    }
}
