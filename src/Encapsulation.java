class BankAccount{
    private double balance;
    class BankAccount(double balance){
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void display(){
        System.out.println(balance);
    }
}
class Encapsulation{
    static void main() {
        BankAccount me=new BankAccount(20000);
        me.display();
        me.deposit(2000);
        me.display();

    }
}