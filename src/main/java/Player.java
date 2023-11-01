public class Player {
    private int id; // номер игрока
    private String name; // имя игрока
    private int strength; // сила игрока

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }
}
