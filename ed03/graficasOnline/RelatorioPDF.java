package ed03.graficasOnline;

/**
 * Classe que representa um relatório em PDF imprimível.
 * Contém autor e número de páginas.
 */
public class RelatorioPDF implements Imprimivel {
    private String autor;
    private int numeroPaginas;

    /**
     * Construtor da classe RelatorioPDF.
     * @param autor Autor do relatório
     * @param numeroPaginas Número total de páginas
     */
    public RelatorioPDF(String autor, int numeroPaginas) {
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Implementação do método imprimir para RelatorioPDF.
     * Exibe o nome do autor e o número total de páginas.
     */
    @Override
    public void imprimir() {
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}