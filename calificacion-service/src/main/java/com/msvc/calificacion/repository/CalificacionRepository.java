package com.msvc.calificacion.repository;

import com.msvc.calificacion.entity.Calificacion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalificacionRepository extends MongoRepository<Calificacion, String> {

    List<Calificacion> findByUsuarioId(String UsuarioId);
    List<Calificacion> findByHotelId(String HotelId);
}
