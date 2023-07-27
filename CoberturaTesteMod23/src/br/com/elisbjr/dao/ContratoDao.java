package br.com.elisbjr.dao;

public class ContratoDao implements IContratoDao{
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Item nao encontrado");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não foi possivel excluir item");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Não foi posivel atualizar item");
    }
}
