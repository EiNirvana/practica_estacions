package com.iticbcn.gisela_castejon.model;

public class Tren {
    private int capacitat;
    private String marca;
    private String model;
    private int serial_num;

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
}
