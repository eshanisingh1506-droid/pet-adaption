public interface PetService {

    boolean addPet(int shelterId, String name, String breed, int age);

    boolean updatePet(int petId, String name, String breed, int age);

    boolean deletePet(int petId);

    boolean approvePet(int petId);

    boolean rejectPet(int petId);
}