package practicaComic;

public class Batman extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(2000); //2
            System.out.println("Batman: Hello.");
            System.out.println("Batman: I came to talk. \n");
            Thread.sleep(2000); //4
            System.out.println("Batman: I've been thinking lately, about you and me.");
            System.out.println("Batman: About what's going to happen to us, in the end.");
            System.out.println("Batman: We're going to kill each other, aren't we?");
            System.out.println("Batman: Perhaps you'll kill me. Perhaps I'll kill you. Perhaps sooner perhaps later. \n");
            Thread.sleep(5000); //9
            System.out.println("Batman: I Just wanted to know that I'd made a genuine attempt yo talk things over and advert that outcome.");
            System.out.println("Batman: Just once. \n");
            Thread.sleep(2000); //11
            System.out.println("Batman: Are you listening to me? It's Life and death that I'm discussing here.");
            System.out.println("Batman: Maybe my death... \n");
            Thread.sleep(2000); //13
            System.out.println("Batman: ... Maybe yours.");
            System.out.println("Batman: I don't fully understand why ours should be such fatal relationship, but I don't want your murder on my...");
            System.out.println("Batman: ... Hands... \n");
            Thread.sleep(3000); //16
            System.out.println("Batman: Wherrrrre is he?");
            System.out.println("Batman: Aaaaaaaa! Oh God, no...");
            System.out.println("Batman: Do you realize what you've set free? where is he? \n");
            Thread.sleep(5000); //21
            System.out.println("Batman: Commissioner, if you're concerned about it, it's yours. Take care of it.");
            System.out.println("Batman: Now, you whimpering little smear of slime, I'm going to ask you politely just one more time... \n");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
