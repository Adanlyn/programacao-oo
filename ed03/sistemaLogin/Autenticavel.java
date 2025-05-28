package ed03.sistemaLogin;

/**
 * Interface que define o contrato para objetos que podem ser autenticados.
 */
public interface Autenticavel {
    /**
     * Verifica se a senha fornecida é válida.
     * @param senha A senha a ser verificada
     * @return true se a autenticação for bem-sucedida, false caso contrário
     */
    boolean autenticar(String senha);
}