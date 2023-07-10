package br.com.elisbjr.templateMethod;

public class PoliceOfficer extends Worker {
    @Override
    protected void work() {
        System.out.println("Trabalhando como policial");
    }

    // Sobrescrevendo metodo
    @Override
    protected void gettingUp() {
        System.out.println("Levantar da cama as 6 hrs da manha.");
    }
}
