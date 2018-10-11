import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagrafe {
    static List<Persona> anagrafe = new ArrayList<>();
    private static boolean running = true;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (running) {
            System.out.print("Comando: ");
            int comand = sc.nextInt();

            switch (comand) {

                case 1:
                    aggiungi();
                    break;

                case 2:
                    cerca();
                    break;

                case 3:
                    stampa();
                    break;

            }
        }
    }

    public static void aggiungi() {
        System.out.println("Insrimento persone");
        System.out.println("Nome: ");
        String nome = sc.next();
        System.out.println("Cognome: ");
        String cognome = sc.next();
        System.out.print("Età:");
        int eta = sc.nextInt();

        //Dichiarazione oggetto
        Persona p = new Persona(nome, cognome, eta);
        anagrafe.add(p);

    }

    public static void cerca() {
        System.out.print("Inserisci nome: ");
        String nome = sc.nextLine();
        // TODO finish this method
    }

    public static void stampa() {
        for (int i = 0; i < anagrafe.size(); i++) {
            Persona a = anagrafe.get(i);
            System.out.println("Nome: " + a.getNome());
            System.out.println("Cognome: " + a.getCognome());
            System.out.println("eta: " + a.getEta());
        }
    }
}
