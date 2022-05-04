
package timedefutebol;


public class Times {
    public String nomeDoTime;
    public int numeroDoTime;
    public int anoDeFundacao;
    public int qtdDeTitulosBrasileiros;
    
  public void Time(){
  if(numeroDoTime==1){
  nomeDoTime="VascoDaGama";
  anoDeFundacao=1500;
  qtdDeTitulosBrasileiros=12;
  }if(numeroDoTime==2){
       nomeDoTime="Pedrinho78";
  anoDeFundacao=2019;
  qtdDeTitulosBrasileiros=42;
  }if(numeroDoTime==3){
  nomeDoTime="santos";
  anoDeFundacao=1589;
  qtdDeTitulosBrasileiros=15;
  }
  }
 
 public void ImprimirDetalhes(){
 System.out.println("- Nome do time: "+nomeDoTime);
 System.out.println("- Ano de fundação: "+anoDeFundacao);
 System.out.println("- Quantidade de titulos brasileiros: "+qtdDeTitulosBrasileiros);
 System.out.println("- Numero do time: "+numeroDoTime);
 }   
}
