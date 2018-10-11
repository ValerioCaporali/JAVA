//Somma di due numeri con un metodo
import java.util.Scanner;

public class Metodi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insrisci numero 1: ");
        int primo = sc.nextInt();
        System.out.println("Inserisci secondo numero: ");
        int secondo = sc.nextInt();
        int risultato = calcolo(primo,secondo);
        System.out.println("Il risultato è " +risultato);
    }

    private static int calcolo (int a, int b){
        int tot;
        tot = a*b;
        return tot;
    }

}
