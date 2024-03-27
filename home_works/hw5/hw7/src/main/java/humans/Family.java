package humans;

import pets.Pet;
import pets.Species;

import java.time.Year;
import java.util.Arrays;

public class Family implements HumanCreator {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet[] pets;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[]{};
        this.pets = new Pet[]{};
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public void addChild(Human child) {
        if (this.father != null) {
            Human[] updatedChildrenList = Arrays.copyOf(this.children, this.children.length + 1);
            updatedChildrenList[updatedChildrenList.length - 1] = child;
            setChildren(updatedChildrenList);
            child.setFamily(this);
        }
    }

    public void deleteChild(int index) {
        if (this.getChildren().length != 0 && index < this.getChildren().length) {
            Human[] updatedChildrenList = new Human[this.children.length - 1];
            int k = 0;
            for (int i = 0; i < this.children.length; i++) {
                if (i != index) {
                    updatedChildrenList[k++] = this.children[i];
                }
            }
            this.setChildren(updatedChildrenList);
        }
    }

    public int countFamily() {
        int countByDefault = 2;
        if (this.children.length == 0) {
            return countByDefault;
        } else {
            return countByDefault + this.children.length;
        }
    }

    public String describePet(int index) {
        Pet pet = this.pets[index];
        String description;
        String trickiness;
        if (!(pet == null || pet.getSpecies() == Species.UNKNOWN)) {
            if (pet.getTrickLevel() <= 50) {
                trickiness = "майже не хитрий";
            } else trickiness = "дуже хитрий";
            description = String.format("У мене є %s, йому %s років, він %s\n", pet.getSpecies(), pet.getAge(), trickiness);
        } else description = "No pets";
        System.out.println(description);
        return description;
    }

    public void print() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        if (this.mother == null || this.father == null) {
            return String.format("Mother: %s, father: %s, children: %s", "Unknown", "Unknown", Arrays.toString(this.children));
        } else return String.format("Mother: %s, father: %s, children: %s", this.mother.toString(), this.father.toString(), Arrays.toString(this.children));
    }

    private int getSex() {
        double number = Math.random() * 1;
        long numberRounded = Math.round(number);
        return (int) numberRounded;
    }

    private String getRandomName(int sex) {
        int randomNameNumber = (int) Math.round(Math.random() * 4);
        String name;
        switch (sex) {
            case 0: name = String.valueOf(WomanName.values()[randomNameNumber]); break;
            case 1: name = String.valueOf(ManName.values()[randomNameNumber]); break;
            default: name = "Unknown";
        }
        return name;
    }

    @Override
    public Human bornChild() {
        Human child;
        int sex = getSex();
        String randomName = getRandomName(sex);
        String finalName = randomName.substring(0, 1) + randomName.substring(1).toLowerCase();
        switch (sex) {
            case 0: child = new Woman(finalName, this.getFather().getSurname(), Year.now().getValue(),
                    (this.getFather().getIq() + this.getMother().getIq())/2, new String[1][1]);
                    break;
            case 1: child = new Man(finalName, this.getFather().getSurname(), Year.now().getValue(),
                    (this.getFather().getIq() + this.getMother().getIq())/2, new String[1][1]);
                    break;
            default: child = new Woman();
        }
        this.addChild(child);
        return child;
    }
}
