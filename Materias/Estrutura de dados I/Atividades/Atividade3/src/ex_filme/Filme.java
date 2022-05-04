package ex_filme;

public class Filme {
     private String titulo;
     private String diretor;
     private String genero;
     private String pais;
     private int ano;

    public Filme() {
    }
    
    public Filme(String titulo, String diretor, String genero, String pais, int ano) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.pais = pais;
        this.ano = ano;
    }

     
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "\n  Titulo: " + titulo + " | Diretor: " + diretor + " | Genero: " + genero + " | Pais: " + pais + " | Ano: " + ano;
    }
     
    
     
}
