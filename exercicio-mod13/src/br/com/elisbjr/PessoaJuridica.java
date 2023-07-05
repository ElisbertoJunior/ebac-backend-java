package br.com.elisbjr;

public class PessoaJuridica extends Pessoa {
    private String nomeProprietario;
    private Long cnpj;

    public PessoaJuridica(String nome, String nomeProprietario, Long cnpj) {
        this.setNome(nome);
        this.nomeProprietario = nomeProprietario;
        this.cnpj = cnpj;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
}
