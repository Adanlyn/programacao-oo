package agendaContatos;
import java.util.ArrayList;
import java.util.List;


/**
 * Classe responsável por gerenciar a lista de contatos.
 * Permite adicionar, remover e listar contatos do tipo Pessoa Física ou Jurídica.
 */
public class ContatoController {
    private List<Contato> contatos = new ArrayList<>();

    /**
     * Adiciona um novo contato à lista.
     * Verifica se o CPF ou CNPJ já está cadastrado.
     *
     * @param contato O contato a ser adicionado.
     * @throws IllegalArgumentException Se o CPF ou CNPJ já estiver cadastrado.
     */

    public void adicionar(Contato contato) {
        if (contato instanceof PessoaFisica) {
            String cpf = ((PessoaFisica) contato).getCpf();
            if (buscarPorCpf(cpf) != null) {
                throw new IllegalArgumentException("Já existe um contato com este CPF");
            }
        } else if (contato instanceof PessoaJuridica) {
            String cnpj = ((PessoaJuridica) contato).getCnpj();
            if (buscarPorCnpj(cnpj) != null) {
                throw new IllegalArgumentException("Já existe um contato com este CNPJ");
            }
        }
        
        contatos.add(contato);
    }

    /**
     * Remove um contato da lista com base no CPF ou CNPJ
     * @param identificador O CPF ou CNPJ do contato a ser removido.
     */
    public void remover(String identificador) {
        Contato contato = buscarContato(identificador);
        if (contato != null) {
            contatos.remove(contato);
        }
    }
    /**
     * Mostra a lista de todos os contatos cadastrados.
     *
     * @return Lista de contatos.
     */

    public List<Contato> listar() {
        return new ArrayList<>(contatos);
    }

    /**
     * Busca um contato com base no CPF ou CNPJ.
     * @param identificador CPF ou CNPJ.
     * @return O contato correspondente ou null se não encontrado.
     */
    private Contato buscarContato(String identificador) {
        Contato contato = buscarPorCpf(identificador);
        if (contato == null) {
            contato = buscarPorCnpj(identificador);
        }
        return contato;
    }

    private PessoaFisica buscarPorCpf(String cpf) {
        for (Contato contato : contatos) {
            if (contato instanceof PessoaFisica && ((PessoaFisica) contato).getCpf().equals(cpf)) {
                return (PessoaFisica) contato;
            }
        }
        return null;
    }

    private PessoaJuridica buscarPorCnpj(String cnpj) {
        for (Contato contato : contatos) {
            if (contato instanceof PessoaJuridica && ((PessoaJuridica) contato).getCnpj().equals(cnpj)) {
                return (PessoaJuridica) contato;
            }
        }
        return null;
    }
}
