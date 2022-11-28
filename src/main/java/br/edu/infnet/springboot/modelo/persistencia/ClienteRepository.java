package br.edu.infnet.springboot.modelo.persistencia;

import br.edu.infnet.springboot.modelo.entidade.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
//public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Long> {

    List<Cliente> findByNome(String nome);
    List<Cliente> findByNomeAndIdade(String nome,int idade);
    List<Cliente> findDistinctByNome(String nome);
}
