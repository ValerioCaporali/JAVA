public class Analizza {
    private String nome;
    private int i = 0;
    private char carattere;
    private int vocali;
    private int consonanti;

    public Analizza(String nome) {
        this.nome = nome;
        nome = nome.toLowerCase();
        for (i = 0; i < nome.length(); i++) {
            carattere = nome.charAt(i);
            if (carattere == 'a' | carattere == 'e' | carattere == 'i' | carattere == 'o' | carattere == 'u')
                vocali = vocali + 1;
            else if (carattere == ' ') {
                vocali = vocali;
                consonanti = consonanti;
            } else
                consonanti += 1;

        }

    }

    public int getfirst(){
        return vocali;
    }

    public int getsecond(){
        return consonanti;
    }

}
