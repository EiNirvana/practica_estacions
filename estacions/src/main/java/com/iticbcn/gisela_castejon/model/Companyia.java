package com.iticbcn.gisela_castejon.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Maquinista")
public class Companyia {
    @Id 
    private String nom;

    @Column
    private String telefon;
    
    @Column
    private String adreça;

    public Companyia(String nom, String companyia, String telefon, String adreça) {
        this.nom = nom;
        this.telefon = telefon;
        this.adreça = adreça;
    }

    public Companyia(){}

    public String getNom() {return nom;}
    public String getTelefon() {return telefon;}
    public String getAdreça() {return adreça;}

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }
}
