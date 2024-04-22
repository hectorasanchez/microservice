package com.msvc.usuario.usuarioservice.exeptions;

public class ResourceNotFountExeption extends RuntimeException{
    public ResourceNotFountExeption() {
        super("Recurso no encontrado en el servidor.");
    }

    public ResourceNotFountExeption(String message) {
        super(message);
    }
}
