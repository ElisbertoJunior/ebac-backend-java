package br.com.elisbjr.builder;

public abstract class BurguerBuilder {
    Burger burger = new Burger();

    abstract void buildBun();
    abstract void buildMeat();
    abstract void buildSalad();
    abstract void buildCheese();
    abstract void buildSauce();

    Burger build() {
        return burger;
    }
}
