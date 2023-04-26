import br.com.lucas.DesafioJavaOO.modelos.Musica;
import br.com.lucas.DesafioJavaOO.modelos.Podcast;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Musica audio1 = new Musica();
        audio1.setCurtidas(100);
        audio1.setTitulo("Maquina do tempo");
        audio1.setVizualisacoes(100);
        audio1.setDuraçãoEmSegundos(180);
        audio1.setArtista("Matue");
        audio1.setFeature("solo");
        audio1.setGenero("Trap");
        audio1.fichaTecnica();

        Podcast audio2 = new Podcast();
        audio2.setCurtidas(870);
        audio2.setTitulo("Joe Rougan Experience");
        audio2.setVizualisacoes(1000);
        audio2.setDuraçãoEmSegundos(3600);
        audio2.setEpisodio(103);
        audio2.setHost("Joe Rougan");
        audio2.setCoHost("solo");
        audio2.setConvidado("Lucas Fernandes Joaquim");
        audio2.fichaTecnica();

    }
}