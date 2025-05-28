package ed03.sistemaLogin;

/**
 * Classe que representa um usuário visitante com acesso restrito.
 */
public class Visitante extends Usuario {

    /**
     * Construtor da classe Visitante.
     * @param login Login do visitante
     * @param senha Senha do visitante
     */
    public Visitante(String login, String senha) {
        super(login, senha);
    }

    @Override
    public void exibirLogin() {
        System.out.println("Visitante - acesso restrito ao sistema.");
    }
}
