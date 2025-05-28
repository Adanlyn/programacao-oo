package ed03.folhaPagamento;

/**
 * Classe que representa um funcionário CLT.
 * Funcionários CLT recebem um adicional fixo de R$ 300,00.
 */
public class FuncionarioCLT extends Funcionario {
    /**
     * Construtor da classe FuncionarioCLT.
     * @param nome Nome do funcionário CLT
     * @param salarioBase Salário base do funcionário CLT
     */
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final do funcionário CLT (salário base + adicional fixo).
     * @return Salário final do funcionário CLT
     */
    @Override
    public double calcularSalario() {
        return salarioBase + 300;
    }
}