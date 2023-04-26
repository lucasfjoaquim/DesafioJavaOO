package br.com.lucas.DesafioJavaOO.modelos;

public class Podcast extends Audio {
    private int episodio;
    private String host;
    private String coHost;
    private String convidado;

    @Override
    public void fichaTecnica(){
        super.fichaTecnica();
        System.out.println("Episodio: " + getEpisodio());
        System.out.println("Host: " + getHost());
        if (getCoHost() != "solo"){
            System.out.println("co-Host: " + getHost());
        }
        if (getCoHost() != "nenhum"){
            System.out.println("Convidado: " + getConvidado());
        }
        System.out.println("Duração em minutos: " + getDuraçãoEmSegundos() / 60);
        System.out.println("=====================================================================");

    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getCoHost() {
        return coHost;
    }

    public void setCoHost(String coHost) {
        this.coHost = coHost;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }
}
