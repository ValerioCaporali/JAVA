//Data una frase stampa il numero della posizione e la parola che le corrisponde
import java.util.Scanner;

public class Metodi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci frase");
        String frase = sc.nextLine();
        divisione(frase);
    }
    private static void divisione (String boh){
        String[] nuovo = boh.split(" ");
        for(int i=0; i<nuovo.length; i++){
            System.out.println(i+1+" -> " +nuovo[i]);
        }
    }
}
