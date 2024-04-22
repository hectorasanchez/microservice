package com.msvc.usuario.usuarioservice.service.impl;

import com.msvc.usuario.usuarioservice.entity.Usuario;
import com.msvc.usuario.usuarioservice.exeptions.ResourceNotFountExeption;
import com.msvc.usuario.usuarioservice.repository.UsuarioRepository;
import com.msvc.usuario.usuarioservice.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        String ramdomUsuarioId = UUID.randomUUID().toString();
        usuario.setUsuarioId(ramdomUsuarioId);
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(String usuarioId) {
        return usuarioRepository.findById(usuarioId).orElseThrow(() -> new ResourceNotFountExeption("Usuario no encontrado Con el ID: " + usuarioId));
    }
}
