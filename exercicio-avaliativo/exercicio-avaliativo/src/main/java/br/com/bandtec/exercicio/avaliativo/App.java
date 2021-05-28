
package br.com.bandtec.exercicio.avaliativo;


public class App {
    
    
   
    public static void main(String[] args) {
        
        ImovelNovo imovelNovo1 = new ImovelNovo(1, "Montanhas", "Chile", 5, 37.0, 15000.00);
        ImovelNovo imovelNovo2 = new ImovelNovo(2, "Cidade", "centro de SP", 8, 30.0, 9000.00);
        imovelUsado imovelUsado1 = new imovelUsado(3, "Triplex", "Guarujá", 16, 27000.0, 10000.00);
        Imobiliaria imobiliaria1 = new Imobiliaria("Volpes", 1000.000);
        
        imobiliaria1.cadastrarImovel(imovelNovo1);
        imobiliaria1.cadastrarImovel(imovelNovo2);
        imobiliaria1.cadastrarImovel(imovelUsado1);
         System.out.println("Imóveis Novos");
        imobiliaria1.exibirImoveisNovos();
        System.out.println("");
         System.out.println("Imóveis Usados");
        imobiliaria1.exibirImoveisUsados();
        System.out.println("");
        System.out.println("Vender Imóvel existente");
        imobiliaria1.venderImovel(3);
        System.out.println("");
         System.out.println("Vender Imóvel não existente");
        imobiliaria1.venderImovel(5);
        System.out.println("");
          System.out.println("Exibir Imóveis");
        imobiliaria1.exibirImoveis(); 
        System.out.println("");
        System.out.println("Exibir Imobiliária");
        System.out.println(imobiliaria1);
        
    }
}
    
    
    

