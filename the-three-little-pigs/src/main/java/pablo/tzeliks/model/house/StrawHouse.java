package pablo.tzeliks.model.house;

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
