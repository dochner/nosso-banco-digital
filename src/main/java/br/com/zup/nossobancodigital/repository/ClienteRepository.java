package br.com.zup.nossobancodigital.repository;

import br.com.zup.nossobancodigital.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {


}
