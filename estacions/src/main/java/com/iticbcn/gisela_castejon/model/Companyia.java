package com.iticbcn.gisela_castejon.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Maquinista")
public class Companyia implements Serializable{
    @Id 
    private String nom;

    @Column
    private String telefon;
    
    @Column
    private String adreça;

    @OneToMany(mappedBy="companyia", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Set<Tren> trens = new HashSet<Tren>();

    public void addTren(Tren tren){
        if(!this.trens.contains(tren)){
            trens.add(tren);
            tren.setCompanyia(this);
        }

    }

    public Companyia(String nom, String telefon, String adreça) {
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
