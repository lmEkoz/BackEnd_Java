package practicaMultiverse;

public class MilesMorales extends Spiderman implements Abilities {

    String specialAbility;
    public MilesMorales(String name, String universe, String gender, String specialAbility){
        super(name, universe, gender);
        this.specialAbility = specialAbility;
    }

    public void getSpiderMan(){
        System.out.println(getSpiderInfo() + "Special: " + this.specialAbility);
    }

    @Override
    public void spiderSense() {
        System.out.println(name + ": feels a buzzing sensation in his head as a sort of early warning system, allowing him to react accordingly.");
    }

    @Override
    public void wallCrawling() {
        System.out.println(name + ": can cling to any surface using just his fingertips and feet.");
    }

    @Override
    public void webThrow() {
        System.out.println(name + ": shoots electric web.");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + ": uses his natural electricity to shoot electric threads. \n");
    }

    public void comboAbilities() {
        spiderSense();
        wallCrawling();
        webThrow();
        specialAbility();
    }
}
