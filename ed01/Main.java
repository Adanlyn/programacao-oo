import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Placar placar = new Placar();

        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine();
        Jogador jogador = new Jogador(nome);
        Jogo jogo = new Jogo(jogador);

        boolean acertou = false;
        while (!acertou) {
            System.out.print("Digite sua tentativa (1 a 100): ");
            int tentativa = teclado.nextInt();
            String resultado = jogo.jogar(tentativa);
            System.out.println(resultado);

            if (resultado.contains("Parabéns")) {
                acertou = true;
            }
        }

        System.out.println("\nTentativas: " + jogador.getTentativas());
        System.out.println("Pontuação final: " + jogador.getPontuacao());

        placar.adicionarJogador(jogador);
        placar.mostrarRanking();
    }
}
