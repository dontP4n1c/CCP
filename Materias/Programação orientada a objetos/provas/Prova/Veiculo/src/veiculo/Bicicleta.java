/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

/**
 *
 * @author logon
 */
public class Bicicleta {
     private String cor;
     private byte qtdeMarchas;
     private int tamanho,p=0,m=1,g=2;
     private boolean temRodinhas;
     
     

    public String getCor() {
        return cor;
    }

    public byte getQtdeMarchas() {
        return qtdeMarchas;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getP() {
        return p;
    }

    public int getM() {
        return m;
    }

    public int getG() {
        return g;
    }

    public boolean isTemRodinhas() {
        return temRodinhas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQtdeMarchas(byte qtdeMarchas) {
        this.qtdeMarchas = qtdeMarchas;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setP(int p) {
        this.p = p;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setG(int g) {
        this.g = g;
    }

    public void setTemRodinhas(boolean temRodinhas) {
        this.temRodinhas = true;
        System.out.println("Tem rodinhas");
        if(this.temRodinhas== false){
        this.temRodinhas=false;
        System.out.println("Não tem rodinhas");
        }
    }
     
     public void tamanho(){
     if(tamanho==0){
     tamanho=p;
     System.out.println("tamanho pequeno");
     }if(tamanho==1){
     tamanho=m;
     System.out.println("tamanho medio");
     }if(tamanho==2){
     tamanho=g;
     System.out.println("tamanho grande");
     }
     
     } 
      
      
    public void printAll(){
    System.out.println("Cor da bike: "+cor);
    System.out.println("Quantidade de marchas: "+qtdeMarchas);
    System.out.println("Tamanho: "+tamanho);
    System.out.println("Tem rodinhas: "+temRodinhas);
    
    

} }
