package br.com.elisbjr;

import java.util.List;

public class Pessoa {
    private String id;
    private String nome;
    private String nacionalidade;
    private Integer idade;

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", idade=" + idade +
                '}';
    }

    public Pessoa() {

    }

    public Pessoa(String id, String nome, String nacionalidade, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<Pessoa> popularPessoa() {
        Pessoa pessoa1 = new Pessoa("p1", "Matheus Henrique", "Brasil", 10);
        Pessoa pessoa2 = new Pessoa("p2", "Heranadez Roja", "Mexico", 21);
        Pessoa pessoa3 = new Pessoa("p3", "Mario Fernandez", "Canada", 22);
        Pessoa pessoa4 = new Pessoa("p4", "Neymar Junior", "Brasil", 31);
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4);

    }

}
