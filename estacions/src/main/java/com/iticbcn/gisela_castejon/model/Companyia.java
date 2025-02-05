package com.iticbcn.gisela_castejon.model;

public class Companyia {
    private String nom;
    private String companyia;
    private String telefon;
    private String adreça;

    public Companyia(String nom, String companyia, String telefon, String adreça) {
        this.nom = nom;
        this.companyia = companyia;
        this.telefon = telefon;
        this.adreça = adreça;
    }

    public Companyia(){}

    public String getNom() {return nom;}
    public String getTelefon() {return telefon;}
    public String getCompanyia() {return companyia;}
    public String getAdreça() {return adreça;}

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setCompanyia(String companyia) {
        this.companyia = companyia;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }
}
