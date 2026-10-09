public class PetServiceImpl extends PetOperations implements PetService {

    @Override
    public boolean addPet(int shelterId, String name, String breed, int age) {

        if (shelterId <= 0) {
            throw new IllegalArgumentException("Invalid shelter ID.");
        }

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Pet name cannot be empty.");
        }

        if (breed == null || breed.trim().isEmpty()) {
            throw new IllegalArgumentException("Pet breed cannot be empty.");
        }

        if (age < 0) {
            throw new IllegalArgumentException("Pet age cannot be negative.");
        }

        return true;
    }

    @Override
    public boolean updatePet(int petId, String name, String breed, int age) {

        if (petId <= 0) {
            throw new IllegalArgumentException("Invalid pet ID.");
        }

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Pet name cannot be empty.");
        }

        if (breed == null || breed.trim().isEmpty()) {
            throw new IllegalArgumentException("Pet breed cannot be empty.");
        }

        if (age < 0) {
            throw new IllegalArgumentException("Pet age cannot be negative.");
        }

        return true;
    }

    @Override
    public boolean deletePet(int petId) {

        if (petId <= 0) {
            throw new IllegalArgumentException("Invalid pet ID.");
        }

        return true;
    }

    @Override
    public boolean approvePet(int petId) {

        if (petId <= 0) {
            throw new IllegalArgumentException("Invalid pet ID.");
        }

        return true;
    }

    @Override
    public boolean rejectPet(int petId) {

        if (petId <= 0) {
            throw new IllegalArgumentException("Invalid pet ID.");
        }

        return true;
    }

    @Override
    public void performOperation() {
        System.out.println("Performing pet adoption operation.");
    }
}