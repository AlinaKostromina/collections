import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class GameTest {

    @Test
    public void scoreWhenFirstPlayerWins() {
        Player Olga = new Player(3, "Olga", 50);
        Player Mina = new Player(5, "Mina", 10);
        Game game = new Game();

        game.register(Olga);
        game.register(Mina);

        int expected = 1;
        int actual = game.round("Olga", "Mina");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scoreWhenSecondPlayerWins() {
        Player Olga = new Player(3, "Olga", 10);
        Player Mina = new Player(5, "Mina", 50);
        Game game = new Game();

        game.register(Olga);
        game.register(Mina);

        int expected = 2;
        int actual = game.round("Olga", "Mina");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scoreWhenDraw() {
        Player Olga = new Player(3, "Olga", 10);
        Player Mina = new Player(5, "Mina", 10);
        Game game = new Game();

        game.register(Olga);
        game.register(Mina);

        int expected = 0;
        int actual = game.round("Olga", "Mina");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenFirstPlayerIsNotRegistered() {
        Player Olga = new Player(3, "Olga", 10);
        Player Mina = new Player(5, "Mina", 10);
        Game game = new Game();

        game.register(Olga);
        game.register(Mina);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Nika", "Mina")
        );
    }

    @Test
    public void testWhenSecondPlayerIsNotRegistered() {
        Player Olga = new Player(3, "Olga", 10);
        Player Mina = new Player(5, "Mina", 10);
        Game game = new Game();

        game.register(Olga);
        game.register(Mina);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Olga", "Sveta")
        );
    }
}
