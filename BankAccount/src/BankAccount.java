public class BankAccount {
    String name = "";
    double balance =0;

    public BankAccount(){
        String name = "";
        double balance =0;
    }

    public BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double ammount){
        this.balance += ammount;
        System.out.println(ammount + " has been added. Remaining balance: " + this.getBalance());
    }

    public void withdraw(double ammount){
        this.balance -= ammount;
        System.out.println(ammount + " has been withdrawn. Remaining balance: " + this.getBalance());
    }

    public void transfer(BankAccount account, double ammount){
        this.balance -= ammount;
        account.balance += ammount;
        System.out.println(ammount + " has been added to " + account.getName() + "'s account. Remaining balance: " + this.getBalance());
    }
}
