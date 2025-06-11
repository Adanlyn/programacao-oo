package agendaContatos;

public class PessoaFisica extends ContatoBase {
    private String cpf;

    /**
     * Construtor da classe PessoaFisica.
     *
     * @param nome o nome da pessoa física.
     * @param telefone o telefone da pessoa física.
     * @param email o e-mail da pessoa física.
     * @param cpf o CPF da pessoa física (deve conter 11 dígitos numéricos).
     */
    public PessoaFisica(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email);
        setCpf(cpf);
    }

    
    /**
     * Retorna o CPF da pessoa física.
     * @return o CPF.
     */
    public String getCpf() {
        return cpf;
    }

    /** 
     * @param cpf o novo CPF.
     * @throws IllegalArgumentException se o CPF for nulo ou inválido.
     */
    public void setCpf(String cpf) {
        if (cpf == null || !cpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("CPF deve conter exatamente 11 dígitos numéricos");
        }
        this.cpf = cpf;
    }
}