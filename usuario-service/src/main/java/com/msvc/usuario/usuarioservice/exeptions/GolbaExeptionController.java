package com.msvc.usuario.usuarioservice.exeptions;

import com.msvc.usuario.usuarioservice.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GolbaExeptionController {

    @ExceptionHandler(ResourceNotFountExeption.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFountExeption(ResourceNotFountExeption resourceNotFountExeption){
        String mensaje = resourceNotFountExeption.getMessage();

        ApiResponse response= ApiResponse.builder()
                .menssage(mensaje)
                .success(true)
                .httpStatus(HttpStatus.NOT_FOUND)
                .build();
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
