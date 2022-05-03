package practicaComic;

public class TheKillingJoke {
    public static void main(String[] args) {
        Scenery Scenery = new Scenery();
        Batman Batman = new Batman();
        Joker Joker = new Joker();
        Gordon Gordon = new Gordon();
        Man Man = new Man();
        Woman Woman = new Woman();

        Scenery.start();
        Batman.start();
        Joker.start();
        Gordon.start();
        Man.start();
        Woman.start();
    }
}
