package br.com.fabiohigor.clientes.model.repository;

import br.com.fabiohigor.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findUserByUsername(String username);

    boolean existsByUsername(String username);
}
