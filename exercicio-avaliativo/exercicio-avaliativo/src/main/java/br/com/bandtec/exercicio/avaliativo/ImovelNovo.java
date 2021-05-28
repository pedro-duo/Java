
package br.com.bandtec.exercicio.avaliativo;


public class ImovelNovo extends Imovel{

    public ImovelNovo(Integer Id, String titulo, String localizacao, Integer comodos, Double tamanho, Double precoPorMetodoQuadrado) {
        super(Id, titulo, localizacao, comodos, tamanho, precoPorMetodoQuadrado);
    }

    @Override
    public Double getPrecoImovel() {
        return super.getPrecoImovel() + (super.getPrecoImovel() * 0.20); 
    }
    
    
 @Override
    public String toString() {
        return super.toString();
    }
   
    
    
}
