package com.example.janakannandakumaran.appcv;

public class Formation {
    private String annee;
    private String diplome;
    private String description;

    public Formation(String annee, String diplome, String description) {
        this.annee = annee;
        this.diplome = diplome;
        this.description = description;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.annee+ " | "+this.diplome+" \n \n \n "+this.description;
    }
}
