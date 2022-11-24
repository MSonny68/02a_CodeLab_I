package com.cc.java;

public class App {
    
    public static void main(String[] args) {

       Konto konto1 = new Konto();  //Standartanfangskontostand = 5000
       Konto konto2 = new Konto(100);  //für dieses Objekt Anfangskontostand
       Konto konto3 = new Konto(2000);  //für dieses Objekt Anfangskontostand

       
            output("Anfangs-Kontostand für Konto1 beträgt: "+ String.valueOf(konto1.getAnfangsKontoStand()));
            output("Anfangs-Kontostand für Konto2 beträgt: "+ String.valueOf(konto2.getAnfangsKontoStand()));
            output("Anfangs-Kontostand für Konto3 beträgt: "+ String.valueOf(konto3.getAnfangsKontoStand()));

       
        konto1.setKontoStand(konto1.getAnfangsKontoStand()*2);
        konto2.setKontoStand(konto2.getAnfangsKontoStand()*3);
        konto3.setKontoStand(konto3.getAnfangsKontoStand()*10);



        output("Kontostand für Konto1 beträgt: "+ String.valueOf(konto1.getKontoStand()));
        output("Kontostand für Konto2 beträgt: "+ String.valueOf(konto2.getKontoStand()));
        output("Kontostand für Konto3 beträgt: "+ String.valueOf(konto3.getKontoStand()));
        
        konto1.setKontoStand(konto1.getAnfangsKontoStand());
        output("ursprünglicher Kontostand für Konto1 betrug: "+ String.valueOf(konto1.getKontoStand()));
        konto2.setKontoStand(konto2.getAnfangsKontoStand());
        output("ursprünglicher Kontostand für Konto2 betrug: "+ String.valueOf(konto2.getKontoStand()));
        konto3.setKontoStand(konto3.getAnfangsKontoStand());
        output("ursprünglicher Kontostand für Konto3 betrug: "+ String.valueOf(konto3.getKontoStand()));

        konto1.setKontoStand(konto1.getKontoStand()*20);
        konto2.setKontoStand(konto2.getKontoStand()*30);
        konto3.setKontoStand(konto3.getKontoStand()*40);

        output("Kontostand für Konto1 beträgt: "+ String.valueOf(konto1.getKontoStand()));
        output("Kontostand für Konto2 beträgt: "+ String.valueOf(konto2.getKontoStand()));
        output("Kontostand für Konto3 beträgt: "+ String.valueOf(konto3.getKontoStand()));



    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

    


}

