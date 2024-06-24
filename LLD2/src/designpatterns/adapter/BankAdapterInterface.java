package designpatterns.adapter;

public interface BankAdapterInterface {

    double checkBalance(User user);
    int doTransaction(User fromUser, User toUser, double amount);

}
