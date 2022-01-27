package Workbench;

public class Loops {
    public static void main(String[] args) {

        int[] tablica = new int[10];

        for (int i=0; i<10; i++) {
            tablica[i] = i + 1;
        }
// for-to-do
            for (int i=0; i < tablica.length; i++) {
                System.out.print( tablica[i] +" ");
            }
// for-each
            for (int i : tablica) {
                System.out.print(i +" ");
            }
// while-do
            int i=0;
            while (i < tablica.length) {
                System.out.print( tablica[i++] +" ");
            }
// do-while
            i=0; // int i=0;
            do {
                System.out.print( tablica[i++] +" ");
            } while (i < tablica.length);

    }
}