package br.edu.infnet.springboot.modelo.persistencia;

import br.edu.infnet.springboot.modelo.entidade.Colaborador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradorRepository extends CrudRepository <Colaborador, Long>{
}
