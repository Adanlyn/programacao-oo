package ed01;

import java.util.Scanner;

public class ControleAgenda {
    public void executar(){
        Scanner teclado = new Scanner(System.in);
        boolean saida = false;
        //lista de contatos
        VetorContato contatos = new VetorContato();
        TelaAgenda tela = new TelaAgenda();
        do{
            // menu
            tela.exibirMenu();

            //leo  a opcao do usuario
            int opcao = tela.lerOpcao();
            //insere contato
            switch (opcao) {
                case 1:
                    Contato contato = tela.exibirAdicionarContato();
                    contatos.adicionaContato(contato);
                    break;
                case 2:
                    tela.exibirListarContato(contatos);
                    break;
                case 9:
                    break;
                default:
            }
        }while(!saida);
    }
}
