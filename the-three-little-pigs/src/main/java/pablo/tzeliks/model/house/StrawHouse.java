package pablo.tzeliks.model.house;

/**
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * <p><em>Interface</em> responsável por ditar métodos necessários para <strong>Classificar</strong> uma <strong>Casa</strong></p>
 * @since 2025-11-25
 */

public class StrawHouse implements ICasa {

    private final Material material;
    private boolean status;

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
        if (status) {

            return "De Pé";
        } else {

            return "Destruída";
        }
    }
}
