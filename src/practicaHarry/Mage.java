package practicaHarry;

public class Mage {
    public String house, gender, name, boggart, patronus;

    public Mage() {

    }

    public Mage(String house, String gender, String name, String boggart, String patronus) {
        this.house =  house;
        this.gender = gender;
        this.name = name;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    //Getters
    public String getHouse() {  return house;   }
    public String getGender() { return gender;  }
    public String getName() {   return name;    }
    public String getBoggart() {    return boggart; }
    public String getPatronus() {   return patronus;    }

    //Setters
    public boolean setHouse(String house) {
        if (!house.isEmpty()) {
            this.house = house;
            return true;
        } else {
            return false;
        }

    }

    public boolean setGender(String gender) {
        if (!gender.isEmpty()) {
            this.gender = gender;
            return true;
        } else {
            return false;
        }
    }

    public boolean setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
            return true;
        } else {
            return false;
        }
    }

    public boolean setBoggart(String boggart) {
        if (!boggart.isEmpty()) {
            this.boggart = boggart;
            return true;
        } else {
            return false;
        }
    }

    public boolean setPatronus(String patronus) {
        if (!patronus.isEmpty()) {
            this.patronus = patronus;
            return true;
        } else {
            return false;
        }
    }

    //Show
    public String printState() {
        return "Name: " + name + "\n" +
                "Gender: " + gender + "\n" +
                "House: " + house + "\n" +
                "Boggart: " + boggart + "\n" +
                "Patronus: " + patronus + "\n";
    }
}


