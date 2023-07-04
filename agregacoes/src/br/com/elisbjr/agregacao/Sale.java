package br.com.elisbjr.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private Buyer buyer;
    private Salesclerk salesclerk;
    private Product product;
    private List<Product> products;

    public Sale() {
        this.products = new ArrayList<>();
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Salesclerk getSalesclerk() {
        return salesclerk;
    }

    public void setSalesclerk(Salesclerk salesclerk) {
        this.salesclerk = salesclerk;
    }

    public Product getProduct() {
        return product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void add(Product product) {
        this.products.add(product);
    }

    public void finalizeSale() {
        System.out.println("Comprador: " + this.buyer.getName());
        System.out.println("Comprou os itens: ");
        for(Product product : this.products) {
            System.out.println("Nome produto " + product.getName() + " valor " + product.getPrice());
        }

        System.out.println("vendedor: " + this.salesclerk.getName());
    }

    public void cancelSale() {
        System.out.println("Venda cancelada!");
    }

    @Override
    public String toString() {
        return "Sale{" +
                "buyer=" + buyer.getName() +
                ", salesclerk=" + salesclerk.getName() +
                ", products=" + products +
                '}';
    }
}
