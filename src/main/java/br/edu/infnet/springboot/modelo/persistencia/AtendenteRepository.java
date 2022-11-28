package br.edu.infnet.springboot.modelo.persistencia;

import br.edu.infnet.springboot.modelo.entidade.Atendente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendenteRepository extends CrudRepository<Atendente, Long> {

}
