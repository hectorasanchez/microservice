package com.msvc.usuario.usuarioservice.service;

import com.msvc.usuario.usuarioservice.entity.Usuario;

import java.util.List;

public interface UsuarioService {


    Usuario saveUsuario(Usuario usuario);

    List<Usuario> findAll();

    Usuario findById(String  id);

}

