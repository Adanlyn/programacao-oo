package agendaContatos;

public class PessoaJuridica extends ContatoBase {
    private String cnpj;

    /**
     * Construtor da classe PessoaJuridica.
     *
     * @param nome o nome da empresa.
     * @param telefone o telefone da empresa.
     * @param email o e-mail da empresa.
     * @param cnpj o CNPJ da empresa (deve conter 14 dígitos numéricos).
     */
    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email);
        setCnpj(cnpj);
    }

    /**
     * @return o CNPJ.
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj o novo CNPJ.
     * @throws IllegalArgumentException se o CNPJ for nulo ou inválido.
     */
    public void setCnpj(String cnpj) {
        if (cnpj == null || !cnpj.matches("\\d{14}")) {
            throw new IllegalArgumentException("CNPJ deve conter exatamente 14 dígitos numéricos");
        }
        this.cnpj = cnpj;
    }
}