public class HappyFamily {
    public static void main(String[] args) {
        System.out.println("Pets: ");
        Pet petAllProperties = new Pet(Pets.DOG, "Ted", 2, 50, new String[]{"sleep", "eat", "play"});
        petAllProperties.print();

        Pet petEmptyConstructor = new Pet();
        petEmptyConstructor.print();

        Pet pet2Properties = new Pet(Pets.CAT, "March");
        pet2Properties.print();
        System.out.println();

        String[][] schedule = new String[2][2];
        schedule[0][0] = Schedule.MONDAY.toString();
        schedule[0][1] = "Work";
        schedule[1][0] = Schedule.TUESDAY.toString();
        schedule[1][1] = "Pizza party";

        //----------------------------------------------------------
        System.out.println("Barbara and Sam: ");
        Human Barbara = new Human();
        Barbara.print();

        Human Sam = new Human("Sam", "Brown", 1980);
        Sam.print();

        Family familyBarbaraSam = new Family(Barbara, Sam);
        familyBarbaraSam.print();

        System.out.println();

        //-----------------------------------------------------------
        System.out.println("Cathrine and Oscar: ");
        Human Cathrine = new Human("Cathrine", "Bronte", 1965, null, null);
        Cathrine.print();

        Human Oscar = new Human("Oscar", "Bronte", 1963, null, null);
        Oscar.print();

        Family familyCathrineOscar = new Family(Cathrine, Oscar);
        familyCathrineOscar.print();

        System.out.printf("This family has %s members\n", familyCathrineOscar.countFamily());

        System.out.println();

        //-----------------------------------------------------------
        System.out.println("Alice and Raimond: ");
        Human Alice = new Human("Alice", "Bronx", 1998, 90, null, Cathrine, Oscar, null);
        Alice.print();
        Alice.printSchedule();

        Human Raimond = new Human("Raimond", "Bronx", 1998, 90, petAllProperties, null, null, schedule);
        Raimond.print();
        Raimond.printSchedule();

        Family familyAliceRaimond = new Family(Alice, Raimond);
        familyAliceRaimond.print();

        System.out.println();
        System.out.println("Alice and Raimond - first child: ");
        Human child = new Human("Emma", "Bronx", 2022, 80, pet2Properties, Alice, Raimond, null);
        familyAliceRaimond.addChild(child);
        familyAliceRaimond.print();

        System.out.println("Alice and Raimond - second child: ");
        Human child2 = new Human("David", "Bronx", 2023, 80, null, Alice, Raimond, schedule);
        familyAliceRaimond.addChild(child2);
        familyAliceRaimond.print();

        System.out.println();
        System.out.println("Links to the family: ");
        System.out.printf("Name: %s, family: %s\n", Alice.getName(), Alice.getFamily());
        System.out.printf("Name: %s, family: %s\n", Raimond.getName(), Raimond.getFamily());
        System.out.printf("Name: %s, family: %s\n", child.getName(), child.getFamily());
        System.out.printf("Name: %s, family: %s\n", child2.getName(), child2.getFamily());

        System.out.printf("This family has %s members\n", familyAliceRaimond.countFamily());

        System.out.println();
        System.out.println("All  methods for child:");
        System.out.println(child.getName());
        System.out.println(child.getSurname());
        System.out.println(child.getMother());
        System.out.println(child.getFather());
        System.out.println(child.getIq());
        System.out.println(child.getYear());
        child.printSchedule();
        System.out.println(child.getPet());
        System.out.println(child);

        //----------------------------------------------------------
        System.out.println();
        System.out.println("Delete child ");
        System.out.printf("This family has %s members\n", familyAliceRaimond.countFamily());
        familyAliceRaimond.print();
        System.out.println("Remove child with index 0");
        familyAliceRaimond.deleteChild(0);
        System.out.printf("This family has %s members\n", familyAliceRaimond.countFamily());
        familyAliceRaimond.print();

        System.out.println();

        //----------------------------------------------------------
        System.out.println("Compare pets: ");
        Pet cat1 = new Pet(Pets.CAT, "Danny", 3, 50, new String[]{"sleep", "play"});
        Pet cat2 = new Pet(Pets.CAT, "Rex", 7, 90, new String[]{"sleep", "eat"});
        Pet dog = new Pet(Pets.DOG, "Lilu", 1, 95, new String[]{"walk", "play"});
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(dog));
    }
}