package craps;

public class CountTimes implements Strategy {
    private double money;
    private int countdown;

    public CountTimes(double money, int numPlays) {
        this.money = money;
        this.countdown = numPlays;
    }


    @Override
    public boolean keepGoing() {
        return money >= 0 && countdown > 0;
    }

    @Override
    public void moneyWonLost(double amount) {
        countdown -= 1;
        money += amount;
    }

    @Override
    public double totalMoney() {
        return money;
    }
}
