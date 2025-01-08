package it.be.esercizi.es4;

import java.util.Scanner;

public class Esercizio4 {
    Scanner scan = new Scanner(System.in);

    public void countDown () {
        System.out.println("Inserisci un numero per iniziare il countdown");
        int num = Integer.parseInt(scan.nextLine());

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }

}
