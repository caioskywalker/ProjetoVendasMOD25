package br.com.cfarias.services;


import br.com.cfarias.dao.IclientDAO;
import br.com.cfarias.domain.Cliente;

public class ClienteService implements IClienteService {

	private IclientDAO clientDAO;
	
	
	public ClienteService(IclientDAO clienteDao) {
		this.clientDAO = clienteDao;
		
	}

	
	public void salvar(Cliente cliente) {
		clientDAO.salvar(cliente);
	}


	public Cliente buscarPorCpf(Long cpf) {
		return clientDAO.buscarPorCpf(cpf);
	}

}
