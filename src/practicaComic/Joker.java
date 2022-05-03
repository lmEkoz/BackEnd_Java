package practicaComic;

public class Joker extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(16000); //16
            System.out.println("Joker: H-Hey...");
            System.out.println("Joker: Hey! Wait a minute! Don't you touch me! I got rights.");
            System.out.println("Joker: You're not allowed to...");
            System.out.println("Joker: ... Touch me...\n");
            Thread.sleep(2000); //18
            System.out.println("Joker: Eeeeeeeegh. Get him offa me! \n");
            Thread.sleep(6000); //24
            System.out.println("Joker: Well, it's gerish, ugly and derelicts have used it for a toilet.");
            System.out.println("Joker: The rides are dilapidated to the point of being lethal, and could easily mam or kill innocent little children. \n");
            Thread.sleep(2000); //26
            System.out.println("Joker: Don't like it?");
            System.out.println("Joker: I'm crazy for it. \n");
            Thread.sleep(2000); //28
            System.out.println("Joker: Too steep? My dear sir, as I look at it I'm making a killing...");
            System.out.println("Joker: ...And anyway, money isn't really a problem.");
            System.out.println("Joker: Not these these days. \n");
            Thread.sleep(4000); //32
            System.out.println("Joker: Well, they, uh... They said they might call me.");
            System.out.println("Joker: I dunno. I, I got nervous and messed up a punchline. \n");
            Thread.sleep(2000); //34
            System.out.println("Joker: What do you mean, \"Oh\"\n");
            Thread.sleep(1000);
            System.out.println("Joker: Yes you did. The way your said it: \"Oh\". Like that\n");
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
