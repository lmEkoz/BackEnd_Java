package practicaMona;

public class CreateMona {
    public static void main(String[] args) {
        defOctoCat();
    }

    public static void defOctoCat() {
        Mona mona0 = new Mona();
        Mona mona1 = new Octocat(15, "Octonaut", "Astonaut", "Astronaut suit", "@cameronmcefee", "Astronaut");
        Mona mona2 = new Octocat(59, "Linktonaut", "Hero of Hyrule", "Sword, shield, Link suit", "@cameronmcefee", "The Legend of Zelda");
        Mona mona3 = new Octocat(99, "Daftpunktocat-Guy", "DJ", "Golden helmet, black suit", "@jeejkang", "DaftPunk");
        Mona mona4 = new Octocat(128, "Dinoctocat", "Dinosaur", "Dinosaur suit, toy car", "@kimestoesta, @heyhayhay", "Dinosaur");
        Mona mona5 = new Octocat(136,"Scubatocat", "Scubadiving", "Scuba suit, fish, oxigen tank", "@cameronfoxly", "Scubadiver");
        Mona mona6 = new Octocat(138, "Surftocat", "Surfing", "Surfboard, waves", "@jeejkang", "Surfer");
        Mona mona7 = new Octocat(139, "Boxertocat", "Boxing", "Head band, boxing gloves", "@rubyjazzy", "Boxer");

        System.out.println(mona0.printState());
        System.out.println(mona1.printState());
        System.out.println(mona2.printState());
        System.out.println(mona3.printState());
        System.out.println(mona4.printState());
        System.out.println(mona5.printState());
        System.out.println(mona6.printState());
        System.out.println(mona7.printState());
    }

}


