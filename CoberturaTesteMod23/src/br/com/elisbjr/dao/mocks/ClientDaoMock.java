package br.com.elisbjr.dao.mocks;

import br.com.elisbjr.dao.IClientDao;

public class ClientDaoMock implements IClientDao {

    @Override
    public String salvar() {
        return "Sucesso";
    }
}
