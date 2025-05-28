package ed03.sistemaLogin;

/**
 * Interface que define operações de gerenciamento de usuários.
 */
public interface Gerenciavel {
    /**
     * Altera a senha do usuário.
     * @param novaSenha A nova senha a ser definida
     */
    void alterarSenha(String novaSenha);
    
    /**
     * Bloqueia o usuário no sistema.
     */
    void bloquearUsuario();
}