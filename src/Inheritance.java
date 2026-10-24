class BankAccount {
    protected double balance;
    public BankAccount(double balance){
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
}
class SavingAcc extends BankAccount{
    public SavingAcc(double balance){
        super(balance);
    }
    public void addInterest(double interest){
        balance+=balance*(interest/100);
    }
    public void display(){
        System.out.println(balance);
    }

}

public class Inheritance {
    public static void main(String[] args) {
        SavingAcc me=new SavingAcc(10000);
        me.display();
        me.deposit(2000);
        me.display();
        me.addInterest(5);
        me.display();


    }
}
