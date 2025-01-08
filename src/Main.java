import it.be.esercizi.es1.Esercizio1;
import it.be.esercizi.es2.Esercizio2;
import it.be.esercizi.es3.Esercizio3;
import it.be.esercizi.es4.Esercizio4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Esercizio1 es1 = new Esercizio1();
        es1.stringaPariDispari("dopo");
        es1.annoBisestile(2024);
        Esercizio2 es2 = new Esercizio2();
        es2.intToString(2);
        Esercizio3 es3 = new Esercizio3();
        es3.stringToChar();
        Esercizio4 es4 = new Esercizio4();
        es4.countDown();
    }
}