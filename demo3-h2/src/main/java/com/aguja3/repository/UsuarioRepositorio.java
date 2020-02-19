//interactuar con entity Usuario y la clave 1º es Long

package com.aguja3.repository;

import org.springframework.data.repository.CrudRepository;

import com.aguja3.Entity.Usuario;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Long> {

}
