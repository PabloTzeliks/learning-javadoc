package pablo.tzeliks.model.house;

public class WoodenHouse implements ICasa {

    private final Material material;
    private boolean status;

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
