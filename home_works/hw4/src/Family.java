import java.util.Arrays;

public class Family {
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
        Human[] updatedChildrenList = Arrays.copyOf(this.children, this.children.length + 1);
        updatedChildrenList[updatedChildrenList.length - 1] = child;
        setChildren(updatedChildrenList);
        child.setFamily(child.getFather().getFamily());
    }

    public void deleteChild(int index) {
        Human[] updatedChildrenList = new Human[this.children.length - 1];
        int k = 0;
        for (int i = 0; i < this.children.length; i++) {
            if (i != index) {
                updatedChildrenList[k++] = this.children[i];
            }
        }
        this.setChildren(updatedChildrenList);
    }

    public int countFamily() {
        int countByDefault = 2;
        if (this.children.length == 0) {
            return countByDefault;
        } else {
            return countByDefault + this.children.length;
        }
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
}
