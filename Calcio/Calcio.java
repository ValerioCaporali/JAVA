import java.util.ArrayList;
import java.util.Scanner;

public class Calcio {

    /*Creo un array dinamico formato da elementi di tipo Partita. E se andiamo a vedere la classe Partita essa
     * contiene le variabili private: squadra1, squadra2, goal1, goal2, girone. Perciò ogni variabile di tipo
     * Partita conterrà questi vari campi o sottovariabili. Partita è una classe ma può essere usata anche come tipo
     * di variabile ( variabili di tipo Partita ), le quali conterranno i campi (o variabili) sopra elencati.
     * Funge come una struttura.*/
    static ArrayList<Partita> list = new ArrayList<>();

    /*Uso la variabile di tipo boolean (ruuning) per il while. Nel caso l'utente volesse uscire metto la variabile
     * uguale a false. */
    private static boolean running = true;
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("________CALCIO_______");

        while (running) {
            System.out.println("1 -> Inserire partita");
            System.out.println("2 -> Stampa partite");
            System.out.println("3 -> Cerca partite");
            System.out.println("4 -> Esci");
            int command = sc.nextInt();

            switch (command) {

                case 1:
                    inserimento();
                    break;

                case 2:
                    stampa();
                    break;

                case 3:
                    cerca();
                    break;

                case 4:
                    running = false;
                    break;
            }
        }
    }

    /*Con questa funzione acquisico i vallori da tastiera.*/
    public static void inserimento() {
        System.out.println("Inserisci squadria 1: ");
        String sq1 = sc.next();
        System.out.println("Inserisci squadra 2: ");
        String sq2 = sc.next();
        System.out.println("Inserisci goal prima squadra: ");
        int gl1 = sc.nextInt();
        System.out.println("Inserisci goal seconda squadra: ");
        int gl2 = sc.nextInt();
        System.out.println("Inserisci girone: ");
        char gir = sc.next().charAt(0);

        /*Qui creo una variabile (p) di tipo Partita e che perciò conterrà le variabili private presenti nella classe
        * Partita : squadra1, squadra2, goal1, goal2, girone; FUNGE DA STRUTTURA.
        * Poi richiamo il metodo, detto COSTRUTTORE (Partita ())al quale
        * gli passo come parametri le variabili inserite dall'utente precedentemente nel metodo inserimento().
        * Se poi andiamo a controllare la classe Partita e perciò il metodo, detto COSTRUTTORE, vedimao che il suo
        * compito è quello di: prendere le variabili inserite dall'utente, e assegarle alle variabili private
        * presenti nella classe Partita, e che perciò andranno a costituire la variabile di tipo Partita.
        * Perciò la variabile p ora conterrà tutti i valori inseriti dall'utente, perchè come già detto, p è una variabile
        * di tipo Partita, e contiene le "sottovariabili" o campi privati della classe Partita, e io ho inserito
        * in quei campi i valori inseriti dall'utente nella funzione inserimento()
        * attraverso il metodo (Partita ()) detto COSTRUTTORE.
        */
        Partita p = new Partita(sq1, sq2, gl1, gl2, gir);

        /*Qui aggiungo all'array dinamico di nome list la variabile di tipo Partita ovvero p, che conterra le varie
         * sottovariabili o campi private presenti nella classe Partita. guarda commento precedente. */
        list.add(p);
    }

    public static void stampa() {
        for (int i = 0; i < list.size(); i++) {
            Partita a = list.get(i);
            System.out.println("La prima squadra è: " + a.getSquadra1());
            System.out.println("La seconda squadra è: " + a.getSquadra2());
            System.out.println("I goal fatti dalla prima squadra sono: " + a.getGoal1());
            System.out.println("I goal fatti dalla seconda squadra: " + a.getGoal2());
            System.out.println("Il girone era quello di " + a.getGirone());
        }
    }

    public static void cerca() {
        boolean flag = false;
        System.out.println("Inserisci girone: ");
        char giro = sc.next().charAt(0);
        for (int i = 0; i < list.size(); i++){
            Partita p = list.get(i);
            if(giro == p.getGirone()){
                flag = true;
                System.out.println("La prima squadra è: " + p.getSquadra1());
                System.out.println("La seconda squadra è: " + p.getSquadra2());
                System.out.println("I goal fatti dalla prima squadra sono: " + p.getGoal1());
                System.out.println("I goal fatti dalla seconda squadra: " + p.getGoal2());
                System.out.println("Il girone era quello di " + p.getGirone());
            }
        }
        if (!flag)
        System.out.println("Girone non presente");
    }
}
