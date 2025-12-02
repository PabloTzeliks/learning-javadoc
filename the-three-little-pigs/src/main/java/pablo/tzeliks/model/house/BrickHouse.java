package pablo.tzeliks.model.house;

/**
 * Representa uma casa construída de <strong>Tijolos</strong>.
 * <p>Esta implementação possui alta resistência estrutural baseada no material {@link Material#BRICK}.</p>
 *
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * @since 2025-11-25
 * @see IHouse
 */
public class BrickHouse implements IHouse {

    private final Material material;
    private boolean status;

    /**
     * Construtor da Casa de Tijolos.
     * @param status O estado inicial da casa (true para inteira/de pé).
     */
    public BrickHouse(boolean status) {
        this.material = Material.BRICK;
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
     * <p>Para a casa de tijolos, a resistência é comparada com a força do sopro.</p>
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