package br.com.lucas.DesafioJavaOO.modelos;

public class Musica extends Audio{
    private String genero;
    private String artista;
    private String feature;

    @Override
    public void fichaTecnica(){
        super.fichaTecnica();
        System.out.println("Genero da musica: " + getGenero());
        System.out.println("Artista autor: " + getArtista());
        if (getFeature() != "solo"){
            System.out.println("Artista Feature: " + getFeature());
        }
        System.out.println("Duração em segundos: " + getDuraçãoEmSegundos());
        System.out.println("=====================================================================");

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
