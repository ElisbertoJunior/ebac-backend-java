/**
 * 
 */
package br.com.elisbjr.dao.jpa;

import br.com.elisbjr.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.elisbjr.domain.jpa.ProdutoJpa;

/**
 * 
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
