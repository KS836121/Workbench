package Workbench;

public class Random {
    public static void main(String[] args) {

        System.out.println("Losowanie - proces - wyniki");
        int[] tablica = new int[( 100000 -1)]; // ilość losów = (od 0 do x) tj x+1

        int suma=0;
        for (int i=0; i< tablica.length; i++) {
            // zakres losu +0,5 bo 1/2 z (0-9) != (1-10)
            tablica[i] = (int) (Math.random() * 100 +1);
            suma = suma + tablica[i];

            System.out.print( tablica[i] +", ");
        }
        float srednia = ( (float)suma / (float)(tablica.length+1) );

        int freqLow = 2147483647; 	// wart max zm int
        int freqHig = 0; 			// wart min f.random

        for (int i : tablica) { // szukanie liczb skrajnej wart
            if (freqLow > i) { freqLow = i ;}
            if (freqHig < i) { freqHig = i ;}
        }

        System.out.print("\n\nilość losowych liczb: "+ (tablica.length +1)
                +"\t\tz faktycznego zakresu: " +freqLow + " - " +freqHig
                +"\t\tich suma = "+ suma +"\t\tśrednia = "+ srednia
        );
    }
}


/*
boolean - true/false
char 	- 16 bitów 	- od    0 do 65 535
byte 	-  8 bitów 	- od -128 do 127
short 	- 16 bitów 	- od        -32 768 do 32 767
int 	- 32 bity 	- od -2 147 483 648 do 2 147 483 647
long 	- 64 bity 	- od -2^63 do (2^63)-1 (posiadają przyrostek L, lub l)
float 	- 32 bity 	- max ok 6-7 cyfr po przecinku (przyrostek F, lub f)
double 	- 64 bity	- max ok 15 cyfr po przecinku (przyrostek D, lub d)
 */