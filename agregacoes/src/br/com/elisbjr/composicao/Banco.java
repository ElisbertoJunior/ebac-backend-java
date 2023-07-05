package br.com.elisbjr.composicao;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private Long codigo;
    private String nome;
    private Set<ContaCorrente> contasCorrentes;
    private Set<ContaPoupanca> contasPoupanca;

    public Banco() {
        this.contasCorrentes = new HashSet<>();
        this.contasPoupanca = new HashSet<>();
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addContaCorrente(ContaCorrente cc) {
        this.contasCorrentes.add(cc);
    }

    public void addContaPoupanca(ContaPoupanca cp) {
        this.contasPoupanca.add(cp);
    }
}
