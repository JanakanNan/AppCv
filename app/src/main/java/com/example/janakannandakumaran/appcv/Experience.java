package com.example.janakannandakumaran.appcv;

public class Experience {

    private String annee;
    private String intitule;
    private String description;

    public Experience(String annee, String intitule, String description) {
        this.annee = annee;
        this.intitule = intitule;
        this.description = description;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.annee+ " | "+this.intitule+" \n \n \n "+this.description;
    }
}
