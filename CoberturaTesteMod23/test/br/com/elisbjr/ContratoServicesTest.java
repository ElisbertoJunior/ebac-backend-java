package br.com.elisbjr;

import br.com.elisbjr.dao.ContratoDao;
import br.com.elisbjr.dao.IContratoDao;
import br.com.elisbjr.dao.mocks.ContratoDaoMock;
import br.com.elisbjr.service.ContratoService;
import br.com.elisbjr.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServicesTest {
    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Item encontrado com sucesso!", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoBuscarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Item encontrado com sucesso!", retorno);
    }

    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Item excluido com sucesso!", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoExcluirComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Item excluido com sucesso!", retorno);
    }


    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}
