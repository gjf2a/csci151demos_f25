package examples;

public class Scorekeeper {
    private int home;
    private int away;

    public Scorekeeper() {
        home = 0;
        away = 0;
    }

    public void score(boolean home) {
        if (home) {
            this.home += 1;
        } else {
            this.away += 1;
        }
    }

    public boolean wins(boolean home) {
        if (this.home == this.away) {
            return false;
        } else if (home) {
            return this.home > this.away;
        } else {
            return this.away > this.home;
        }
    }

    public static void main(String[] args) {
        Scorekeeper score = new Scorekeeper();
        score.score(true);
        score.score(true);
        score.score(false);
        System.out.println("Did Home win? " + score.wins(true));
    }
}
