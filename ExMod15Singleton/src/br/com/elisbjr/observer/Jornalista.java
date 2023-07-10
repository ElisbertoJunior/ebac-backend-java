package br.com.elisbjr.observer;

import java.util.ArrayList;
import java.util.List;

public class Jornalista implements Subject{
    public List<Observer> observers = new ArrayList<>();

    private String titulo;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }


    @Override
    public void notifyAll(String titulo) {
        this.titulo = titulo;
        for(Observer obs : this.observers) {
            obs.update(this);
        }
    }

    @Override
    public String toString() {
        return "Jornalista{" +
                "observers=" + observers +
                ", titulo='" + titulo + '\'' +
                '}';
    }

}
