/**
 * 
 */
package br.com.elisbjr.dao;

import br.com.elisbjr.dao.generic.IGenericDAO;
import br.com.elisbjr.domain.Venda;
import br.com.elisbjr.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author elisberto.junior
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
