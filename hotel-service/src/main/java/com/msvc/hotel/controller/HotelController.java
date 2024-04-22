package com.msvc.hotel.controller;

import com.msvc.hotel.entity.Hotel;
import com.msvc.hotel.service.IHotelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hoteles")
public class HotelController {

    private final IHotelService iHotelService;

    public HotelController(IHotelService iHotelService) {
        this.iHotelService = iHotelService;
    }

    @PostMapping
    public ResponseEntity<Hotel> save(@RequestBody Hotel hotel) {
        if (hotel == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(iHotelService.crete(hotel));
    }
    @GetMapping
    public ResponseEntity<List<Hotel>> findAll() {
        return ResponseEntity.status(HttpStatus.CREATED).body(iHotelService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> findById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(iHotelService.findById(id));
    }
}
