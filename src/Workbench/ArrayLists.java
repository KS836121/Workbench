package Workbench;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args){

        List<String> lista = new ArrayList<String>();	//tworzymy tablic?

        lista.add("Asia"); 					//dodajemy elementy
        lista.add("Basia");
        lista.add("Krzysiek");
        lista.add(3, "Wojtek");

        System.out.print("Rozmiar listy (1) = " + lista.size() ); //sprawdzamy rozmiar listy
        System.out.println( lista ); 						  //wyśw zawartość całej listy

        lista.remove("Asia"); 		//usuwamy obiekt "Asia"
        System.out.println("Rozmiar listy (2) = " + lista.size() + lista );

        lista.remove(1); 			//usuwamy obiekt o indeksie 1 ("Krzysiek")
        System.out.println("Rozmiar listy (3) = " + lista.size() + lista );

        //przypiszmy pierwszy element listy, zmiennej imie i wyświetlmy go
        //musimy użyć rzutowania, inaczej przypisalibyśmy Object do String

        String imie = (String) lista.get(0);
        System.out.println("Pierwszy (0) element listy to: " + imie);

        if ( (lista.contains("Basia")) == true ) {
            System.out.println("Basia jest na liście");
        }

        lista.add("Celina, Dagmara, Elżbieta");

        System.out.println( lista.size() );
        System.out.println( lista );
        System.out.println( lista.get(2) );
        System.out.println( lista.contains("Basia") );
        System.out.println( lista.indexOf("Basia") );
        System.out.println( lista.isEmpty() );


    }
}
