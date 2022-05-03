package practicaComic;

public class Gordon extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(19000); //19
            System.out.println("Gordon: Dear God, he's gone berserk. Open that door, man!");
            System.out.println("Gordon: Okay, that's enough!");
            System.out.println("Gordon: You know the laws regarding mistreatment of inmates as wall as I do.");
            System.out.println("Gordon: If you harm one hair on his head... \n");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
