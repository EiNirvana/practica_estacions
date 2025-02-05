package com.iticbcn.gisela_castejon.model;

import java.util.Date;

public class Trajectes {
    private int preu;
    private String nom;
    private Date date;
    private String origen;
    private String desti;
    private Date horari;

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
