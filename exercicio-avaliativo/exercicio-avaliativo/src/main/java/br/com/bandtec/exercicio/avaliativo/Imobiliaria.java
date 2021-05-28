
package br.com.bandtec.exercicio.avaliativo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Imobiliaria {
    
    private String nome;
    private Double caixa;
    private List<Imovel> imoveis;

    public Imobiliaria(String nome, Double caixa) {
        this.nome = nome;
        this.caixa = caixa;
        this.imoveis = new ArrayList();
    }

    
    public void cadastrarImovel(Imovel imovel){
         imoveis.add(imovel);
        
    }
    
    
    public void exibirImoveis(){
        if (imoveis.isEmpty()) {
            System.out.println(String.format("Não possui %s imoveis disponiveis", this.nome));
        } else {
            for (Imovel imovel : imoveis) {
                System.out.println(imoveis);
            }
        }
    }
    
    
    public void exibirImoveisUsados(){
        if (imoveis.isEmpty()) {
            System.out.println(String.format("Não possui %s imoveis disponiveis", this.nome));
        } else {
            for (Imovel imovel : imoveis) {
                System.out.println(imoveis);
            }
        }
        
        
    }
    
    
    public void exibirImoveisNovos(){
         if (imoveis.isEmpty()) {
            System.out.println(String.format("Não possui %s imoveis disponiveis", this.nome));
        } else {
            for (Imovel imovel : imoveis) {
                System.out.println(imoveis);
            }
        }
        
    }
    
    public void venderImovel(Integer idProcurado){
        
        for (int i = 0; i < imoveis.size(); i++) {
            if (imoveis.get(i).getId().equals(idProcurado)) {
                this.caixa += imoveis.get(i).getPrecoImovel();
                imoveis.remove(i);
                System.out.println(String.format("Imovel de id %d - vendido", idProcurado));
            }else{
                System.out.println(String.format("Imovel de id %d - não encontrado", idProcurado));
            }
        }
        
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCaixa() {
        return caixa;
    }

    public void setCaixa(Double caixa) {
        this.caixa = caixa;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    

    @Override
    public String toString() {
      
      return String.format("Imobilaria: \n"
              + "Nome: %s \n "
              + "Caixa: %.2f \n "
              + "Imoveis %s",
              this.nome,
              this.caixa,
              this.imoveis
             
     );

   
    }    
  
        
        
}
