package Workbench.Calc;

class Oper2 {
    int z;

    Oper2() {};
    Oper2(int x, String mark, int y) {

        switch (mark) {
            case "+" -> System.out.println( x+y );
            case "-" -> System.out.println( x-y );
            case "*" -> System.out.println( x*y );
            case "/" -> z = ( x/y );
        }
    }
}

public class Calc2 {
    public static void main(String[] args) {

        new Oper2(4, "+", 2);
        new Oper2(4, "-", 2);
        new Oper2(4, "*", 2);
        //new Oper2(4, "/", 2);

        Oper2 oper2 = new Oper2(10, "/", 2);
        System.out.println( oper2.z );
    }
}

/*
Error! Sop wyświetla referencje do CalcB a nie int z return.

        System.out.println( new CalcB(4, "+", 2) );
        System.out.println( new CalcB(4, "-", 2) );
        System.out.println( new CalcB(4, "*", 2) );
        System.out.println( new CalcB(4, "/", 2) );
 */