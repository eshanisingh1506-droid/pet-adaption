import java.util.ArrayList;
import java.util.List;

public class PetRegistry {

    private final List<String> pets = new ArrayList<>();

    public void addPet(String petName) {

        if (petName == null || petName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Pet name cannot be empty."
            );
        }

        pets.add(petName);
    }

    public List<String> getAllPets() {
        return new ArrayList<>(pets);
    }

    public boolean removePet(String petName) {
        return pets.remove(petName);
    }

    public int getPetCount() {
        return pets.size();
    }
}