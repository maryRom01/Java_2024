import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HappyFamilyTest {

    @Test
    public void addChildHappyPathAddChildTest() {
        Human woman = new Human("Diana", "Bronte", 1965, null, null);
        Human man = new Human("Dan", "Bronte", 1965, null, null);
        Family family = new Family(man, woman);
        Human child = new Human("Dina", "Bronte", 1995, woman, man);
        family.addChild(child);
        Human[] actualResult = family.getChildren();
        assertArrayEquals(new Human[] {child}, actualResult);
        assertEquals(1, actualResult.length);
    }

    @Test
    public void addChildHappyPathAddChild2Test() {
        Human woman = new Human("Diana", "Bronte", 1965, null, null);
        Human man = new Human("Dan", "Bronte", 1965, null, null);
        Family family = new Family(man, woman);
        Human child1 = new Human("Dina", "Bronte", 1995, woman, man);
        Human child2 = new Human("Dana", "Bronte", 1997, woman, man);
        family.addChild(child1);
        family.addChild(child2);
        Human[] actualResult = family.getChildren();
        assertArrayEquals(new Human[] {child1, child2}, actualResult);
        assertEquals(2, actualResult.length);
    }

    @Test
    public void addChildUnhappyPathAddChildWithoutParametersTest() {
        Human woman = new Human("Diana", "Bronte", 1965, null, null);
        Human man = new Human("Dan", "Bronte", 1965, null, null);
        Family family = new Family(man, woman);
        Human child = new Human();
        family.addChild(child);
        Human[] actualResult = family.getChildren();
        assertArrayEquals(new Human[] {}, actualResult);
        assertEquals(0, actualResult.length);
    }

    @Test
    public void addChildUnhappyPathAddChildWithoutParentsTest() {
        Human woman = new Human("Diana", "Bronte", 1965, null, null);
        Human man = new Human("Dan", "Bronte", 1965, null, null);
        Family family = new Family(man, woman);
        Human child = new Human("Dina", "Bronte", 1998);
        family.addChild(child);
        Human[] actualResult = family.getChildren();
        assertArrayEquals(new Human[] {}, actualResult);
        assertEquals(0, actualResult.length);
    }

    @Test
    public void deleteChildHappyPathTest() {
        Human woman = new Human("Diana", "Bronte", 1965, null, null);
        Human man = new Human("Dan", "Bronte", 1965, null, null);
        Family family = new Family(man, woman);
        Human child = new Human("Dina", "Bronte", 1998, woman, man);
        family.addChild(child);
        family.deleteChild(0);
        Human[] actualResult = family.getChildren();
        assertArrayEquals(new Human[] {}, actualResult);
        assertEquals(0, actualResult.length);
    }

    @Test
    public void deleteChildHappyPath2Test() {
        Human woman = new Human("Diana", "Bronte", 1965, null, null);
        Human man = new Human("Dan", "Bronte", 1965, null, null);
        Family family = new Family(man, woman);
        Human child1 = new Human("Dina", "Bronte", 1998, woman, man);
        Human child2 = new Human("Dana", "Bronte", 1998, woman, man);
        family.addChild(child1);
        family.addChild(child2);
        family.deleteChild(0);
        Human[] actualResult = family.getChildren();
        assertArrayEquals(new Human[] {child2}, actualResult);
        assertEquals(1, actualResult.length);
    }

    @Test
    public void deleteChildUnhappyPathEmptyArrayTest() {
        Human woman = new Human("Diana", "Bronte", 1965, null, null);
        Human man = new Human("Dan", "Bronte", 1965, null, null);
        Family family = new Family(man, woman);
        family.deleteChild(0);
        Human[] actualResult = family.getChildren();
        assertArrayEquals(new Human[] {}, actualResult);
        assertEquals(0, actualResult.length);
    }

    @Test
    public void deleteChildUnhappyPathIndexMoreThanArrayLengthTest() {
        Human woman = new Human("Diana", "Bronte", 1965, null, null);
        Human man = new Human("Dan", "Bronte", 1965, null, null);
        Family family = new Family(man, woman);
        Human child = new Human("Dina", "Bronte", 1998, woman, man);
        family.addChild(child);
        family.deleteChild(2);
        Human[] actualResult = family.getChildren();
        assertArrayEquals(new Human[] {child}, actualResult);
        assertEquals(1, actualResult.length);
    }

    @Test
    public void countFamilyHappyPathTest() {
        Human woman = new Human("Diana", "Bronte", 1965, null, null);
        Human man = new Human("Dan", "Bronte", 1965, null, null);
        Family family = new Family(man, woman);
        int actualResult = family.countFamily();
        assertEquals(2, actualResult);
    }

    @Test
    public void describePetHappyPathTrickLevel50Test() {
        Pet petAllProperties = new Pet(Pets.DOG, "Ted", 2, 50, new String[]{"sleep", "eat", "play"});
        Human Raimond = new Human("Raimond", "Bronx", 1998, 90, petAllProperties, null, null, null);
        String actualResult = Raimond.describePet();
        String expectedResult = String.format("У мене є %s, йому %s років, він майже не хитрий\n", Pets.DOG, petAllProperties.getAge());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void describePetHappyPathTrickLevel90Test() {
        Pet petAllProperties = new Pet(Pets.DOG, "Ted", 2, 90, new String[]{"sleep", "eat", "play"});
        Human Raimond = new Human("Raimond", "Bronx", 1998, 90, petAllProperties, null, null, null);
        String actualResult = Raimond.describePet();
        String expectedResult = String.format("У мене є %s, йому %s років, він дуже хитрий\n", Pets.DOG, petAllProperties.getAge());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void describePetUnhappyPathTest() {
        Pet noProperties = new Pet();
        Human Raimond = new Human("Raimond", "Bronx", 1998, 90, noProperties, null, null, null);
        String actualResult = Raimond.describePet();
        String expectedResult = "No pets";
        assertEquals(expectedResult, actualResult);
    }
}
