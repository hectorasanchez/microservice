package com.msvc.hotel.service.imp;

import com.msvc.hotel.entity.Hotel;
import com.msvc.hotel.exeptions.ResourceNotFoundExeption;
import com.msvc.hotel.repository.HotelRepository;
import com.msvc.hotel.service.IHotelService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements IHotelService {

    private  final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Hotel crete(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel findById(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("Hotel no encontrado con el ID"+id));
    }
}
