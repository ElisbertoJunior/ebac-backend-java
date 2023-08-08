/**
 * 
 */
package br.com.elisbjr.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.elisbjr.dao.Persistente;
import br.com.elisbjr.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author elisberto.junior
 *
 */
public interface IGenericService <T extends Persistente, E extends Serializable> {
	
	
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

   
    public void excluir(E valor);

  
    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    
    public T consultar(E valor);

    
    public Collection<T> buscarTodos();

}
