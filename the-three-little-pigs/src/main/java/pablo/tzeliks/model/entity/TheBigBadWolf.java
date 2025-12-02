package pablo.tzeliks.model.entity;

import pablo.tzeliks.model.house.IHouse;

/**
 * Representa a entidade do <strong>Lobo Mau</strong>.
 * <p>Esta classe é responsável por gerar uma força de sopro aleatória e interagir
 * com objetos que implementam a interface {@link IHouse} para testar sua resistência.</p>
 *
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * @since 2025-11-25
 */
public class TheBigBadWolf {

    /**
     * Armazena a força do sopro calculada para esta instância do Lobo.
     */
    private int blowForce;

    /**
     * Limite máximo para a geração aleatória da força do sopro.
     */
    private final int max = 10;

    /**
     * Limite mínimo para a geração aleatória da força do sopro.
     */
    private final int min = 0;

    /**
     * Construtor padrão.
     * <p>Inicializa o Lobo calculando automaticamente uma força de sopro aleatória
     * entre os valores definidos de <code>min</code> (0) e <code>max</code> (10).</p>
     */
    public TheBigBadWolf() {
        this.blowForce = (int)(Math.random() * (max - min + 1)) + min;
    }

    /**
     * Realiza a ação de soprar contra uma casa alvo.
     * <p>Este método delega a verificação de resistência para a própria instância da {@link IHouse},
     * passando a força de sopro atual do lobo como parâmetro.</p>
     *
     * @param house A instância da <strong>Casa</strong> que sofrerá o sopro.
     * @return <code>true</code> se a casa resistir ao sopro; <code>false</code> se a casa for destruída.
     */
    public boolean blow(IHouse house) {
        return house.resisteAoSopro(this.blowForce);
    }

    /**
     * Obtém a força do sopro gerada para este Lobo.
     *
     * @return Um número inteiro representando a potência do sopro.
     */
    public int getBlowforce() {
        return this.blowForce;
    }
}