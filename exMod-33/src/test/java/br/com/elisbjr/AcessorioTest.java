/**
 * 
 */
package br.com.elisbjr;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.elisbjr.dao.AcessorioDao;
import br.com.elisbjr.dao.CarroDao;
import br.com.elisbjr.dao.IAcessorioDao;
import br.com.elisbjr.dao.ICarroDao;
import br.com.elisbjr.dao.IMarcaDao;
import br.com.elisbjr.dao.MarcaDao;
import br.com.elisbjr.domain.Acessorio;
import br.com.elisbjr.domain.Carro;
import br.com.elisbjr.domain.Marca;

/**
 * 
 */
public class AcessorioTest {
	
	private IMarcaDao marcaDao;
	
	private ICarroDao carroDao;
	
	private IAcessorioDao acessorioDao;
	
	public AcessorioTest() {
		marcaDao = new MarcaDao();
		carroDao = new CarroDao();
		acessorioDao = new AcessorioDao();
	}
	
	@Test
	public void cadastrar() {
		Marca honda = criarMarca("A2", "Honda");
		Carro civic = criarCarro("A2", "Civic 2.0", honda);
		Acessorio spoilerLateral = new Acessorio();
		spoilerLateral.setCodigo("A2");
		spoilerLateral.setNome("Spoiler Lateral");
		spoilerLateral.setCarro(civic);
		spoilerLateral = acessorioDao.cadastrar(spoilerLateral);
		
		assertNotNull(spoilerLateral);
		assertNotNull(spoilerLateral.getId());
	}
	
	
	
	private Marca criarMarca(String codigo, String nome) {
		Marca marca = new Marca();
		marca.setCoidigo(codigo);
		marca.setNome(nome);
		return marcaDao.cadastrar(marca);
	}
	
	private Carro criarCarro(String codigo, String modelo, Marca marca) {
		Carro carro = new Carro();
		carro.setCodigo(codigo);
		carro.setModelo(modelo);
		carro.setMarca(marca);
		return carroDao.cadastrar(carro);
	}

}
