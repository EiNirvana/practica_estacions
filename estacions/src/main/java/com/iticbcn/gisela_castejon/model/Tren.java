package com.iticbcn.gisela_castejon.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Tren")
public class Tren {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int serial_num;

    @Column
    private int capacitat;
    
    @Column
    private String marca;
    
    @Column
    private String model;
    
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="nom", foreignKey=@ForeignKey(name="FK_COMP_TREN"))
    private Companyia companyia;

    public Tren(int capacitat, String marca, String model, int serial_num, Companyia companyia) {
        this.capacitat = capacitat;
        this.marca = marca;
        this.model = model;
        this.serial_num = serial_num;
        this.companyia = companyia;
    }

    public Tren(int capacitat, String marca, String model, int serial_num) {
        this.capacitat = capacitat;
        this.marca = marca;
        this.model = model;
        this.serial_num = serial_num;
    }

    @OneToMany(mappedBy="tren", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Set<Trajectes> trajectes = new HashSet<Trajectes>();

    public void addTrajectes(Trajectes trajecte){
        if(!this.trajectes.contains(trajecte)){
            trajectes.add(trajecte);
            trajecte.setTren(this);
        }
    }

    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="ID_empleat", foreignKey=@ForeignKey(name="FK_MAQ_TREN"))
    private Maquinista maquinista;

    public Tren(int serial_num, int capacitat, String marca, String model, Maquinista maquinista) {
        this.serial_num = serial_num;
        this.capacitat = capacitat;
        this.marca = marca;
        this.model = model;
        this.maquinista = maquinista;
    }

    public Tren(){}

    public int getCapacitat() {return capacitat;}
    public String getMarca() {return marca;}
    public String getModel() {return model;}
    public int getSerial_num() {return serial_num;}
    public Companyia getCompanyia() {return companyia;}
    public Maquinista getMaquinista() {return maquinista;}

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }
    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setSerial_num(int serial_num) {
        this.serial_num = serial_num;
    }
    public void setCompanyia(Companyia companyia) {
        this.companyia = companyia;
    }
}
