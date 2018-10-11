import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("area triangolo -> 1 / area quadrato -> 2");
        System.out.println("cosa vuoi calcolare ? ");
        int scelta = input.nextInt();
        if(scelta == 1){
            System.out.println("inserisci base:");
            int base = input.nextInt();
            System.out.println("inserisci altezza:");
            int altezza = input.nextInt();
            int totale = base*altezza/2;
            System.out.println("l'area è " +totale);
        }

        else{
            System.out.println("inserisci lato:");
            int lato = input.nextInt();
            int area = lato*lato;
            System.out.println("l'area è " +area);
        }

    }
}
