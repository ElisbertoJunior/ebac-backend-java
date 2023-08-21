/**
 * 
 */
package br.com.elisbjr.dao.jpa;

import br.com.elisbjr.dao.generic.jpa.IGenericJapDAO;
import br.com.elisbjr.domain.jpa.Persistente;

/**
 * 
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
