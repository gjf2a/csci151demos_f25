package craps;// Make an initial roll
// 2, 3, 12: Lose
// 7, 11: Win
// Anything else: "Point"
// Roll again until:
// * Point: Win
// * 7: Lose

public class Craps {
    private int point;
    private boolean outcome;
    private boolean gameOver;

    public static int singleDieRoll() {
        return (int)(Math.random() * 6) + 1;
    }

    public static int dieRoll() {
        return singleDieRoll() + singleDieRoll();
    }

    public Craps() {
        gameOver = false;
        point = dieRoll();
        if (point <= 3 || point == 12) {
            outcome = false;
            gameOver = true;
        } else if (point == 7 || point == 11) {
            outcome = true;
            gameOver = true;
        }
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public boolean didIWin() {
        return outcome;
    }

    public void rollAgain() {
        if (!gameOver) {
            int roll = dieRoll();
            if (roll == 7) {
                outcome = false;
                gameOver = true;
            } else if (roll == point) {
                outcome = true;
                gameOver = true;
            }
        }
    }

    public static void main(String[] args) {
        Strategy[] players = new Strategy[]{
                new WillBust(100),
                new UntilGoal(100, 500),
                new CountTimes(100, 5)
        };

        int numGoing = players.length;
        while (numGoing > 0) {
            for (int i = 0; i < players.length; i++) {
                if (players[i].keepGoing()) {
                    Craps game = new Craps();
                    while (!game.isGameOver()) {
                        game.rollAgain();
                    }
                    if (game.didIWin()) {
                        players[i].moneyWonLost(20);
                    } else {
                        players[i].moneyWonLost(-10);
                    }
                    if (!players[i].keepGoing()) {
                        numGoing -= 1;
                    }
                }
            }
        }

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + i + ": "+ players[i].totalMoney());
        }
    }
}
