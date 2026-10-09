public interface MessageService {

    boolean sendMessage(int senderId, int receiverId, String message);

    String getMessages(int userId);
}