class Pay{
    void pay(int amount){
        System.out.println("pay the amount:"+amount);
    }
}
class upi extends Pay{
    void pay(int amount){
        System.out.println("pay the amount via upi:"+amount);
    }
}
class Card extends Pay{
    void pay(int amount){
        System.out.println("pay the amount via Card:"+amount);
    }
}
class RuntimePolymorphism{
    static void main(String args[]) {
        Pay me=new upi();
        me.pay(2000);
        Pay her=new Card();
        her.pay(3000)


    }

}
