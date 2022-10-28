public class NotFoundException extends RuntimeException{

    public NotFoundException(String name) {
        super("Игрок по имени" + name + "не найден");
    }
}
