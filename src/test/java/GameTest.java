import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void testWhenFirstPlayerIsMoreStrength() {

        Game game = new Game();
        Player player1 = new Player(1,"Петя",50);
        Player player2 = new Player(2,"Вася",30);
        game.register(player1);
        game.register(player2);

        int actual = game.round("Петя", "Вася");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}
