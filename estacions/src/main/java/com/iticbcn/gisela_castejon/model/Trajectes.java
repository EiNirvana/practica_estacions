package com.iticbcn.gisela_castejon.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Trajectes")
public class Trajectes {
    @Id 
    private int preu;
    
    @Column
    private String nom;
    
    @Column
    private Date date;
    
    @Column
    private String origen;
    
    @Column
    private String desti;
    
    @Column
    private Date horari;

    //Relacions

    public Trajectes(int preu, String nom, Date date, String origen, String desti, Date horari) {
        this.preu = preu;
        this.nom = nom;
        this.date = date;
        this.origen = origen;
        this.desti = desti;
        this.horari = horari;
    }

    public Trajectes(){}

    public int getPreu() {return preu;}
    public String getNom() {return nom;}
    public Date getDate() {return date;}
    public String getOrigen() {return origen;}
    public String getDesti() {return desti;}
    public Date getHorari() {return horari;}
    
    public void setPreu(int preu) {
        this.preu = preu;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public void setDesti(String desti) {
        this.desti = desti;
    }
    public void setHorari(Date horari) {
        this.horari = horari;
    }
}
