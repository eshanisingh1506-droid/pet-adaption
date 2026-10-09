public class UserServiceImpl implements UserService {

    @Override
    public boolean updateUser(int userId, String name, String email) {

        if (userId <= 0) {
            throw new IllegalArgumentException("Invalid user ID.");
        }

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }

        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address.");
        }

        return true;
    }

    @Override
    public boolean deleteUser(int userId) {

        if (userId <= 0) {
            throw new IllegalArgumentException("Invalid user ID.");
        }

        return true;
    }

    @Override
    public boolean getUserById(int userId) {

        if (userId <= 0) {
            throw new IllegalArgumentException("Invalid user ID.");
        }

        return true;
    }
}