/**
 * 
 */
package br.com.elisbjr.services;

import br.com.elisbjr.dao.IProdutoDAO;
import br.com.elisbjr.domain.Produto;
import br.com.elisbjr.services.generic.GenericService;

/**
 * @author elisberto.junior
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
