/**
 * 
 */
package br.com.elisbjr.dao;

import java.util.List;

import br.com.elisbjr.domain.Client;

/**
 * 
 * 
 */
public interface IClientDAO  {
	public Integer registerClient(Client client) throws Exception;
	
	public Integer updateClient(Client client) throws Exception;

	public Client consult(String code) throws Exception;
	
	public List<Client> searchAll() throws Exception;

	public Integer delete(Client client) throws Exception;
}
