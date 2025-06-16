package com.Raul.Henares.gestor_incidencias.Repositorios;

import com.Raul.Henares.gestor_incidencias.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
