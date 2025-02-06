package com.iticbcn.gisela_castejon.model;

import java.io.Serializable;

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
@Table(name="Maquinista")
public class Maquinista implements Serializable{
    @Column(name = "nom")
    private String nom;

    @Id
    private int ID_empleat;

    @Column(name="num_Seguretat_Social")
    private String num_Seguretat_Social;

    @Column(name="salari")
    private float salari;

    @Column(name="nom_companyia")
    private String nom_companyia;

    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="ID_empleat", foreignKey=@ForeignKey(name="FK_COMP_MAQ"))
    private Companyia companyia;

    public Maquinista(String nom, int iD_empleat, String num_Seguretat_Social, float salari, String nom_companyia,
            Companyia companyia) {
        this.nom = nom;
        this.ID_empleat = iD_empleat;
        this.num_Seguretat_Social = num_Seguretat_Social;
        this.salari = salari;
        this.nom_companyia = nom_companyia;
        this.companyia = companyia;
    }

    public Maquinista(String nom, int iD_empleat, String num_Seguretat_Social, float salari, String nom_companyia) {
        this.nom = nom;
        this.ID_empleat = iD_empleat;
        this.num_Seguretat_Social = num_Seguretat_Social;
        this.salari = salari;
        this.nom_companyia = nom_companyia;
    }   

    public Maquinista(){}

    public String getNom() {return nom;}
    public int getID_empleat() {return ID_empleat;}
    public String getNum_Seguretat_Social() {return num_Seguretat_Social;}
    public float getSalari() {return salari;}
    public String getNom_companyia() {return nom_companyia;}
    public Companyia getCompanyia() {return companyia;}

    public void setCompanyia(Companyia companyia) {
        this.companyia = companyia;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setID_empleat(int iD_empleat) {
        ID_empleat = iD_empleat;
    }
    public void setNum_Seguretat_Social(String num_Seguretat_Social) {
        this.num_Seguretat_Social = num_Seguretat_Social;
    }
    public void setSalari(float salari) {
        this.salari = salari;
    }
    public void setNom_companyia(String nom_companyia) {
        this.nom_companyia = nom_companyia;
    }
}
