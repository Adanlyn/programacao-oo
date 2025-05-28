package ed03.graficasOnline;

/**
 * Classe principal que demonstra o uso do sistema de impressão.
 * Cria instâncias de diferentes tipos de conteúdos imprimíveis
 * e chama seus métodos imprimir().
 */
public class ProgramaImpressao {
    /**
     * Método principal que cria instâncias e chama seus métodos imprimir().
     */
    public static void main(String[] args) {
        // Criando instâncias de cada tipo de conteúdo imprimível
        DocumentoTexto doc = new DocumentoTexto("Relatório Anual", "Este é o conteúdo do relatório anual da empresa...");
        ImagemDigital img = new ImagemDigital("foto.jpg", "1920x1080");
        GraficoEstatistico grafico = new GraficoEstatistico("Vendas por Região", "pizza");
        RelatorioPDF relatorio = new RelatorioPDF("João Silva", 42);

        // Chamando o método imprimir() de cada instância
        System.out.println("=== DOCUMENTO DE TEXTO ===");
        doc.imprimir();
        
        System.out.println("\n=== IMAGEM DIGITAL ===");
        img.imprimir();
        
        System.out.println("\n=== GRÁFICO ESTATÍSTICO ===");
        grafico.imprimir();
        
        System.out.println("\n=== RELATÓRIO PDF ===");
        relatorio.imprimir();
    }
}