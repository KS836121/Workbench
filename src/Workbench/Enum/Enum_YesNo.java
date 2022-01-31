package Workbench.Enum;


public class Enum_YesNo {

    public enum OdpowiedziEnum {
        TAK(true),
        NIE(false),
        T(true),
        N(false),
        YES(true),
        NO(false);

        private boolean wartosc;

        OdpowiedziEnum(boolean wartosc) {
            this.wartosc = wartosc;
        }

        public boolean getWartosc() {
            return wartosc;
        }
    }

//----------
    public static void main(String[] args) {

        Enum_YesNo test = new Enum_YesNo();

        test.simplePrint("==WEJSCIE==", "==WYJSCIE==");
        test.simplePrint("-----------", "-----------");
//
        String[] odpUseraTab = {"tak", "TAK", "nie", "NIE", "T", "N", "Yes", "No"};

        for (String odpUsera : odpUseraTab) {
            test.simplePrint(odpUsera, test.odpUseraString(odpUsera));
        }
    }
// wejście
    public void simplePrint(String one, String two) {
        System.out.printf("%15s  |  %10s\n", one, two);
    }
// wyjście poz/neg
    public String odpUseraString(String odpUsera) {
        return odpUseraBoolean(odpUsera) ? "pozytywna" : "negatywna";
    }
// wyjście 0/1
    public boolean odpUseraBoolean(String odpUsera) {
        for (OdpowiedziEnum odp : OdpowiedziEnum.values()) {
            if (odp.toString().equalsIgnoreCase(odpUsera)) {
                return true;
            } else {
                return false;
            }
        } return false; // możliwość udzielenia błędnie negatywnej odpowiedzi
    }
}