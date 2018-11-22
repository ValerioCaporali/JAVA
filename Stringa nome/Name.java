import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String nome = sc.nextLine();
        Analizza object = new Analizza(nome);

        int voc = object.getfirst();
        int cons = object.getsecond();

        System.out.println("Le vocali sono " + voc);
        System.out.println("Le consonanti sono " + cons);
    }

}
