/**
 * 
 */
package br.com.elisbjr.dao.jpa;

import br.com.elisbjr.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.elisbjr.domain.jpa.ClienteJpa;

/**
 * 
 *
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
