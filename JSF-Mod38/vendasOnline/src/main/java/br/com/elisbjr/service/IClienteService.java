/**
 * 
 */
package br.com.elisbjr.service;

import br.com.elisbjr.domain.Cliente;
import br.com.elisbjr.exceptions.DAOException;
import br.com.elisbjr.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

}
