package br.com.cfarias.dao;

import br.com.cfarias.domain.Cliente;

public class ClienteDaoMock implements IclientDAO {

	
	public void salvar(Cliente cliente) {
		
	}

	
	public Cliente buscarPorCpf(Long cpf) {
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		return cliente;
	}
	
	

}
