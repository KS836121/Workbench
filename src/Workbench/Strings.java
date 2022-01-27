package Workbench;

public class Strings {
    public static void main(String[] args) {

        String s = "Ala ma kota";

        System.out.println("Czy string zaczyna się od 'Ala'? "  + s.startsWith("Ala"));
        System.out.println("Czy string zaczyna się od 'ala'? "  + s.startsWith("ala"));
        System.out.println("Czy string kończy  się na 'kota'? " + s.endsWith("kota"));
        System.out.println("Czy string zawiera słowo 'ma'?  "   + s.contains("ma"));
        System.out.println("Czy string zawiera słowo 'kot'? "   + s.contains("kot"));
        System.out.println("Czy string zawiera słowo 'ala'? "   + s.contains("ala"));
        System.out.println("Czy string zawiera słowo 'ala'? "   + s.toLowerCase().contains("ala"));

        String                                   myString = ("An apple a day, keeps the doctor away!");
        System.out.println("Original string: " + myString );
        System.out.println(" - replacing 01: " + myString.replace('a', 'A') );
        System.out.println(" - replacing 02: " + myString.replace("apple", "orange") );
        System.out.println(" - replacing 03: " + myString.replaceAll("[\s]", "") );
    }

}
