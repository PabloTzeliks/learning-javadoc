package pablo.tzeliks.model.entity;

import pablo.tzeliks.model.house.IHouse;

/**
 * Representa a entidade do <strong>Porquinho</strong>.
 * <p>Esta classe é responsável por construir casas e fugir do {@link TheBigBadWolf},
 * com objetos que implementam a interface {@link IHouse} para construirem e se esconderem nas mesmas.</p>
 *
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * @since 2025-11-25
 */
public class LittePig {

    /**
     * Armazena o nome do Porquinho.
     */
    private String name;

    /**
     * Construtor padrão.
     */
    public LittePig(String name) {
        this.name = name;
    }

    /**
     * Realiza a ação de construir uma Casa.
     * <p>Este método criar uma casa que implementa a interface {@link IHouse},
     * passando uma de suas implementações.</p>
     *
     * @param house A instância da <strong>Casa</strong> que será contruida.
     * @return <code>Implementação da Casa</code> de um interface {@link IHouse}.
     */
    public IHouse buildHouse(IHouse house) {

        return house;
    }

    /**
     * Método da ação de fugir do {@link TheBigBadWolf}
     * @deprecated
     * @param littePig
     */
    public void runAway(LittePig littePig) {

        System.out.println(littePig.name + " fugiu!");
    }

    /**
     * Obtém o nome do Porquinho.
     *
     * @return Uma String com o nome do Porquinho.
     */
    public String getName() {
        return name;
    }
}
