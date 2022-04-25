package practicaHarry;

public class CreateMage {

    public static void main(String[] args) {
        defMAge();
    }

    public static void defMAge() {
        Mage mage0 = new Mage("Slytherin", "Male", "Severus Snape", "Lord Voldemort", "Doe");
        Mage mage1 = new Mage("Gryffindor", "Male", "Albus Dumbledore", "Sisters (Ariana) coprse", "Phoenix");
        Mage mage2 = new Mage("Gryffindor", "Male", "Remus John Lupin", "Full moon", "Wolf");
        Mage mage3 = new Mage("Gryffindor", "Famale", "Hermione Jean Granger", "Failure", "Otter");
        Mage mage4 = new Mage("Ravenclaw", "Female", "Cho Chang", "Lord Voldemort", "Swan");

        System.out.println(mage0.printState());
        System.out.println(mage1.printState());
        System.out.println(mage2.printState());
        System.out.println(mage3.printState());
        System.out.println(mage4.printState());

    }
}
