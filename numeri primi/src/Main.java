import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Questo programma controlla se il numero da te inserito è primo");
        System.out.println("Inserisci un numero");
        int numero = input.nextInt();
        int i;
        for (i = 2; i < numero; ++i) {
            if (numero % i == 0) {
                System.out.println("il numero non è primo");
                return;
            }
        }
        System.out.println("il numero è primo");
    }
}
