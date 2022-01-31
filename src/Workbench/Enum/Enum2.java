package Workbench.Enum;

public class Enum2 {

    public enum KolorEnum {

        CZERWONY(false),
        ZIELONY(true),
        NIEBIESKI(true);

        boolean ladny;
        KolorEnum(boolean czyLadny) {
            ladny = czyLadny;
        }
    }
//----------
    public static String czyLadny(KolorEnum kolorEnum) {

        String czyLadny;
        if(kolorEnum.ladny == true) {
            czyLadny = ("ładny");
        } else {
            czyLadny = ("brzydki");
        }
        return ("Kolor " + kolorEnum + " jest " + czyLadny);
    }

//    public static String czyLadny(KolorEnum kolorEnum) {
//        return ("Kolor " + kolorEnum + " jest " + ( (kolorEnum.ladny) ? "ładny" : "brzydki" ) );
//    }
//----------
    public static void main(String[] args) {

        KolorEnum kolor = Enum2.KolorEnum.CZERWONY;
        System.out.println( czyLadny(kolor) );

        System.out.println( czyLadny(KolorEnum.ZIELONY) );
        System.out.println( czyLadny(KolorEnum.NIEBIESKI) );

        for(KolorEnum kolor2: KolorEnum.values()) {
            System.out.println(czyLadny(kolor2));
        }
    }
}