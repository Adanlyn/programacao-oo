package agendaContatos;

public class Main {
    public static void main(String[] args) {
        /**
         * Classe principal que inicia o aplicativo de gerenciamento de contatos.
         * Cria uma instância do controlador de contatos e da visualização, e exibe o menu principal.
         */
        ContatoController controller = new ContatoController();
        ContatoView view = new ContatoView(controller);
        view.exibirMenu();
    }
}