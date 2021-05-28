/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.exercicio.avaliativo;

/**
 *
 * @author kaue.volpe.da.silva
 */
public class Imovel {
    private Integer Id ;
    private String titulo;
    private String localizacao;
    private Integer comodos;
    private Double tamanho;
    private Double precoPorMetodoQuadrado;
    
    
    public Double getPrecoImovel(){
        
        return(this.tamanho * this.precoPorMetodoQuadrado);
        
    }

    public Imovel(Integer Id, String titulo, String localizacao, Integer comodos, Double tamanho, Double precoPorMetodoQuadrado) {
        this.Id = Id;
        this.titulo = titulo;
        this.localizacao = localizacao;
        this.comodos = comodos;
        this.tamanho = tamanho;
        this.precoPorMetodoQuadrado = precoPorMetodoQuadrado;
    }
    
    

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Integer getComodos() {
        return comodos;
    }

    public void setComodos(Integer comodos) {
        this.comodos = comodos;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPrecoPorMetodoQuadrado() {
        return precoPorMetodoQuadrado;
    }

    public void setPrecoPorMetodoQuadrado(Double precoPorMetodoQuadrado) {
        this.precoPorMetodoQuadrado = precoPorMetodoQuadrado;
    }

      @Override
    public String toString() {
        
        return String.format("Imovel: \n"
                + "Id: %d \n "
                + "Titulo: %s \n"
                + "Localização: %s \n"
                + "Comodos: %d \n "
                + "Tamanho: %.2f "
                + "Preço Por Metro Quadrado: %.2f",
                this.Id,
                this.titulo,
                this.localizacao,
                this.comodos,
                this.tamanho,
                this.precoPorMetodoQuadrado,
                this.getPrecoImovel()
        );
    }    
    
    
    
}
