package com.iticbcn.gisela_castejon.model;

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

    public Tren(){}

    public int getCapacitat() {return capacitat;}
    public String getMarca() {return marca;}
    public String getModel() {return model;}
    public int getSerial_num() {return serial_num;}

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

    public Companyia getCompanyia() {
        return companyia;
    }

    public void setCompanyia(Companyia companyia) {
        this.companyia = companyia;
    }
}
