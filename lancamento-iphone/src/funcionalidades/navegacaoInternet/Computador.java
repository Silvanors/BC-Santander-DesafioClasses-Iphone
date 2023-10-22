package funcionalidades.navegacaoInternet;

public class Computador implements Navegador {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da internet!!!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador!!!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador!!!");
            }
}
