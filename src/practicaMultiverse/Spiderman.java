package practicaMultiverse;

public class Spiderman {
    String name, universe, gender;

    Spiderman(String name, String universe, String gender){
        this.name = name;
        this.universe = universe;
        this.gender = gender;
    }

    public String getSpiderInfo(){
        return "Name: " + name + ", " + "Universe: " + universe + ", " + "Gender:" + gender + "\n";
    }
}
