public class SavingsAccount extends BankAccount{
    double interest = 0.0;

     public SavingsAccount(String name, double balance, double interest){
         super(name, balance);
         this.interest = interest;
    }

    public void addInterest(){
        this.balance += this.balance * this.interest;
    }

}
