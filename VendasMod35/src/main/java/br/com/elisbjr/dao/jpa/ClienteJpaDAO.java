/**
 * 
 */
package br.com.elisbjr.dao.jpa;

import br.com.elisbjr.dao.generic.jpa.GenericJpaDAO;
import br.com.elisbjr.domain.jpa.ClienteJpa;

/**
 * 
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
