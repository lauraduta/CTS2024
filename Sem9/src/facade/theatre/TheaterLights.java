package facade.theatre;

public class TheaterLights {
    public void dim(int intensity) {
        System.out.println("Set intensity to " + intensity);
    }

    public void on() {
        System.out.println("Theater lights on");
    }
}
