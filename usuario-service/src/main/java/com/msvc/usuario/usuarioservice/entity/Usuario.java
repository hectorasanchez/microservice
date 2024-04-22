package com.msvc.usuario.usuarioservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "id")
    private String  usuarioId;

    @Column(name = "nombre", length = 20)
    private  String nombre;

    @Column(name = "email")
    private  String email;

    @Column(name = "informacion")

    private  String informacion;

}
