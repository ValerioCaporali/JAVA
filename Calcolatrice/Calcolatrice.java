import java.util.Scanner;

public class Calcolatrice {

    //running mi serve per far girare il while, e nel caso dovessi uscire lo faccio diventare false
    private static boolean running = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Benvenuto, digita esci per uscire e help per i comandi");

        //come detto sopra, finche il running è uguale a true faccio quello dentro
        while(running) {

            //acquisisco la stringa
            String comando = sc.nextLine();

            //qui nel caso avesse inserito lettere maiuscole uso toLowerCase per farle diventare tutte piccole
            switch (comando.toLowerCase()) {

                //nel caso venga digitato help -> gli faccio l'elenco dei comandi
                case "help":
                    System.out.println("\n\nHelp: \n" +
                            "esci->uscire dal calcolatore\n" +
                            "x + x-> somma due numeri\n" +
                            "x * x-> moltiplica due numeri\n" +
                            "x - x-> sottrai due numeri\n" +
                            "x / x-> dividi due numeri");
                    break;//con il break ritorno all'inserimento del coamando

                //nel caso digiti esci running = false e la condizione nel while non si verifica più quindi esco
                case "esci":
                    running = false;
                    break;

                /*nel caso non digita ne help ne esci vuol dire che è stata inserita l'operazione da fare
                perciò avvio la funzione che controlla tutti i numeri e gli operatori e restituisce il risultato*/
                default:

                    //richiamo del metodo (funzione) che come già detto sopra restituisce un double(risultato)
                    double risultato = controllo(comando);

                    //stampa del risultato
                    System.out.println("Risultato: " +risultato);

            }

        }
    }

    /*Il comando dell'utente che noi abbiamo acquisito sopra è dentro la variabile comando di tipo stringa.
      * Essendo questa variabile di tipo stringa tutto ciò al suo interno (che sia una frase un numero)
       * è come se si trova tutta insieme dentro un unica casella non potendo cosi analizzare le varie parti.
       * In questa funzione usando dei metodi (funzioni) specifiche, andremo a separare le varie parti
       * della variabile comando di tipo stringa, es:
       * se nella variabile di tipo stringa contiene "ciao a tutti", con dei metodi si va a mettere dentro
       * un array di stringhe "ciao" nella prima casella, "a" nella seconda e "tutti" nella terza, come puoi
       * vedere si vanno ad eliminare anche gli spazi;
       * nel nostro caso es:
       * 1 + 2 sempre con dei metodi, si tolgono gli spazi e l' "1" va a finire nella prima casella di un
       * vettore, il "+" nella seconda casella e il "2" nella terza casella.
       * come potrai vedere in seguito con questo modo possiamo svolgere l'operazione perchè abbiamo sia
       * i numeri sia il simbolo*/
    private static double controllo (String boh){

        //.split è quel metodo che svolge le azione sopra elencate
        String[] split = boh.split( " ");
        double primo = Double.valueOf(split[0]);
        double secondo = Double.valueOf(split[2]);
        char operatore = split[1].charAt(0);

        /*Qui si fa uno switch-case in base all'operatore. Se l'operatore è il "+" faccio la somma
        * e faccio return (faccio ritornare il risultato
        * al richiamo della funzione (double risultato = controllo(comando);) )*/
        switch(operatore){

            case '*':
                return primo*secondo;

            case'+':
                return primo+secondo;

            case'-':
                return primo-secondo;

            case '/':
                return primo/secondo;

        }
        return-1;
    }
}
