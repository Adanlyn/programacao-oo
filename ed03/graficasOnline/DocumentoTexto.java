package ed03.graficasOnline;

/**
 * Classe que representa um documento de texto imprimível.
 * Contém um título e conteúdo textual.
 */
public class DocumentoTexto implements Imprimivel {
    private String titulo;
    private String conteudo;

    /**
     * Construtor da classe DocumentoTexto.
     * @param titulo Título do documento
     * @param conteudo Conteúdo textual do documento
     */
    public DocumentoTexto(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    /**
     * Implementação do método imprimir para DocumentoTexto.
     * Exibe o título em letras maiúsculas seguido do conteúdo.
     */
    @Override
    public void imprimir() {
        System.out.println(titulo.toUpperCase());
        System.out.println(conteudo);
    }
}