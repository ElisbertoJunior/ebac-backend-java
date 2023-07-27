package br.com.elisbjr.service;


import br.com.elisbjr.dao.ClientDao;
import br.com.elisbjr.dao.IClientDao;

public class ClientService {
    private IClientDao clientDao;

    public ClientService(IClientDao clientDao) {
        this.clientDao = clientDao;
    }
    public String salvar() {
        clientDao.salvar();
        return "Sucesso";
    }
}
