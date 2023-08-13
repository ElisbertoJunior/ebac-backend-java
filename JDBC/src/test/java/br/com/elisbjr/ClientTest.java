/**
 * 
 */
package br.com.elisbjr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import br.com.elisbjr.dao.IClientDAO;
import br.com.elisbjr.domain.Client;
import br.com.elisbjr.dao.ClientDAO;

/**
 * 
 */
public class ClientTest {
	private IClientDAO clientDAO;
	
   @Test
   public void registerTest() throws Exception {
	   clientDAO = new ClientDAO();
	   Client client = new Client();
	   client.setCode("01");
	   client.setName("Jose Silva");
	   Integer qtd = clientDAO.registerClient(client);
	   assertTrue(qtd == 1);
	   
	   Client clientDB = clientDAO.consult(client.getCode());
	   assertNotNull(clientDB);
	   assertNotNull(clientDB.getId());
	   assertEquals(client.getCode(), clientDB.getCode());
	   assertEquals(client.getName(), clientDB.getName());
	   
	   Integer qtdDel = clientDAO.delete(clientDB);
	   assertNotNull(qtdDel);
   }
   
   @Test
   public void searchTest() throws Exception {
	   clientDAO = new ClientDAO();
	   Client client = new Client();
	   client.setCode("2");
	   client.setName("Jose Alves");
	   Integer qtd = clientDAO.registerClient(client);
	   assertTrue(qtd == 1);

	   Client clientDB = clientDAO.consult("2");
	   assertNotNull(clientDB);
	   assertEquals(client.getCode(), clientDB.getCode());
	   assertEquals(client.getName(), clientDB.getName());
	   
	   Integer del = clientDAO.delete(clientDB);
	   assertTrue(del == 1);
   }
   
   @Test
   public void searchAllTest() throws Exception {
	   clientDAO = new ClientDAO();
	   Client client = new Client();
	   client.setCode("4");
	   client.setName("Elisberto Junior");
	   Integer qtd = clientDAO.registerClient(client);
	   assertTrue(qtd == 1);
	   
	   Client client2 = new Client();
	   client2.setCode("12");
	   client2.setName("Joao Silva");
	   Integer qtd2 = clientDAO.registerClient(client2);
	   assertTrue(qtd2 == 1);
	   
	   List<Client> list = clientDAO.searchAll();
	   assertNotNull(list);
	   assertEquals(2, list.size());
	   
	   int count = 0;
	   for (Client cli : list) {
		   clientDAO.delete(cli);
		   count++;
	   }
	   assertEquals(list.size(), count);
	   
	   list = clientDAO.searchAll();
	   assertEquals(list.size(), 0);
	   
   }
   
   @Test 
   public void deleteTest() throws Exception {
	   clientDAO = new ClientDAO();
	   Client client = new Client();
	   client.setCode("30");
	   client.setName("Jacinto Peixoto");
	   Integer qtd = clientDAO.registerClient(client);
	   assertTrue(qtd == 1);
	   
	   Client clientDB = clientDAO.consult("30");
	   assertNotNull(clientDB);
	   assertEquals(client.getCode(), clientDB.getCode());
	   assertEquals(client.getName(), clientDB.getName());
	   
	   Integer del = clientDAO.delete(clientDB);
	   assertTrue(del == 1);
	   
	   
   }
   
   @Test
   public void updateTest() throws Exception {
	   clientDAO = new ClientDAO();
	   Client client = new Client();
	   client.setCode("40");
	   client.setName("Joao Silva");
	   Integer qtd = clientDAO.registerClient(client);
	   assertTrue(qtd == 1);
	   
	   Client clientDB = clientDAO.consult("40");
	   assertNotNull(clientDB);
	   assertEquals(client.getCode(), clientDB.getCode());
	   assertEquals(client.getName(), clientDB.getName());
	   
	   clientDB.setCode("20");
	   clientDB.setName("Jose Quirino");
	   Integer qtdUpdate = clientDAO.updateClient(clientDB);
	   assertTrue(qtdUpdate == 1);
	    
	   Client clientDB1 = clientDAO.consult("10");
	   assertNull(clientDB1);
	   
	   Client clientDB2 = clientDAO.consult("20");
	   assertNotNull(clientDB2);
	   assertEquals(clientDB.getId(), clientDB2.getId());
	   assertEquals(clientDB.getCode(), clientDB2.getCode());
	   assertEquals(clientDB.getName(), clientDB2.getName());
	   
	   List<Client> list = clientDAO.searchAll();
	   for (Client cli : list) {
		   clientDAO.delete(cli);
	   }
	   
	   
   }
   
   
}
