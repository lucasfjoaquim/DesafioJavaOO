package br.com.lucas.DesafioJavaOO.modelos;

public class Audio {

    private String titulo;
    private int duraçãoEmSegundos;
    private int curtidas;
    private int vizualisacoes;

    public void fichaTecnica(){
        System.out.println("=====================================================================");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Vizualisações: " + getVizualisacoes());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Estrelas: " + getClassificacao());
    }

    public void vizualizar(){
        vizualisacoes++;
    }

    public void curtir(){
        curtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuraçãoEmSegundos() {
        return duraçãoEmSegundos;
    }

    public void setDuraçãoEmSegundos(int duraçãoEmSegundos) {
        this.duraçãoEmSegundos = duraçãoEmSegundos;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getVizualisacoes() {
        return vizualisacoes;
    }

    public void setVizualisacoes(int vizualisacoes) {
        this.vizualisacoes = vizualisacoes;
    }

    public double getClassificacao() {
        return (curtidas/(double)vizualisacoes) * 5;
    }
}
