package practicaMona;

public class Mona {
    public String name, creator;
    public int id;

    public Mona() {
        this.id = 1;
        this.name = "Original";
        this.creator = "@simonoxleee";
    }

    public Mona(int id, String name, String activity, String accessories, String creator, String reference) {
        this.id = id;
        this.name = name;
        this.creator = creator;
    }

    //Getters

    public int getId() {    return id;  }
    public String getName() {   return name;    }
    public String getCreator() {    return creator; }

    //Setters
    public boolean setId() {
        if (id > 0) {
            this.id = id;
            return true;
        } else {
            return false;
        }
    }

    public boolean setName() {
        if (!name.isEmpty()) {
            this.name = name;
            return true;
        } else {
            return false;
        }
    }

    public boolean setCreator() {
        if (!creator.isEmpty()) {
            this.creator = creator;
            return true;
        } else {
            return false;
        }
    }

    //Show
    public String printState() {
        return "Id: " + id + "\n" +
                "Name: " + name + "\n" +
                "Creator: " + creator;
    }
}

class Octocat extends Mona{
    public String activity, accessories, reference;

    public Octocat(int id, String name, String activity, String accessories, String creator, String reference) {
        this.id = id;
        this.name = name;
        this.activity = activity;
        this.accessories = accessories;
        this.creator = creator;
        this.reference = reference;
    }

    @Override
    public boolean setId() {
        return super.setId();
    }

    @Override
    public boolean setName() {
        return super.setName();
    }

    @Override
    public boolean setCreator() {
        return super.setCreator();
    }

    @Override
    public String printState() {
        return "\n" + super.printState() + "\n" +
                "Activity: " + activity + "\n" +
                "Accessories: " + accessories + "\n" +
                "Reference: " + reference + "\n";
    }


}

