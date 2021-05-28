package br.com.bandtec.projeto.vendedor;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Esta classe representa um vendedor que ganha na base de comissão sobre as
 * vendas realizadas no mês. Se as vendas realizadas for R$ 10000,00, por
 * exemplo, e se a taxa de comissão que ele ganha for de 0.10 (10%), o salário
 * dele nesse mês será de R$ 1000,00.
 *
 */
public class VendedorComissao {

    // Atributos
    private Integer codigo;     // código do vendedor
    private String nome;        // nome do vendedor
    private Double vendas;      // quantia total resultante das vendas realizadas no mês
    private Double taxa;        // taxa de comissão

    // Construtor
    public VendedorComissao(String nome, Double vendas, Double taxa) {
        this.codigo = ThreadLocalRandom.current().nextInt(0, 5000);
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }

    // Métodos
    /* Método calcularSalario() - retorna o salário do vendedor no mês atual */
    public Double calcularSalario() {
        return this.vendas * this.taxa;
    }

    // Getters e Setters
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();

        str.append("código: %d\n");
        str.append("nome: %s\n");
        str.append("vendas: R$%.2f\n");
        str.append("taxa: %.0f%%\n");
        str.append("salário final: R$%.2f\n");

        return String.format(str.toString(),
                this.codigo,
                this.nome,
                this.vendas,
                (this.getTaxa() * 100),
                this.calcularSalario()
        );
    }
}
