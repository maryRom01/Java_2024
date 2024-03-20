public class HappyFamily {
    public static void main(String[] args) {
        Pet pet = new Pet("dog", "Ted", 2, 50, new String[]{"sleep", "eat", "play"});
        String[][] schedule = new String[][]{{"Monday"}, {"visit friends"}};
        Human human = new Human("Alice", "Bronx", 1998, 90, pet, null, null, schedule);
        pet.print();
        human.print();
        human.describePet();
        human.greetPet();
    }
}