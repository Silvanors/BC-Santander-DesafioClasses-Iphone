package funcionalidades.musicas;

import funcionalidades.musicas.ReprodutorMusical;

public class Mp4 implements ReprodutorMusical {

    public void selecionarMusica() {
        System.out.println("Selecionando a música!!!");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando a música escolhida!!!");

    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a música que toca!!!");

    }
}
