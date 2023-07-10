package br.com.elisbjr.templateMethod;

public class App {

    public static void main(String[] args) {
        Worker fireman = new Fireman();
        fireman.performRoutine();

        System.out.println("------------------");

        Worker policeOfficer = new PoliceOfficer();
        policeOfficer.performRoutine();
    }
}
