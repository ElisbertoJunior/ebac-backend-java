package br.com.elisbjr.agregacao;

public class Buyer {
    private String name;
    private Double budget;

    public Buyer(String name, Double budget) {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public void buy() {
        System.out.println("comprar");
    }
}
