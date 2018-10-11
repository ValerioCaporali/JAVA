import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Inserisi il raggio: ");
        double r = sc.nextDouble();
        Cerchio oggetto = new Cerchio(r);

        System.out.println("L'area del cerchio è: " +oggetto.area());
        System.out.println("L'area arrotondata è:" +oggetto.arrotondare());
        System.out.println("Il perimetro è: " +oggetto.perimetro());
        System.out.println("Inserire l'altezza del cilindro: ");
        double a = sc.nextDouble();
        System.out.println("L'area del cilindro è: " +oggetto.cilindro(a));
    }
}
