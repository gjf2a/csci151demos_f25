public class WillBust implements Strategy {
    private double money;

    public WillBust(double money) {
        this.money = money;
    }

    @Override
    public boolean keepGoing() {
        return money > 0;
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
