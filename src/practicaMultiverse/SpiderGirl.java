package practicaMultiverse;

public class SpiderGirl extends Spiderman implements Abilities{

    String specialAbility;
    public SpiderGirl(String name, String universe, String gender, String specialAbility){
        super(name, universe,gender);
        this.specialAbility =  specialAbility;
    }

    public void getSpiderMan(){
        System.out.println(getSpiderInfo() + "Special: " + this.specialAbility);
    }

    @Override
    public void spiderSense() {
        System.out.println(name + ": has no Spider-Sense");
    }

    @Override
    public void wallCrawling() {
        System.out.println(name + ": has the ability to cling to walls at will.");
    }

    @Override
    public void webThrow() {
        System.out.println(name + ": has the ability to organically produce her own silk webbing from glands within her forearms, limited by her body's health and nutrition");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + ": A skilled gymnast Anya has developed her body's muscles and bones to an extraordinary point allowing her to compress/contort into small cavities, similarly against high impacts to soften the blows.");
    }

    public void comboAbilities() {
        spiderSense();
        wallCrawling();
        webThrow();
        specialAbility();
    }
}
