package br.com.elisbjr.dao.generic;

import br.com.elisbjr.dao.Persistente;
import br.com.elisbjr.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author elisberto.junior
 *
 * Interface genérica para métodos de CRUD(Create, Read, Update and Delete)
 */
public interface IGenericDAO <T extends Persistente, E extends Serializable> {

    
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    
    public void excluir(E valor);

    
    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

   
    public T consultar(E valor);

    
    public Collection<T> buscarTodos();
}
