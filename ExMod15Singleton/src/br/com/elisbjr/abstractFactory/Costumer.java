package br.com.elisbjr.abstractFactory;

public class Costumer {
    private String gradeRequest;
    private Boolean hasCompanyContract;
    public Costumer(String gradeRequest, Boolean hasCompanyContract) {
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }

    public boolean hasCompanyContract() {
        return hasCompanyContract;
    }

    public String getGradeRequest() {
        return gradeRequest;
    }
}
