package com.msvc.calificacion.service.impl;

import com.msvc.calificacion.entity.Calificacion;
import com.msvc.calificacion.repository.CalificacionRepository;
import com.msvc.calificacion.service.ICalificacionService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CalificacionServiceImpl implements ICalificacionService {

    private final CalificacionRepository calificacionRepository;

    public CalificacionServiceImpl(CalificacionRepository calificacionRepository) {
        this.calificacionRepository = calificacionRepository;
    }

    @Override
    public Calificacion create(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    @Override
    public List<Calificacion> findAll() {
        return calificacionRepository.findAll();
    }

    @Override
    public List<Calificacion> findByUsuarioId(String usuarioId) {
        return calificacionRepository.findByUsuarioId(usuarioId);
    }

    @Override
    public List<Calificacion> findByHotelId(String hotelId) {
        return calificacionRepository.findByHotelId(hotelId);
    }
}
