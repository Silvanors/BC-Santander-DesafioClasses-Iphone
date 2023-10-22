package funcionalidades.iphone;

import funcionalidades.ligacoes.Telefone;
import funcionalidades.musicas.ReprodutorMusical;
import funcionalidades.navegacaoInternet.Navegador;

public class Iphone implements Telefone, ReprodutorMusical, Navegador {


    public void selecionarMusica() {
        System.out.println("Iphone selecionando a música para tocar no app!!!");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Iphone tocando a música selecionada no app!!!");

    }

    @Override
    public void pausarMusica() {
        System.out.println("Iphone pausando a música tocando no app!!!");
    }

    @Override
    public void realizarLigacao() {
        System.out.println("Iphone iniciando uma ligação pelo app de chamadas!!!");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Iphone atendendo uma ligação pelo app de chamadas!!!");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iphone iniciando o correio de voz pelo app de chamadas!!!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Iphone exibindo página pelo navegador do smartphone!!!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Iphone abrindo nova aba pelo navegador do smartphone!!!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Iphone atualizando a página do navegador pelo smartphone!!!");
    }
}
