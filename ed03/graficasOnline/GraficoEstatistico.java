package ed03.graficasOnline;

/**
 * Classe que representa um gráfico estatístico imprimível.
 * Contém título e tipo do gráfico.
 */
public class GraficoEstatistico implements Imprimivel {
    private String titulo;
    private String tipoGrafico;

    /**
     * Construtor da classe GraficoEstatistico.
     * @param titulo Título do gráfico
     * @param tipoGrafico Tipo do gráfico (ex: "pizza", "barra")
     */
    public GraficoEstatistico(String titulo, String tipoGrafico) {
        this.titulo = titulo;
        this.tipoGrafico = tipoGrafico;
    }

    /**
     * Implementação do método imprimir para GraficoEstatistico.
     * Exibe o tipo de gráfico seguido do título em caixa alta.
     */
    @Override
    public void imprimir() {
        System.out.println("Tipo de Gráfico: " + tipoGrafico);
        System.out.println("Título: " + titulo.toUpperCase());
    }
}