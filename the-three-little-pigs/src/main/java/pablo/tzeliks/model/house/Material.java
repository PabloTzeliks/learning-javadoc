package pablo.tzeliks.model.house;

public enum Material {

    STRAW("Straw", 200),
    WOOD("Wood", 450),
    BRICK("Brick", 1000);

    private final String name;
    private final int strength;

    Material(String name, int strength) {
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
