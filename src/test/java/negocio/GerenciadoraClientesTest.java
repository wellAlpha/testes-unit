package negocio;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTest {
	
	GerenciadoraClientes gerClientes;
	
	@Test
	public void testPesquisaCliente() {

		// Cen�rio
		Cliente cliente01 = new Cliente(1, "Juliana da Silva", 36, "juliana@gmail.com", true);
		Cliente cliente02 = new Cliente(2, "Maur�cio de Souza", 40, "mauricio@gmail.com", true);
		Cliente cliente03 = new Cliente(3, "Jo�o Souza", 16, "joaosouza@gmail.com", true);
				
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(cliente01);
		clientes.add(cliente02);
		clientes.add(cliente03);
			
		gerClientes = new GerenciadoraClientes(clientes);
		
		// Execu��o
				Cliente cliente = gerClientes.pesquisaCliente(1);
				
				// Verifica��o
				assertThat(cliente.getId(), is(1));
				assertThat(cliente.getEmail(), equalTo("juliana@gmail.com"));
				
	}

}
