package ed03.graficasOnline;

/**
 * Classe que representa uma imagem digital imprimível.
 * Contém nome do arquivo e resolução.
 */
public class ImagemDigital implements Imprimivel {
    private String nomeArquivo;
    private String resolucao;

    /**
     * Construtor da classe ImagemDigital.
     * @param nomeArquivo Nome do arquivo da imagem
     * @param resolucao Resolução da imagem (ex: "1920x1080")
     */
    public ImagemDigital(String nomeArquivo, String resolucao) {
        this.nomeArquivo = nomeArquivo;
        this.resolucao = resolucao;
    }

    /**
     * Implementação do método imprimir para ImagemDigital.
     * Exibe o nome do arquivo e sua resolução.
     */
    @Override
    public void imprimir() {
        System.out.println("Arquivo: " + nomeArquivo);
        System.out.println("Resolução: " + resolucao);
    }
}