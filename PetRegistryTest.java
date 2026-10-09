public class PetRegistryTest {

    public static void main(String[] args) {

        PetRegistry registry = new PetRegistry();

        // Add pets
        registry.addPet("Bruno");
        registry.addPet("Max");
        registry.addPet("Luna");

        // Display all pets
        System.out.println("Available pets: " + registry.getAllPets());

        // Display total pets
        System.out.println("Total pets: " + registry.getPetCount());

        // Remove a pet
        registry.removePet("Max");

        // Display updated list
        System.out.println("After removal: " + registry.getAllPets());

        System.out.println("Total pets now: " + registry.getPetCount());
    }
}