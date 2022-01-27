package Workbench.Calc;

class Oper1 {
    int add     (int x, int y) { return (x+y); }
    int subtract(int x, int y) { return (x-y); }
    int multiply(int x, int y) { return (x*y); }
    int division(int x, int y) { return (x/y); }
}

public class Calc1 {
    public static void main(String[] args) {

        Oper1 oper1 = new Oper1();

        System.out.println( oper1.add     (4,2) );
        System.out.println( oper1.subtract(4,2) );
        System.out.println( oper1.multiply(4,2) );
        System.out.println( oper1.division(4,2) );
    }
}
