package ed03.graficasOnline;

/**
 * Interface que define o contrato para objetos que podem ser impressos.
 * Todas as classes que implementam esta interface devem fornecer
 * sua própria implementação do método imprimir().
 */
public interface Imprimivel {
    /**
     * Método responsável pela exibição dos dados do objeto
     * de forma específica para cada tipo de conteúdo.
     */
    void imprimir();
}