package designpatterns.adapter;

public class YesBankAdapter implements  BankAdapterInterface {


    private YesBankInterace yesBankInterace;

    public YesBankAdapter(YesBankInterace yesBankInterace) {
        this.yesBankInterace = yesBankInterace;
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {

        char status = yesBankInterace.doTransaction(fromUser.getUsername(),toUser.getUsername(),amount);
        if (status == 'Y') {
            return 1;
        } else if (status == 'N'){
            return 0;
        } else {
            return 2;
        }



    }

    @Override
    public double checkBalance(User user) {
        long balance = yesBankInterace.getBalance(user.getUsername(), user.getPassword());
        return (double) balance;
    }
}
