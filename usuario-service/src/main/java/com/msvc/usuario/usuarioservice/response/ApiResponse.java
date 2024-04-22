package com.msvc.usuario.usuarioservice.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponse {
    private String menssage;
    private Boolean success;
    private HttpStatus httpStatus;
}
