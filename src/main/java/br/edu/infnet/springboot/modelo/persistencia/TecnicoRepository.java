package br.edu.infnet.springboot.modelo.persistencia;

import br.edu.infnet.springboot.modelo.entidade.Tecnico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicoRepository extends CrudRepository<Tecnico, Long> {
}
