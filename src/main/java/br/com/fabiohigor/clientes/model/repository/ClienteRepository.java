package br.com.fabiohigor.clientes.model.repository;

import br.com.fabiohigor.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
