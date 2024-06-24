package designpatterns.adapter;

public interface YesBankInterace {

    long getBalance(String username, String password);
    char doTransaction (String fromUser, String toUser, double amount);
}
