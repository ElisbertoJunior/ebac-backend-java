package br.com.elisbjr.templateMethod;

public abstract class Worker {
    public void performRoutine() {
        startRoutine();
        gettingUp();
        haveBreakfest();
        goWork();
        work();
        backHome();
    }

    protected abstract void work();

    private void backHome() {
        System.out.println("Voltando para casa");
    }

    private void goWork() {
        System.out.println("Indo para o trabalho");
    }

    private void haveBreakfest() {
        System.out.println("Tomando cafe");
    }

    private void startRoutine() {
        System.out.println("Iniciando rotina.");
    }

    protected void gettingUp() {
        System.out.println("Levantando da cama.");
    }

}
