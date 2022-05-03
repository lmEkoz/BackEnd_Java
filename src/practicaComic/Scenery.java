package practicaComic;

public class Scenery extends Thread{
    @Override
    public void run() {
        try {
            long starting = System.currentTimeMillis();
            System.out.println("**It's raining**");
            System.out.println("**Batman arrives to Arkham**");
            System.out.println("**He rushes through the cells looking for the Joker**");
            System.out.println("THERE WHERE THESE TWO GUYS IN A LUNATIC ASYLUM \n");
            Thread.sleep(15000); //15
            System.out.println("BATMAN GRABS THE JOKER FROM HIS SHIRT \n");
            Thread.sleep(7000); //22
            System.out.println("*Where is he?*");
            System.out.println("**In an abandoned carnival** \n");
            Thread.sleep(9000); //31
            System.out.println("**At Jokers house** \n");

            long ending = System.currentTimeMillis();
            double getTime = (double) ((ending - starting)/1000);
            System.out.println(getTime +"s seconds");
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
