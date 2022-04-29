package practicaMultiverse;

public class Main {
    public static void main(String[] args) {

        SpiderNoir spiderNoir = new SpiderNoir("Peter Parker",  "Earth-90214", "Male", "Experienced Detective");
        spiderNoir.getSpiderMan();
        spiderNoir.comboAbilities();

        MilesMorales milesMorales = new MilesMorales("Miles gonzalo Morales","Earth-616","Male", "Electricity");
        milesMorales.getSpiderMan();
        milesMorales.comboAbilities();

        SpiderGirl spiderGirl = new SpiderGirl("Anya Corazon", "Earth-616", "Female", "Skeletal Flexibility");
        spiderGirl.getSpiderMan();
        spiderGirl.comboAbilities();

    }
}
