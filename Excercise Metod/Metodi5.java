import java.util.Scanner;

public class Metodi5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci primo numero: ");
        int primo = sc.nextInt();
        System.out.println("Inserisci secondo numero: ");
        int secondo = sc.nextInt();

        int risultato = operazione(primo,secondo);

        System.out.println("Il risultato è " +risultato);
    }

    private static int operazione (int a, int b){
        int tot;
        tot = a-b;
        return tot;
    }

}
