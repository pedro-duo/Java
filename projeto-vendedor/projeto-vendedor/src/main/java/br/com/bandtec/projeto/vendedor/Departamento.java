package br.com.bandtec.projeto.vendedor;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    // Atributo
    private List<VendedorComissao> lista;

    // Construtor
    public Departamento() {
        lista = new ArrayList<>();
    }

    // Métodos
    public void adicionaVendedor(VendedorComissao v) {
        lista.add(v);
    }

    public Double calcularTotalSalario() {

        // modo tradicional usando for-aprimorado
        
        /*
        Double total = 0.0;

        for (VendedorComissao v : lista) {
            total += v.calcularSalario();
        }

        return total;
        */
        
        // Outra maneira de realizar a mesma operação
        return this.lista
                .stream()
                .mapToDouble(VendedorComissao::calcularSalario)
                .sum();
    }

    public void exibeTodos() {
        for (VendedorComissao v : lista) {
            System.out.println(v);
        }
    }
}
