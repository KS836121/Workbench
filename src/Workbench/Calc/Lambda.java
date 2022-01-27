package Workbench.Calc;

interface Operation { // interfejs funkcyjny
    int operation(int x, int y);
}

public class Lambda {
    public static void main(String[] args) {

        Operation  add      = (int x, int y) -> x+y; // deklaracja zm.ref. typu interf.funkc.
        Operation  subtract = (int x, int y) -> x-y;
        Operation  multiply = (int x, int y) -> x*y;
        Operation  division = (int x, int y) -> x/y;

        System.out.println( add     .operation(4,2) );
        System.out.println( subtract.operation(4,2) );
        System.out.println( multiply.operation(4,2) );
        System.out.println( division.operation(4,2) );
    }
}

/*
class Add implements Operation {
    int operation(int x int y) {
    return (x+y)
    }
}
    Operation add = new Addition();

    System.out.println( add.operation(4, 2) );
 */