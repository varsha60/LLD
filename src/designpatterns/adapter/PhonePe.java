package designpatterns.adapter;

public class PhonePe {

    private BankAdapterInterface bankAdapterInterface;

    public PhonePe(BankAdapterInterface bankAdapterInterface) {
        this.bankAdapterInterface = bankAdapterInterface;
    }


    //check balance
    public void checkBalance(User user) {
        double balance = bankAdapterInterface.checkBalance(user);
        System.out.println("Balance is: "+balance);
    }

    //do transaction
    public void transaction(User fromUser, User toUser, double amount) {
        if (bankAdapterInterface.checkBalance(fromUser) < amount) {
            System.out.println("Insufficient Balance");
        } else {
            int status = bankAdapterInterface.doTransaction(fromUser,toUser,amount);

            switch(status) {
                case 1:
                    System.out.println("Success");
                    break;
                case 0:
                    System.out.println("Failed");
                    break;
                default:
                    System.out.println("In progress");
                    break;
            }
        }

    }
}
