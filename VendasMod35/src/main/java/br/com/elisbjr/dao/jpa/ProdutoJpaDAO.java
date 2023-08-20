/**
 * 
 */
package br.com.elisbjr.dao.jpa;

import br.com.elisbjr.dao.generic.jpa.GenericJpaDAO;
import br.com.elisbjr.domain.jpa.ProdutoJpa;

/**
 * 
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
