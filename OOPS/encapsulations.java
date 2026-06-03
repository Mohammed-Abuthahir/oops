package OOPS;

class AccountBalance{

    private String accountHolder;
    private double balance;

    public AccountBalance(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        if(balance > 0){
            this.balance = balance;
        }
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(balance > 0){
            balance = balance + amount;
            System.out.println("SuccessFully Deposited  = " + balance);
        }
        else{
            System.out.println("Invalid Deposit Amount");
        }
    }
}
public class encapsulations {
    public static void main(String[] args) {
        AccountBalance account = new AccountBalance("Abuthahir", 100.0);
        System.out.println(account.getAccountHolder());
        System.out.println(account.getBalance());
        account.deposit(200.0);
    }


}

