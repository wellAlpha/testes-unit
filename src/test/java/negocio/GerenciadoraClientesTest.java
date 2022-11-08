package negocio;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GerenciadoraClientesTest {

	GerenciadoraClientes gerClientes;
	
	@Before
	public void setUp() {
		// Cenário
		Cliente cliente01 = new Cliente(1, "Juliana da Silva", 36, "juliana@gmail.com", true);
		Cliente cliente02 = new Cliente(2, "Maurício de Souza", 40, "mauricio@gmail.com", true);
		Cliente cliente03 = new Cliente(3, "João Souza", 16, "joaosouza@gmail.com", true);

		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(cliente01);
		clientes.add(cliente02);
		clientes.add(cliente03);

		gerClientes = new GerenciadoraClientes(clientes);
	}

	@Test
	public void testPesquisaCliente() {

		// Execução
		Cliente cliente = gerClientes.pesquisaCliente(1);

		// Verificação
		assertThat(cliente.getId(), is(1));
		assertThat(cliente.getEmail(), equalTo("juliana@gmail.com"));

	}
	
	@Test
	public void testRemoveCliente() {

		// Execução
		boolean cliente = gerClientes.removeCliente(1);

		// Verificação
		assertThat(cliente, is(true));

	}

}
