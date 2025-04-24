package ed01;

import java.util.Scanner;

public class TelaAgenda {
    private Scanner teclado;

    public TelaAgenda (){
        teclado = new Scanner(System.in);
    }

    public void exibirMenu(){
        System.out.println("=== AGENDA DE ENDEREÇOS ===");
        System.out.println();
        System.out.println("=== MENU ===");
        System.out.println("1. Adicionar Contatos");
        System.out.println("2. Listar Contatos");
        System.out.println("9. Sair");
    }
    public int lerOpcao(){
        System.out.println(">: ");
        int opcao = teclado.nextInt();

        teclado.nextLine();
        return opcao;
    }
    public Contato exibirAdicionarContato() {
        System.out.println();
        System.out.println("# Adicionar Contato #");
        System.out.println("- Digite o nome");
        String nome = teclado.nextLine();

        System.out.println("- Digite o e-mail: ");
        String email = teclado.nextLine();

        System.out.println("- Digite o telefone: ");
        String telefone = teclado.nextLine();

        System.out.println("- Digite o aniversário (dd mm aaaa): ");
        int dia = teclado.nextInt();
        int mes = teclado.nextInt();
        int ano = teclado.nextInt();

        System.out.println("- Digite a rua: ");
        String rua = teclado.nextLine();

        System.out.println("- Digite o número: ");
        String numero = teclado.nextLine();

        System.out.println("- Digite o bairro: ");
        String bairro = teclado.nextLine();

        System.out.println("- Digite a cidade: ");
        String cidade = teclado.nextLine();

        System.out.println("- Digite o Estado: ");
        String estado = teclado.nextLine();

        Contato contato = new Contato(nome,telefone, email);
        contato.setAniversario(dia, mes, ano);
        contato.getEndereco().setRua(rua);
        contato.getEndereco().setNumero(Integer.parseInt(numero));
        contato.getEndereco().setBairro(bairro);
        contato.getEndereco().setCidade(cidade);
        contato.getEndereco().setEstado(estado);

        return contato;


    }
    public void exibirListarContato(VetorContato vetor) {
        System.out.println("# Listar Contato #");

        for(Contato contato : vetor.getContatos()){
            if (contato == null){
                break;
            }
            System.out.printf("| %20s |", contato.getNome());
            System.out.printf("| %20s |", contato.getEmail());
            System.out.printf("| %02d/%02d/%4d |",
                    contato.getAniversario().getDia(),
                    contato.getAniversario().getMes(),
                    contato.getAniversario().getAno());
        }






    }
}
