package practicaMultiverse;

public class SpiderNoir extends Spiderman implements Abilities{

    String specialAbility;
    public SpiderNoir(String name, String universe, String gender, String specialAbility){
        super(name, universe, gender);
        this.specialAbility = specialAbility;
    }

    public void getSpiderMan(){
        System.out.println(getSpiderInfo() + "Special: " + this.specialAbility);
    }

    @Override
    public void spiderSense() {
        System.out.println(name + ": also posses a spider-sense which warns him of danger and allows him to predict enemy attacks and evade or counter them prior to the time of the attacks.");
    }

    @Override
    public void wallCrawling() {
        System.out.println(name + ": can also magnetically stick to walls.");

    }

    @Override
    public void webThrow() {
        System.out.println(name + ": can produce powerful organic webbing from his hands and he uses the webbing to both stun and capture his enemies.");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + ": Unlike the traditional Spider-Man," + name + " uses his acrobatic agility to maneuver about the rooftops.");
    }

    public void comboAbilities() {
        spiderSense();
        wallCrawling();
        webThrow();
        specialAbility();
    }
}
