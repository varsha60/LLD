package designpatterns.adapter;

public class Yesbank implements  YesBankInterace {

    @Override
    public long getBalance(String username, String password) {
        return 1000;
    }

    @Override
    public char doTransaction(String fromUser, String toUser, double amount) {
        return 'Y';
    }
}
