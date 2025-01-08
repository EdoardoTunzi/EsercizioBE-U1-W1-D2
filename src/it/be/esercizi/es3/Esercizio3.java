package it.be.esercizi.es3;

import java.util.Scanner;

public class Esercizio3 {
    Scanner scan = new Scanner(System.in);
    public void stringToChar () {
        String testo;
        while (true) {
            System.out.println("Inserisci un testo da dividere");
            testo = scan.nextLine();

            if(testo.equals(":q")) {
                System.out.println("programma terminato");
                break;
            }
            String result = String.join(",", testo.split(""));
            System.out.println(result);
        }
    }
}
