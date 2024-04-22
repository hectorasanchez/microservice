package com.msvc.calificacion.service;

import com.msvc.calificacion.entity.Calificacion;

import java.util.List;

public interface ICalificacionService {

    Calificacion create(Calificacion calificacion);

    List<Calificacion> findAll();

    List<Calificacion> findByUsuarioId(String usuarioId);

    List<Calificacion> findByHotelId(String hotelId);


}
