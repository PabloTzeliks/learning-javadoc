package pablo.tzeliks.model.house;

/**
 * Representa uma casa construída de <strong>Madeira</strong>.
 * <p>Esta implementação possui resistência mediana baseada no material {@link Material#WOOD}.</p>
 *
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * @since 2025-11-25
 * @see IHouse
 */
public class WoodenHouse implements IHouse {

    private final Material material;
    private boolean status;

    /**
     * Construtor da Casa de Madeira.
     * @param status O estado inicial da casa (true para inteira/de pé).
     */
    public WoodenHouse(boolean status) {
        this.material = Material.WOOD;
        this.status = status;
    }

    @Override
    public String getMaterial() {
        return material.getName();
    }

    @Override
    public int getResistencia() {
        return material.getStrength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean resisteAoSopro(int forcaDoSopro) {
        if (material.getStrength() < forcaDoSopro) {
            this.status = false;
            return status;
        }
        return status;
    }

    @Override
    public String statusAtual() {
        return status ? "De Pé" : "Destruída";
    }
}