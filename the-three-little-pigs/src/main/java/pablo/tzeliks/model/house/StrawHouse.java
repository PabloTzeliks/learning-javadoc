package pablo.tzeliks.model.house;

/**
 * Representa uma casa construída de <strong>Palha</strong>.
 * <p>Esta implementação possui baixa resistência estrutural baseada no material {@link Material#STRAW}.</p>
 *
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * @since 2025-11-25
 * @see IHouse
 */
public class StrawHouse implements IHouse {

    private final Material material;
    private boolean status;

    /**
     * Construtor da Casa de Palha.
     * @param status O estado inicial da casa (true para inteira/de pé).
     */
    public StrawHouse(boolean status) {
        this.material = Material.STRAW;
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