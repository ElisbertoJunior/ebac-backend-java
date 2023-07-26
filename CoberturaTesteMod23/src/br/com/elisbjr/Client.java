package br.com.elisbjr;

public class Client {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addName(String name) {
        setNome(name);
    }
}
