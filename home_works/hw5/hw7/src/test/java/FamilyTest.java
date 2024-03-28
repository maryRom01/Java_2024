import humans.Family;
import humans.Human;
import humans.Man;
import humans.Woman;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyTest {

    @Test
    public void bornChildTest() {
        Human woman = new Woman("Maya", "Bronx", 1998);
        Human man = new Man("Mark", "Bronx", 1995);
        Family family = new Family(woman, man);
        Human child = family.bornChild();
        int children = family.getChildren().size();
        assertEquals("verify the length of children array", children, 1);
    }

    @Test
    public void bornChildTest2() {
        Human woman = new Woman("Maya", "Bronx", 1998);
        Human man = new Man("Mark", "Bronx", 1995);
        Family family = new Family(woman, man);
        family.bornChild();
        family.bornChild();
        int children = family.getChildren().size();
        assertEquals("verify the length of children array", children, 2);
    }

    @Test
    public void deleteChildTest() {
        Human woman = new Woman("Maya", "Bronx", 1998);
        Human man = new Man("Mark", "Bronx", 1995);
        Family family = new Family(woman, man);
        family.bornChild();
        family.bornChild();
        family.deleteChild(0);
        int children = family.getChildren().size();
        assertEquals("verify the length of children array", children, 1);
    }

    @Test
    public void deleteChildTest2() {
        Human woman = new Woman("Maya", "Bronx", 1998);
        Human man = new Man("Mark", "Bronx", 1995);
        Family family = new Family(woman, man);
        family.bornChild();
        family.deleteChild(0);
        int children = family.getChildren().size();
        assertEquals("verify the length of children array", children, 0);
    }

    @Test
    public void deleteChildTestUnhappyPath() {
        Human woman = new Woman("Maya", "Bronx", 1998);
        Human man = new Man("Mark", "Bronx", 1995);
        Family family = new Family(woman, man);
        family.deleteChild(0);
        int children = family.getChildren().size();
        assertEquals("verify the length of children array", children, 0);
    }

    @Test
    public void countFamilyTest() {
        Human woman = new Woman("Maya", "Bronx", 1998);
        Human man = new Man("Mark", "Bronx", 1995);
        Family family = new Family(woman, man);
        int count = family.countFamily();
        assertEquals("verify the count of family", count, 2);
    }

    @Test
    public void countFamilyTest2() {
        Human woman = new Woman("Maya", "Bronx", 1998);
        Human man = new Man("Mark", "Bronx", 1995);
        Family family = new Family(woman, man);
        family.bornChild();
        int count = family.countFamily();
        assertEquals("verify the count of family", count, 3);
    }

    @Test
    public void countFamilyTest3() {
        Human woman = new Woman("Maya", "Bronx", 1998);
        Human man = new Man("Mark", "Bronx", 1995);
        Family family = new Family(woman, man);
        family.bornChild();
        family.bornChild();
        family.deleteChild(0);
        int count = family.countFamily();
        assertEquals("verify the count of family", count, 3);
    }

    @Test
    public void countFamilyTest4() {
        Human woman = new Woman("Maya", "Bronx", 1998);
        Human man = new Man("Mark", "Bronx", 1995);
        Family family = new Family(woman, man);
        family.deleteChild(0);
        int count = family.countFamily();
        assertEquals("verify the count of family", count, 2);
    }
}
