import java.util.Scanner;

public class Oggetti {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Libro oggetto = new Libro(3);
        oggetto.sfoglia();
        System.out.println("Inserisci pagina:");
        int scelta = scan.nextInt();
        oggetto.pagina = scelta;
        oggetto.sfoglia();

    }
}


class Libro {
    int pagina = 0;

    public void sfoglia() {
        System.out.println("La pagina è: " + pagina);
    }

    public Libro(int a){
        pagina = a;
    }
}