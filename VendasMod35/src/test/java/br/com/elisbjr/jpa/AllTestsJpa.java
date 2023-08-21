/**
 * 
 */
package br.com.elisbjr.jpa;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.elisbjr.VendaDAOTest;


/**
 * 
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ClienteJpaDaoTest.class, ProdutoJpaDAOTest.class, VendaDAOTest.class})
public class AllTestsJpa {

}
