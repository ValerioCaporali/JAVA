import java.util.Scanner;

public class Vector {
    private static boolean running = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Quanti elementi ? : ");
        int n = sc.nextInt();
        int vet[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("Inserisci elemento nel vettore: ");
            vet[i] = sc.nextInt();
        }
        Operation object = new Operation(vet);
        System.out.println("-----VETTORE-----");
        while (running) {
            System.out.println("1 -> Ordinamento");
            System.out.println("2 -> Stampa");
            System.out.println("3 -> Cancellazione");
            System.out.println("4 -> Esci");

            int comando = sc.nextInt();
            switch (comando) {
                case 1:
                    object.Ordinamento();
                    break;
                case 2:
                    object.Stampa();
                    break;

                case 3: object.Cancellazione();
                    break;

                case 4:
                    running = false;
                    break;


            }
        }
    }
}
