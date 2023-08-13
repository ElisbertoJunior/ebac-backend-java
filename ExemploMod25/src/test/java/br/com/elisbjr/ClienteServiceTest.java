i/**
 * 
 */
package br.com.elisbjr;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.elisbjr.dao.ClienteDaoMock;
import br.com.elisbjr.dao.IClienteDAO;
import br.com.elisbjr.domain.Cliente;
import br.com.elisbjr.exceptions.TipoChaveNaoEncontradaException;
import br.com.elisbjr.services.ClienteService;
import br.com.elisbjr.services.IClienteService;

/**
 * @author elisberto.junior
 *
 */
public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Elisberto");
		cliente.setCidade("Goiania");
		cliente.setEnd("End");
		cliente.setEstado("GO");
		cliente.setNumero(10);
		cliente.setTel(6299999999L);
		
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Elisberto Junior");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Elisberto Junior", cliente.getNome());
	}
}
