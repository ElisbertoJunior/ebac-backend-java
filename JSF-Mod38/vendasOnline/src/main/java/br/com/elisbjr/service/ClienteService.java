/**
 * 
 */
package br.com.elisbjr.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.elisbjr.dao.IClienteDAO;
import br.com.elisbjr.domain.Cliente;
import br.com.elisbjr.exceptions.DAOException;
import br.com.elisbjr.exceptions.MaisDeUmRegistroException;
import br.com.elisbjr.exceptions.TableException;
import br.com.elisbjr.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
