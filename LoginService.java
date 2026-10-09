public interface LoginService {

    boolean login(String email, String password) throws Exception;

    String getUserRole(String email) throws Exception;
}