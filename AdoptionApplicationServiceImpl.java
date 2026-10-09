public class AdoptionApplicationServiceImpl
        implements AdoptionApplicationService {

    @Override
    public boolean submitApplication(int adopterId, int petId) {

        if (adopterId <= 0) {
            throw new IllegalArgumentException("Invalid adopter ID.");
        }

        if (petId <= 0) {
            throw new IllegalArgumentException("Invalid pet ID.");
        }

        // DAO call will be added during integration
        return true;
    }

    @Override
    public boolean updateApplicationStatus(
            int applicationId, String status) {

        if (applicationId <= 0) {
            throw new IllegalArgumentException("Invalid application ID.");
        }

        if (status == null || status.trim().isEmpty()) {
            throw new IllegalArgumentException("Status cannot be empty.");
        }

        // DAO call will be added during integration
        return true;
    }

    @Override
    public String getApplicationStatus(int applicationId) {

        if (applicationId <= 0) {
            throw new IllegalArgumentException("Invalid application ID.");
        }

        // DAO call will be added during integration
        return "";
    }
}