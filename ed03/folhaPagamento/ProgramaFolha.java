package ed03.folhaPagamento;

/**
 * Classe principal que demonstra o uso do sistema de folha de pagamento.
 */
public class ProgramaFolha {
    /**
     * Método principal que cria instâncias de funcionários e exibe seus dados e salários calculados.
     */
    public static void main(String[] args) {
        // Cria um funcionário CLT
        FuncionarioCLT carlos = new FuncionarioCLT("Carlos", 2000.00);
        
        // Cria um funcionário temporário
        FuncionarioTemporario ana = new FuncionarioTemporario("Ana", 2000.00);
        
        // Exibe dados e salário calculado do funcionário CLT
        System.out.println("--- Funcionário CLT ---");
        carlos.exibirDados();
        System.out.println("Salário Final: R$ " + carlos.calcularSalario());
        
        System.out.println(); // Linha em branco para separar
        
        // Exibe dados e salário calculado do funcionário temporário
        System.out.println("--- Funcionário Temporário ---");
        ana.exibirDados();
        System.out.println("Salário Final: R$ " + ana.calcularSalario());
    }
}