public class Partita {
    private String squadra1;
    private String squadra2;
    private int goal1;
    private int goal2;
    private char girone; // a = andata, r = ritorno

    public Partita(String squadra1, String squadra2, int goal1, int goal2, char girone) {
        this.squadra1 = squadra1;
        this.squadra2 = squadra2;
        this.goal1 = goal1;
        this.goal2 = goal2;
        this.girone = girone;
    }

    public char getGirone() {
        return girone;
    }

    public int getGoal1() {
        return goal1;
    }

    public int getGoal2() {
        return goal2;
    }

    public String getSquadra1() {
        return squadra1;
    }

    public String getSquadra2() {
        return squadra2;
    }
}

