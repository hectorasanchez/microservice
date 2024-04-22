package com.msvc.usuario.usuarioservice.controller;

import com.msvc.usuario.usuarioservice.entity.Usuario;
import com.msvc.usuario.usuarioservice.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> guardarUsuario(@RequestBody Usuario usuarioResquest) {
        Usuario usuario = usuarioService.saveUsuario(usuarioResquest);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @GetMapping("{usuarioId}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable String usuarioId) {
        Usuario usuario = usuarioService.findById(usuarioId);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Usuario>> litarUsuarios() {
        List<Usuario> usuarios = usuarioService.findAll();
        return ResponseEntity.ok(usuarios);
    }
}
