/**
 * 
 */
package br.com.elisbjr.dao;


import java.util.List;

import br.com.elisbjr.domain.Product;

/**
 * 
 */
public interface IProductDAO {
	
	public Integer registerProduct(Product product) throws Exception;
	
	public Integer updateProduct(Product product) throws Exception;
	
	public Product consultProduct(String code) throws Exception;
	
	public List<Product> consultAllProducts() throws Exception;
	
	public Integer deleteProduct(Product product) throws Exception;
	
	
}
