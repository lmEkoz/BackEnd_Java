package practicaComic;

public class Man extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(23000); //23
            System.out.println("Man: Ah! There you are!");
            System.out.println("Man: Have you had a chance to inspect the property and decide id it's what you were looking for? \n");
            Thread.sleep(2000); //25
            System.out.println("Man: Oh, so you don't like it? \n");
            Thread.sleep(2000); //27
            System.out.println("Man: You...? You really want to buy it? And the price I mentioned, it isn't too steep...? \n");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
