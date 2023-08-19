/**
 * 
 */
package br.com.elisbjr;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;


import br.com.elisbjr.dao.IProduto;
import br.com.elisbjr.dao.ProdutoDao;
import br.com.elisbjr.domain.Produto;

/**
 * 
 */
public class ProdutoTest {
	
	private IProduto daoProduto;
	
	public ProdutoTest() {
		daoProduto = new ProdutoDao();
	}

	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setCodigo("3245345");
		produto.setNome("Playstation 5");
		produto.setDescricao("Video gamde de ultima geracao");
		produto.setPreco(3800);
		produto = daoProduto.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
	}

}
