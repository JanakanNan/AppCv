package com.example.janakannandakumaran.appcv;

import java.io.Serializable;

public class Competance implements Serializable {
    private String domaine;
    private String logo;
    private String competance;
    private int niveau;

    public Competance(String domaine, String competance, int niveau, String logo) {
        this.domaine = domaine;
        this.competance = competance;
        this.niveau = niveau;
        this.logo = logo;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCompetance() {
        return competance;
    }

    public void setCompetance(String competance) {
        this.competance = competance;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return this.domaine + " - " + this.competance+ " - "+this.niveau;
    }
}
