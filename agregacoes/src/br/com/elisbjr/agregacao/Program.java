package br.com.elisbjr.agregacao;

public class Program {

    public static void main(String[] args) {
        Product productTV = createProduct(1L, "TV", 1500D);
        Product productCel = createProduct(2L, "Celular", 1000D);

        Salesclerk salesclerk = createSalesclerk("Marcelo", 10D);

        Buyer buyer = createBuyer("Jose Almeida", 3000d);

        Sale sale = new Sale();
        sale.setBuyer(buyer);
        sale.setSalesclerk(salesclerk);
        sale.add(productTV);
        sale.add(productCel);

        sale.finalizeSale();
        System.out.println(sale);
        sale.cancelSale();
        sale = null;
        System.out.println(sale);
    }

    private static Buyer createBuyer(String name, Double budget) {
         return new Buyer(name, budget);
    }

    private static Salesclerk createSalesclerk(String name, Double commission) {
        Salesclerk salesclerk = new Salesclerk();
        salesclerk.setName(name);
        salesclerk.setCommission(commission);

        return salesclerk;
    }

    private static Product createProduct(Long code, String name, Double price) {
        Product product = new Product();
        product.setCode(code);
        product.setName(name);
        product.setPrice(price);

        return product;
    }

}
