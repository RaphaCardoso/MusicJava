package br.com.Musics.sistema;

public class Main {

    private static final String ARQUIVO_MUSICA = "src/main/java/Musics/Almost Barely - Letting Go.mp3";

    public static void main(String[] args) {
        ContinuosReprodution reprodution  = new ContinuosReprodution(ARQUIVO_MUSICA, false);
        reprodution.start();
        
        System.out.println("Rodou");
    }
}
 