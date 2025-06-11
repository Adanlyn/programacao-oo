package agendaContatos;

import java.util.List;
import java.util.Scanner;


/**
 * Classe responsável por interagir com o usuário através do console.
 * Permite adicionar, listar e remover contatos.
 */
public class ContatoView {
    private ContatoController controller;
    private Scanner scanner;

    /**
     * Construtor da view.
     *
     * @param controller O controller utilizado para gerenciar os contatos.
     */
    public ContatoView(ContatoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Exibe o menu principal e processa as opções do usuário.
     */
    public void exibirMenu() {
        while (true) {
            System.out.println("\n--- Agenda de Contatos ---");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Remover Contato");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    mostrarContatos(controller.listar());
                    break;
                case 3:
                    removerContato();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    /**
     * Solicita os dados ao usuário e adiciona um novo contato.
     */
    private void adicionarContato() {
        System.out.println("\nTipo de Contato:");
        System.out.println("1. Pessoa Física");
        System.out.println("2. Pessoa Jurídica");
        System.out.print("Escolha: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        try {
            if (tipo == 1) {
                System.out.print("CPF (11 dígitos): ");
                String cpf = scanner.nextLine();
                controller.adicionar(new PessoaFisica(nome, telefone, email, cpf));
            } else if (tipo == 2) {
                System.out.print("CNPJ (14 dígitos): ");
                String cnpj = scanner.nextLine();
                controller.adicionar(new PessoaJuridica(nome, telefone, email, cnpj));
            }
            System.out.println("Contato adicionado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }


    /**
     * Solicita o CPF ou CNPJ do contato a ser removido e o remove.
     */
    private void removerContato() {
        System.out.print("Digite o CPF ou CNPJ do contato a ser removido: ");
        String identificador = scanner.nextLine();
        controller.remover(identificador);
        System.out.println("Contato removido com sucesso!");
    }

    /**
     * Exibe a lista de contatos cadastrados.
     * @param contatos
     */
    public void mostrarContatos(List<Contato> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }

        System.out.println("\nLista de Contatos:");
        System.out.printf("%-20s %-15s %-30s %-15s %-15s%n", 
                         "Nome", "Telefone", "Email", "CPF/CNPJ", "Tipo");
        System.out.println("--------------------------------------------------------------------------------");

        for (Contato contato : contatos) {
            String tipo = contato instanceof PessoaFisica ? "PF" : "PJ";
            String documento = contato instanceof PessoaFisica ? 
                             ((PessoaFisica) contato).getCpf() : 
                             ((PessoaJuridica) contato).getCnpj();
            
            System.out.printf("%-20s %-15s %-30s %-15s %-15s%n", 
                             contato.getNome(), contato.getTelefone(), 
                             contato.getEmail(), documento, tipo);
        }
    }
}