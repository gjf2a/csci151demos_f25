package craps;

public interface Strategy {
    boolean keepGoing();
    void moneyWonLost(double amount);
    double totalMoney();
}
