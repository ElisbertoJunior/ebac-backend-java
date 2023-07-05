package br.com.elisbjr.agregacao;

public class Product {
    private String name;
    private Long code;
    private Double price;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void sold() {
        System.out.println("vendido!");
    }
}
