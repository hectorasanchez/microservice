package com.msvc.calificacion.controller;

import com.msvc.calificacion.entity.Calificacion;
import com.msvc.calificacion.service.ICalificacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calificaciones")
//@RequiredArgsConstructor
public class CalificacionController {

    private final ICalificacionService iCalificacionService;

    public CalificacionController(ICalificacionService iCalificacionService) {
        this.iCalificacionService = iCalificacionService;
    }

    @PostMapping
    public ResponseEntity<Calificacion> saveCalificacion(@RequestBody Calificacion calificacion) {
        return ResponseEntity.status(HttpStatus.CREATED).body(iCalificacionService.create(calificacion));
    }

    @GetMapping
    public ResponseEntity findbyCalificacion() {
        return ResponseEntity.ok(iCalificacionService.findAll());
    }

    @GetMapping("/usuarios/{usuarioId}")
    public ResponseEntity findByUsuarioId(@PathVariable String usuarioId) {
        return ResponseEntity.ok(iCalificacionService.findByUsuarioId(usuarioId));
    }
    @GetMapping("/hoteles/{hotelId}")
    public ResponseEntity findByHotelId(@PathVariable String hotelId) {
        return ResponseEntity.ok(iCalificacionService.findByHotelId(hotelId));
    }

}
