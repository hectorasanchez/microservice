package com.msvc.hotel.service;

import com.msvc.hotel.entity.Hotel;

import java.util.List;

public interface IHotelService {

    Hotel crete(Hotel hotel);

    List<Hotel> findAll();

    Hotel findById(String  id);
}
