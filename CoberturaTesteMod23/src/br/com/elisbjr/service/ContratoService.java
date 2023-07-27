package br.com.elisbjr.service;

import br.com.elisbjr.dao.ContratoDao;
import br.com.elisbjr.dao.IContratoDao;

public class ContratoService implements IContratoService {
    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Item encontrado com sucesso!";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Item excluido com sucesso!";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Item atualizado com sucesso!";
    }

}
