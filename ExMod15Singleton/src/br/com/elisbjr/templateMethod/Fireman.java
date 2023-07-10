package br.com.elisbjr.templateMethod;

public class Fireman extends Worker {

    @Override
    protected void work() {
        System.out.println("Trabalhando como  bombeiro apagando fogo");
    }
}
