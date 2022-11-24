package com.cc.java;
public class Konto {

    private int kontoStand ;
    private int anfangsKontoStand = 5000;

    public Konto(int anfangsKontoStand) {
        this.anfangsKontoStand = anfangsKontoStand;
    }
    public Konto(){

    }
    
    public int getKontoStand() {
        return kontoStand;
    }

    public void setKontoStand(int kontoStand) {
        this.kontoStand = kontoStand;
    }

    public int getAnfangsKontoStand() {
        return anfangsKontoStand;
    }

    
    
}
