package br.com.elisbjr.builder;

public class Demo {

    public static void main(String[] args) {
    //  Gerente gerente = new Gerente(new CheeseBurguerBuilder());

        Gerente gerente = new Gerente();
        gerente.setBuilder(new CheeseBurguerBuilder());
        Burger burger = gerente.buildBurger();
        burger.print();
    }

}
