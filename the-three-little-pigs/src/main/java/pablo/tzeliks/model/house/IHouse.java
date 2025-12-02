package pablo.tzeliks.model.house;

/**
 * Interface responsável por definir o contrato para os diferentes tipos de <strong>Casa</strong>.
 * <p>Define os comportamentos de resistência e verificação de estado estrutural.</p>
 *
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * @since 2025-11-25
 */
public interface IHouse {

    /**
     * Obtém a descrição do material da casa.
     * @return Nome do material utilizado na construção.
     */
    String getMaterial();

    /**
     * Obtém o valor numérico da resistência estrutural da casa.
     * @return Um número inteiro representando a tenacidade do material.
     */
    int getResistencia();

    /**
     * Calcula se a casa resiste a uma determinada força de impacto (Sopro).
     * <p><strong>Nota:</strong> Este método pode alterar o estado interno da casa para "destruída"
     * caso a força supere a resistência.</p>
     *
     * @param forcaDoSopro A potência do sopro aplicada sobre a casa.
     * @return <code>true</code> se a casa permanecer de pé; <code>false</code> se for destruída.
     */
    boolean resisteAoSopro(int forcaDoSopro);

    /**
     * Verifica o estado atual da estrutura.
     * @return Uma String descrevendo se a casa está "De Pé" ou "Destruída".
     */
    String statusAtual();
}