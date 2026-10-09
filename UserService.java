public interface UserService {

    boolean updateUser(int userId, String name, String email);

    boolean deleteUser(int userId);

    boolean getUserById(int userId);
}