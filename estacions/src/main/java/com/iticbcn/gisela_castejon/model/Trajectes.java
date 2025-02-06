package com.iticbcn.gisela_castejon.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="preu", foreignKey=@ForeignKey(name="FK_TREN_TRAJ"))
    private Tren tren;

    
    public Trajectes(int preu, String nom, Date date, String origen, String desti, Date horari, Tren tren) {
        this.preu = preu;
        this.nom = nom;
        this.date = date;
        this.origen = origen;
        this.desti = desti;
        this.horari = horari;
        this.tren = tren;
    }

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
    public Tren getTren() {return tren;}

    public void setTren(Tren tren) {
        this.tren = tren;
    }
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
