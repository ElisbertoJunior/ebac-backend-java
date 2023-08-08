/**
 * 
 */
package br.com.elisbjr.services;

import br.com.elisbjr.domain.Cliente;
import br.com.elisbjr.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author elisberto.junior
 *
 */
public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
