package br.com.cfarias.dao;

import br.com.cfarias.domain.Cliente;

public interface IclientDAO {
	
	void salvar(Cliente cliente);
	
	Cliente buscarPorCpf(Long cpf);

}
