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

import br.com.elisbjr.dao.ClientDAO;
import br.com.elisbjr.dao.IProductDAO;
import br.com.elisbjr.dao.ProductDAO;
import br.com.elisbjr.domain.Client;
import br.com.elisbjr.domain.Product;

/**
 * 
 */
public class ProductTest {
	
	private IProductDAO productDAO;
	
	@Test
	public void registerProductTest() throws Exception {
		productDAO = new ProductDAO();
		Product product = new Product();
		product.setCode("01");
		product.setName("Playstation 5");
		product.setValue(3499);
		Integer qtd = productDAO.registerProduct(product);
		assertTrue(qtd == 1);
		
		Product productDB = productDAO.consultProduct(product.getCode());
		assertNotNull(productDB);
		assertNotNull(productDB.getId());
		assertEquals(product.getCode(), productDB.getCode());
		assertEquals(product.getName(), productDB.getName());
		assertEquals(product.getValue(), productDB.getValue());
		
		Integer qtdDel = productDAO.deleteProduct(productDB);
		assertNotNull(qtdDel);
		
	}
	
	
	@Test
	public void searchProductTest() throws Exception {
		productDAO = new ProductDAO();
		Product product = new Product();
		product.setCode("02");
		product.setName("Xbox Series X");
		product.setValue(3899);
		Integer qtd = productDAO.registerProduct(product);
		assertTrue(qtd == 1);
		
		Product productDB = productDAO.consultProduct(product.getCode());
		assertNotNull(productDB);
		assertEquals(product.getCode(), productDB.getCode());
		assertEquals(product.getName(), productDB.getName());
		assertEquals(product.getValue(), productDB.getValue());
		
		Integer qtdDel = productDAO.deleteProduct(productDB);
		assertNotNull(qtdDel);
		
	}
	
	
	@Test
	public void searchAllProductsTest() throws Exception {
		productDAO = new ProductDAO();
		Product product = new Product();
		product.setCode("03");
		product.setName("Nintendo Switch");
		product.setValue(2499);
		Integer qtd = productDAO.registerProduct(product);
		assertTrue(qtd == 1);
		
		productDAO = new ProductDAO();
		Product product2 = new Product();
		product2.setCode("04");
		product2.setName("Xbox Series S");
		product2.setValue(1949);
		Integer qtd2 = productDAO.registerProduct(product);
		assertTrue(qtd2 == 1);
		
		List<Product> list = productDAO.consultAllProducts();
		
		int count = 0;
		for (Product prod : list) {
			productDAO.deleteProduct(prod);
			count++;
		}
		assertEquals(list.size(), count);
		
		list = productDAO.consultAllProducts();
		assertEquals(list.size(), 0);
	}
	
	@Test 
	public void deleteTest() throws Exception {
		   productDAO = new ProductDAO();
		   Product product = new Product();
		   product.setCode("05");
		   product.setName("Jogo God of War");
		   product.setValue(299);
		   Integer qtd = productDAO.registerProduct(product);
		   assertTrue(qtd == 1);
		   
		   Product productDB = productDAO.consultProduct("05");
		   assertNotNull(productDB);
		   assertEquals(product.getCode(), productDB.getCode());
		   assertEquals(product.getName(), productDB.getName());
		   assertEquals(product.getValue(), productDB.getValue());
		   
		   Integer del = productDAO.deleteProduct(productDB);
		   assertTrue(del == 1);
		   
		   
	   }
	
	
	
	@Test
	public void updateProductTest() throws Exception {
		productDAO = new ProductDAO();
		Product product = new Product();
		product.setCode("06");
		product.setName("Call of Duty");
		product.setValue(249);
		Integer qtd = productDAO.registerProduct(product);
		assertTrue(qtd == 1);
		
		Product productDB = productDAO.consultProduct("06");
		assertNotNull(productDB);
		assertEquals(product.getCode(), productDB.getCode());
		assertEquals(product.getName(), productDB.getName());
		assertEquals(product.getValue(), productDB.getValue());
		
		productDB.setCode("07");
		product.setName("Battlefield 2042");
		product.setValue(299);
		Integer qtdUpdate = productDAO.updateProduct(productDB);
		assertTrue(qtdUpdate == 1);
		
		Product productDBnull = productDAO.consultProduct("10");
		assertNull(productDBnull);
		
		Product ipdatedProduct = productDAO.consultProduct("07");
		assertNotNull(ipdatedProduct);
		assertEquals(productDB.getCode(), ipdatedProduct.getCode());
		assertEquals(productDB.getName(), ipdatedProduct.getName());
		assertEquals(productDB.getValue(), ipdatedProduct.getValue());
		
		List<Product> list = productDAO.consultAllProducts();
		for (Product prod : list) {
			productDAO.deleteProduct(prod);
		}
		
		
		
	}
	
	
	
	
	
}










