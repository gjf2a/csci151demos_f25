package craps;

public class UntilGoal implements Strategy {
    private double money;
    private double goal;

    public UntilGoal(double money, double goal) {
        this.money = money;
        this.goal = goal;
    }


    @Override
    public boolean keepGoing() {
        return money > 0 && money < goal;
    }

    @Override
    public void moneyWonLost(double amount) {
        money += amount;
    }

    @Override
    public double totalMoney() {
        return money;
    }
}
