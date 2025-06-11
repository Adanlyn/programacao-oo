package agendaContatos;

/**
 * Interface que define os métodos básicos de um contato.
 */
public interface Contato {
    /**
     * @return o nome do contato.
     */
    String getNome();
    
    /**
     * @return o telefone do contato.
     */
    String getTelefone();

    /**
     * @return o email do contato.
     */
    String getEmail();

}