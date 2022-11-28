package br.edu.infnet.springboot;

import br.edu.infnet.springboot.modelo.entidade.Atendente;
import br.edu.infnet.springboot.modelo.entidade.Cliente;
import br.edu.infnet.springboot.modelo.entidade.Colaborador;
import br.edu.infnet.springboot.modelo.entidade.Tecnico;
import br.edu.infnet.springboot.modelo.persistencia.AtendenteRepository;
import br.edu.infnet.springboot.modelo.persistencia.ClienteRepository;
import br.edu.infnet.springboot.modelo.persistencia.TecnicoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ClienteRepository repo){
//	public CommandLineRunner run(AtendenteRepository repo){
//	public CommandLineRunner run(TecnicoRepository repo){
		return (args) -> {
		/* OPERAÇÕES COM A CLASSE CLIENTE */

			/* Salvar Cliente no Banco */
//			Cliente cliente = new Cliente("Priscila","21993703274");
//			repo.save(cliente);

			/* Lista todos os clientes */
//			List<Cliente> cliente = (List<Cliente>) repo.findAll();
//			System.out.println(cliente);

			/* Conta quantos registros tem	*/
//			long count = repo.count();
//			System.out.println(count);

			/* Lista clientes usando paginação */
//			Page<Cliente> clientes = repo.findAll(PageRequest.of(0, 5));
//			System.out.println(clientes.getContent());

			/* Listar clientes por Nome e Nome e Idade */
//			List<Cliente> cliente = repo.findByNome("Bruno");
//			List<Cliente> cliente = repo.findByNomeAndIdade("Bruno",0);
//			System.out.println(cliente.size());

			/* Listar por distinção de nome */
//			List<Cliente> clientes = repo.findDistinctByNome("Bruno");
//			System.out.println(clientes);

			/* Deletar Cliente no Banco */
//			Cliente cliente = new Cliente();
//			repo.deleteById(1l);


			/* OPERAÇÕES COM A CLASSE ATENDENTE*/

			/* Salvar Atendente no Banco */
//			Atendente atendente = new Atendente(1L,"Priscila","priscilipe@gmail.com","21993638628",36,"tecnico","dia");
//			repo.save(atendente);

			/* Lista todos os atendentes */
//			List<Atendente> atendente = (List<Atendente>) repo.findAll();
//			System.out.println(atendente);

			/* Deletar Atendente no Banco */
//			Atendente atendente = new Atendente();
//			repo.deleteById(1l);

			/* OPERAÇÕES COM A CLASSE TECNICO*/

			/* Salvar Tecnico no Banco */
//			Tecnico tecnico = new Tecnico(1L,"Eloah","lolo@gmail.com","21977227799","1234",true,"feminino");
//			repo.save(tecnico);

			/* Lista todos os tecnico */
//			List<Tecnico> tecnico = (List<Tecnico>) repo.findAll();
//			System.out.println(tecnico);

			/* Deletar Tecnico no Banco */
//			Tecnico tecnico = new Tecnico();
//			repo.deleteById(3l);

		};
	}

}
