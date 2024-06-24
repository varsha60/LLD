package designpatterns.adapter;

public class AdapterMain {

    public static void main(String[] args) {

        Yesbank yesbank = new Yesbank();
        YesBankAdapter yesBankAdapter = new YesBankAdapter(yesbank);
        PhonePe phonePe = new PhonePe(yesBankAdapter);
        phonePe.checkBalance(new User("varsha60","1234#"));
        phonePe.transaction(new User("varsha60","1223#"),new User("ketan60","1234#"),2000);
    }
}
