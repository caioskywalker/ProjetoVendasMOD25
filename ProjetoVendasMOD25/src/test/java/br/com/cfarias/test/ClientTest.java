package br.com.cfarias.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cfarias.dao.ClienteDAO;
import br.com.cfarias.dao.ClienteDaoMock;
import br.com.cfarias.dao.IclientDAO;
import br.com.cfarias.domain.Cliente;
import br.com.cfarias.services.ClienteService;
import br.com.cfarias.services.IClienteService;

public class ClientTest {
	
	private IClienteService clienteService;
	private Cliente cliente;
	
	public ClientTest() {
		
		IclientDAO clientMock = new ClienteDaoMock();
		clienteService = new ClienteService(clientMock);	
		
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		
		cliente.setCidade("Rio de Janeiro");
		cliente.setCpf(64684654l);
		cliente.setEndereco("Rua da Amendoeira");
		cliente.setEstado("RJ");
		cliente.setNome("Caio");
		cliente.setNumero(2);
		cliente.setTelefone(24950866l);
		cliente.setIdade(28);
		
		clienteService.salvar(cliente);
		
	}
	
	
	@Test
	public void pesquisarCliente() {
		
		Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}

}
