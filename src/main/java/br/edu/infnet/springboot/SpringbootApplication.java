package br.edu.infnet.springboot;

import br.edu.infnet.springboot.modelo.entidade.Cliente;
import br.edu.infnet.springboot.modelo.persistencia.ClienteRepository;
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
		return (args) -> {
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
		};
	}

}
