package agendaContatos;

/**
 * Classe abstrata que implementa a interface Contato e fornece a base para contatos com nome, telefone e e-mail.
 */
public abstract class ContatoBase implements Contato {
    private String nome;
    private String telefone;
    private String email;

    /**
     * Construtor da classe ContatoBase.
     * @param nome o nome do contato.
     * @param telefone o telefone do contato.
     * @param email o e-mail do contato.
     */
    public ContatoBase(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    /**
     * @return o nome do contato.
     */
        @Override
    public String getNome() {
            return nome;
        }

    /**
     * @param nome o novo nome do contato.
     * @throws IllegalArgumentException se o nome for nulo ou tiver menos de 3 caracteres.
     */
    public void setNome(String nome) {
        if (nome == null || nome.length() < 3) {
            throw new IllegalArgumentException("Nome deve ter no mínimo 3 caracteres");
        }
        this.nome = nome;
    }
    
    /**
     * @return o telefone do contato.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone o novo telefone do contato.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return o e-mail do contato.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email o novo e-mail do contato.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}