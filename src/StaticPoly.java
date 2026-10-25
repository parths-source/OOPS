class Calculator{
    int add(int a ,int b){
        System.out.println(a+b);
    }
    double add(double a ,double b){
        System.out.println(a+b);
    }
}
class StaticPoly{
    public static void main(String args[]) {
        Calculator cal=new Calculator();
        cal.add(2,3);
        cal.add(2.7,3.6);

    }
}