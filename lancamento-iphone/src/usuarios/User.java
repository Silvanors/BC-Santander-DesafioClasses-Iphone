package usuarios;

import funcionalidades.iphone.Iphone;
import funcionalidades.ligacoes.Telefone;
import funcionalidades.musicas.ReprodutorMusical;
import funcionalidades.navegacaoInternet.Navegador;

public class User {
    public static void main(String[] args) {
        Iphone smartPhone = new Iphone();
        Telefone telefone = smartPhone;
        ReprodutorMusical reprodutorMusical = smartPhone;
        Navegador navegador = smartPhone;

        System.out.println("<<<--Funções de música-->>>"+"\n");
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocarMusica();
        reprodutorMusical.pausarMusica();
        System.out.println("\n");
        System.out.println("<<<--Funções de telefone-->>>"+"\n");
        telefone.atenderLigacao();
        telefone.realizarLigacao();
        telefone.iniciarCorreioVoz();
        System.out.println("\n");
        System.out.println("<<<--Funções de acesso à internet-->>>"+"\n");
        navegador.exibirPagina();
        navegador.atualizarPagina();
        navegador.adicionarNovaAba();
    }
}
