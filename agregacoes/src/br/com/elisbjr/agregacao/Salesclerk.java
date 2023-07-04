package br.com.elisbjr.agregacao;

public class Salesclerk {
    private Double commission;
    private String name;

    public Double getCommission() {
        return commission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public void sale() {
        System.out.println("vender");
    }


}
