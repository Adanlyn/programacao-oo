package ed03.folhaPagamento;

/**
 * Classe abstrata que representa um funcionário genérico.
 * Contém atributos comuns e métodos que devem ser implementados por subclasses.
 * Esta classe não pode ser instanciada diretamente.
 */
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    /**
     * Construtor da classe Funcionario.
     * @param nome Nome do funcionário
     * @param salarioBase Salário base do funcionário
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Exibe os dados básicos do funcionário (nome e salário base).
     */
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$ " + salarioBase);
    }

    /**
     * Método abstrato para cálculo do salário final.
     * Deve ser implementado pelas subclasses.
     * @return Salário final calculado conforme regras específicas
     */
    public abstract double calcularSalario();
}