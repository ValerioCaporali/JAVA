import java.util.Scanner;

public class Operation {
    private int[] vect;
    Scanner sc = new Scanner(System.in);

    public Operation(int[] vect) {

        this.vect = vect;
    }

    public void Ordinamento() {
        for (int i = 0; i < vect.length; i++) {
            boolean flag = false;
            for (int j = 0; j < vect.length - 1; j++) {

                if (vect[j] > vect[j + 1]) {
                    int k = vect[j];
                    vect[j] = vect[j + 1];
                    vect[j + 1] = k;
                    flag = true;
                }


            }

            if (!flag) break;
        }
    }

    public void Stampa() {
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
    }

    public void Cancellazione() {
        System.out.println("Inserisci numero da cancellare");
        int a = sc.nextInt();
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] == a) {
                for(int j = i; j < vect.length - 1; j++){
                    vect[j] = vect[j+1];
                }
                break;
            }
        }
    }
}

