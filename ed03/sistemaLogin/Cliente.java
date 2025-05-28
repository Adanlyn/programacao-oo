package ed03.sistemaLogin;

/**
 * Classe que representa um usuário cliente do sistema.
 * Implementa apenas funcionalidades de autenticação.
 */
public class Cliente extends Usuario implements Autenticavel {

    /**
     * Construtor da classe Cliente.
     * @param login Login do cliente
     * @param senha Senha do cliente
     */
    public Cliente(String login, String senha) {
        super(login, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha) && senha.length() > 6;
    }
}