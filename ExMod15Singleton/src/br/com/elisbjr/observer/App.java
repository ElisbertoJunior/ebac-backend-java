package br.com.elisbjr.observer;

public class App {

    public static void main(String[] args) {
        Jornalista jor = new Jornalista();
        jor.add(new TV());
        jor.notifyAll("teste");
    }
}
