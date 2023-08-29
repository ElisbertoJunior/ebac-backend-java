/**
 * 
 */
package br.com.elisbjr.dao;

import br.com.elisbjr.dao.generic.GenericDAO;
import br.com.elisbjr.domain.Cliente;

/**
 * 
 *
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
