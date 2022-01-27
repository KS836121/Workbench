package Workbench;

enum DayOfWeek {
    PONIEDZIAŁEK, WTOREK, SRODA, CZWARTEK, PIĄTEK, SOBOTA, NIEDZIELA
}

enum Weather {
    POCHMURNO, SŁONECZNIE, DESZCZOWO
}

enum Temp {
    ZIMNO, CIEPŁO
}


class DayWeather {

    private DayOfWeek day;
    private Weather weather;
    private Temp temp;

    public DayWeather(DayOfWeek d, Weather w, Temp t) {
        this.day = d;
        this.weather = w;
        this.temp = t;
    }

    public String toString() {
        return "...w " + day + " było " + weather + " oraz " + temp;
    }

    public Weather getWeather() { return weather; }
}


public class Enums {
    public static void main(String[] args) {
/// 1
        for (DayOfWeek d : DayOfWeek.values()) {
            System.out.print(d+ ", ");
        }
/// 2
        enum Szukaj { CIEPŁO, ZIMNO };

        Szukaj stan = Szukaj.CIEPŁO;

        switch(stan) {
            case ZIMNO  : System.out.println("\n Jest zimno"); break;
            case CIEPŁO : System.out.println("\n Jest ciepło"); break;
        }

/// 3
        DayWeather dw = new DayWeather(DayOfWeek.CZWARTEK, Weather.SŁONECZNIE, Temp.CIEPŁO);
        System.out.println(dw);

        // Elementy enumeracji są obiektami-singletonami, możemy używać operatora ==
/// 4
        if (dw.getWeather() == Weather.DESZCZOWO) {
            System.out.println(" Był deszcz");
        } else {
            System.out.println(" Nie padało");
        }
    }
}
