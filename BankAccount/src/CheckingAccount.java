public class CheckingAccount extends BankAccount {
    public int transactionCount = 0;
    static final int TRANSACTION_FEE = 3;

    public CheckingAccount(String name, double balance){
        super(name, balance);
    }


    @Override public void deposit(double ammount){
        this.transactionCount++;
        this.balance += ammount;
        System.out.println(ammount + " has been added. Remaining balance: " + this.getBalance());

    }

    @Override public void withdraw(double ammount){
        this.transactionCount++;
        this.balance -= ammount;
        System.out.println(ammount + " has been withdrawn. Remaining balance: " + this.getBalance());
    }

    public void deductFees(){
        this.balance -= this.TRANSACTION_FEE * this.transactionCount;
        this.transactionCount = 0;
    }
}
