package negocio;

import java.util.List;

public class GerenciadoraClientes {

	private List<Cliente> clientes;

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public GerenciadoraClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void adicionaCliente(Cliente novoCliente) {
		clientes.add(novoCliente);
	}

	public boolean removeCliente(int idCliente) {
		boolean clienteRemovido = false;

		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			if (cliente.getId() == idCliente) {
				clientes.remove(i);
				clienteRemovido = true;
				break;
			}
		}

		return clienteRemovido;
	}

	public Cliente pesquisaCliente(int idCliente) {
		for (Cliente cliente : clientes) {
			if (cliente.getId() == idCliente) {
				return cliente;
			}
		}

		return null;
	}

	public boolean clienteAtivo(int idCliente) {
		boolean clienteAtivo = false;

		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			if (cliente.getId() == idCliente && cliente.isAtivo()) {
				clienteAtivo = true;
				break;
			}
		}

		return clienteAtivo;
	}

	public void limpa() {
		this.clientes.clear();
	}
	
	public boolean validaIdade(int idade) {
		if (idade < 18 || idade > 65) {
			throw new IdadeNaoPermitidaException(IdadeNaoPermitidaException.MSG_IDADE_INVALIDA);	
		}
		
		return true;
	}

}
