package pablo.tzeliks.model.house;

/**
 * @author Pablo Ruan Tzeliks
 * @version 1.0.0
 * <p><em>Interface</em> responsável por ditar métodos necessários para <strong>Classificar</strong> uma <strong>Casa</strong></p>
 * @since 2025-11-25
 */

public interface ICasa {

    /**
     * Método getter
     * @return Descreve o máterial que é construida a <em>Casa</em>
     */
    String getMaterial();

    /**
     * Método getter
     * @return Descreve a resistência a sopros estabelecida à <em>Casa</em>
     */
    int getResistencia();

    /**
     * Método de Calculo para Validar se a Casa ficará em pé ou não
     * @param forcaDoSopro Refere-se a potência do <em>Sopro</em> do <strong>Lobo Mau</strong> que será feita sobre a <em>Casa</em>
     * @return <em>true</em> ou <em>false</em> como resultado para se a casa irá resistir ao <em>Sopro</em> (true) ou não resistirá (false)
     */
    boolean resisteAoSopro(int forcaDoSopro);

    /**
     * Valida o estado atual da Casa
     * @return Descreve dois possiveis estados da <em>Casa</em>, sendo eles "De pé" ou "Destruida"
     */
    String statusAtual();
}
