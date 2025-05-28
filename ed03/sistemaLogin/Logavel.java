package ed03.sistemaLogin;

/**
 * Interface que define operações de registro de log.
 */
public interface Logavel {
    /**
     * Registra uma operação no log do sistema.
     * @param operacao A operação a ser registrada
     */
    void registrarLog(String operacao);
}