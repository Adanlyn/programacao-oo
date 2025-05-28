package ed03.folhaPagamento;

/**
 * Classe que representa um funcionário temporário.
 * Funcionários temporários têm um desconto fixo de R$ 100,00.
 */
public class FuncionarioTemporario extends Funcionario {
    /**
     * Construtor da classe FuncionarioTemporario.
     * @param nome Nome do funcionário temporário
     * @param salarioBase Salário base do funcionário temporário
     */
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final do funcionário temporário (salário base - desconto fixo).
     * @return Salário final do funcionário temporário
     */
    @Override
    public double calcularSalario() {
        return salarioBase - 100;
    }
}