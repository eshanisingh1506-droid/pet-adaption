public class MessageServiceImpl implements MessageService {

    @Override
    public boolean sendMessage(int senderId, int receiverId, String message) {

        if (senderId <= 0) {
            throw new IllegalArgumentException("Invalid sender ID.");
        }

        if (receiverId <= 0) {
            throw new IllegalArgumentException("Invalid receiver ID.");
        }

        if (message == null || message.trim().isEmpty()) {
            throw new IllegalArgumentException("Message cannot be empty.");
        }

        // DAO call will be added during integration
        return true;
    }

    @Override
    public String getMessages(int userId) {

        if (userId <= 0) {
            throw new IllegalArgumentException("Invalid user ID.");
        }

        // DAO call will be added during integration
        return "";
    }
}