public class LoginServiceImpl implements LoginService {

    @Override
    public boolean login(String email, String password) throws Exception {

        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }

        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty.");
        }

        // DAO call will be added during integration
        return true;
    }

    @Override
    public String getUserRole(String email) throws Exception {

        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }

        // DAO call will be added during integration
        return "USER";
    }
}