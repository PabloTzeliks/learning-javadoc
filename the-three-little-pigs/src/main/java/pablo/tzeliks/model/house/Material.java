package pablo.tzeliks.model.house;

/**
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * <p><em>Interface</em> responsável por ditar métodos necessários para <strong>Classificar</strong> uma <strong>Casa</strong></p>
 * @since 2025-11-25
 */

public enum Material {

    STRAW("Straw", 2),
    WOOD("Wood", 4),
    BRICK("Brick", 12);

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
