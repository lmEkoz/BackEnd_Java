package practicaComic;

public class Woman extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(30000); //30
            System.out.println("Woman: Well?");
            System.out.println("Woman: How did it go? Did they like your act. \n");
            Thread.sleep(3000); //33
            System.out.println("Woman: Oh.");
            Thread.sleep(2000); //35
            System.out.println("Woman: I... I didn't mean anything...");
            Thread.sleep(2000); //37
            System.out.println("Woman: Jesus, all I said was...\n");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
