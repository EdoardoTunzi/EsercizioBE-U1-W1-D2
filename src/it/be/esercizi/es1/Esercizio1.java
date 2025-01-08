package it.be.esercizi.es1;

public class Esercizio1 {

    public boolean stringaPariDispari(String testo) {
        if (testo.length() % 2 == 0 ) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public boolean annoBisestile(int anno) {

        if (anno % 400 == 0) {
            System.out.println(anno + " è un anno bisestile." + true);
            return true;
        } else if (anno % 100 == 0) {
            System.out.println(anno + " non è un anno bisestile." + false);
            return false;
        } else if (anno % 4 == 0) {
            System.out.println(anno + " è un anno bisestile." + true);
            return true;
        } else {
            System.out.println(anno + " non è un anno bisestile." + false);
            return false;
        }
    }
}
