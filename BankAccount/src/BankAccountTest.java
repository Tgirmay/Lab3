public class BankAccountTest {
    public static void main(String[] args){
        SavingsAccount josh = new SavingsAccount("Josh",0,.01 );
        CheckingAccount drake = new CheckingAccount("Drake", 500);
        drake.withdraw(100);
        josh.deposit(1000);
        josh.transfer(drake,200);
        josh.addInterest();
        drake.deductFees();
        System.out.println("Josh has " + josh.getBalance() + " dollars left.");
        System.out.println("Drake has " + drake.getBalance() + " dollars left.");
    }
}
