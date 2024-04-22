package com.msvc.hotel.exeptions;

public class ResourceNotFoundExeption extends RuntimeException {
    public ResourceNotFoundExeption(String message) {
        super(message);
    }

    public ResourceNotFoundExeption() {
        super("Recurso no encontrado en el servidor");
    }
}
