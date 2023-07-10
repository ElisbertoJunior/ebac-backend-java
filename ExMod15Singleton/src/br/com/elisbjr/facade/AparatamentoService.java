package br.com.elisbjr.facade;

public class AparatamentoService implements IApartametoService{

    @Override
    public Boolean cadastraAparatemeto(Apartamento apartamento) {
        Boolean isCadastrado = isApartamentoCadastrado(apartamento);
        if(!isCadastrado) {
            return true;
        }
        return false;

    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento) {
        //logica de busca no banco de dados
        return false;
    }

}
