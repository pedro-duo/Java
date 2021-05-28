package br.com.bandtec.projeto.vendedor;

public class TesteVendedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Cria um objeto da classe VendedorComissao
        VendedorComissao comissao = new VendedorComissao("Frizza", 15000.0, 0.20);
        // Exibe o objeto (chamada implícita do toString()
        System.out.println(comissao);

        // Cria um objeto da classe herdeira
        VendedorComissaoMaisFixo fixo = new VendedorComissaoMaisFixo(
                "Célia", 15000.0, 0.20, 2000.0);

        // Exibe o objeto
        System.out.println(fixo);

        // Cria um objeto vendas da classe Departamento
        Departamento vendas = new Departamento();
        
        // Adiciona os objetos vc e vcf ao departamento de Vendas
        vendas.adicionaVendedor(comissao);
        vendas.adicionaVendedor(fixo);

        // Exibe todos os vendedores do depto de vendas
        vendas.exibeTodos();

        // Exibe o total dos salários gastos no depto de vendas
        System.out.println(
                String.format("\nO total dos salários gastos no depto é: R$%.2f",
                        vendas.calcularTotalSalario()
                )
        );
    }
}
