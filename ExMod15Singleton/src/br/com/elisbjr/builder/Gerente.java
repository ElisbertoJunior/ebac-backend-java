package br.com.elisbjr.builder;

public class Gerente {
    BurguerBuilder builder;

//    public Gerente(BurguerBuilder builder) {
//        this.builder = builder;
//    }

    public void setBuilder(BurguerBuilder builder) {
        this.builder = builder;
    }

    public Burger buildBurger() {
        builder.buildBun();
        builder.buildMeat();
        builder.buildSalad();
        builder.buildCheese();
        builder.buildSauce();
        return builder.build();
    }
}
