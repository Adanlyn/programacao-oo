package ed03.sistemaLogin;

/**
 * Classe principal que demonstra o sistema de login.
 */
public class ProgramaLogin {
    public static void main(String[] args) {
        // Criando instâncias de cada tipo de usuário
        Administrador admin = new Administrador("admin", "admin123");
        Visitante visitante = new Visitante("guest", "qualquer");
        Cliente cliente = new Cliente("joao", "segredo123");

        // Testando cada usuário
        System.out.println("=== ADMINISTRADOR ===");
        admin.exibirLogin();
        testarAutenticacao(admin, "admin123");
        testarAutenticacao(admin, "senhaerrada");
        admin.alterarSenha("novaSenha456");
        admin.bloquearUsuario();
        admin.registrarLog("Exclusão de conta.");

        System.out.println("\n=== VISITANTE ===");
        visitante.exibirLogin();

        System.out.println("\n=== CLIENTE ===");
        cliente.exibirLogin();
        testarAutenticacao(cliente, "segredo123");
        testarAutenticacao(cliente, "12345");
    }

    private static void testarAutenticacao(Autenticavel autenticavel, String senha) {
        System.out.println("Tentando autenticar com senha '" + senha + "': " + 
            (autenticavel.autenticar(senha) ? "SUCESSO" : "FALHA"));
    }
}