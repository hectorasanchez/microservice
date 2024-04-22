package com.msvc.usuario.usuarioservice.repository;

import com.msvc.usuario.usuarioservice.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String > {
}
