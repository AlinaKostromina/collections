public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String playerName) {
        super("Игрок по имени" + playerName + "не найден!");
    }
}
