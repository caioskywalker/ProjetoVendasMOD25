package br.com.cfarias.services;

import br.com.cfarias.domain.Cliente;

public interface IClienteService {

	void salvar(Cliente cliente);

	Cliente buscarPorCpf(Long cpf);

}
