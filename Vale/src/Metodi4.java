//Data una frase e un numero stampare la parola che si trova nella posizione del numero inserito
import java.util.Scanner;

public class Metodi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci frase: ");
        String frase = sc.nextLine();
        System.out.println("Quale parola stampare(numero): ");
        int posizione = sc.nextInt();
        parola(frase,posizione);
    }

    private static void parola(String a, int b){
        String[] split = a.split(" ");
        System.out.println("La parola o lettera è -> " +split[b-1]);
    }

}
