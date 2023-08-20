/**
 * 
 */
package br.com.elisbjr.services;

import br.com.elisbjr.domain.Cliente;
import br.com.elisbjr.exceptions.DAOException;
import br.com.elisbjr.services.generic.IGenericService;

/**
 * 
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
