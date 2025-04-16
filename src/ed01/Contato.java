package ed01;

public class Contato {
    private String nome;
    private String telefone;
    private String email;
    private Data aniversario;
    private Endereco endereco;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.aniversario = aniversario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void  setAniversario(int dia, int mes, int ano){
        this.aniversario.setDia(dia);
        this.aniversario.setMes(mes);
        this.aniversario.setAno(ano);
    }

    public Data getAniversario() {
        return aniversario;
    }
}
