package br.com.elisbjr;

import br.com.elisbjr.dao.ClientDao;
import br.com.elisbjr.dao.mocks.ClientDaoMock;
import br.com.elisbjr.dao.IClientDao;
import br.com.elisbjr.service.ClientService;
import org.junit.Assert;
import org.junit.Test;

public class ClientServiceTest {
    @Test
    public void salvarTest() {
        IClientDao mockDao = new ClientDaoMock();
        ClientService service = new ClientService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroSalvarTest() {
        IClientDao clientDao = new ClientDao();
        ClientService service = new ClientService(clientDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
