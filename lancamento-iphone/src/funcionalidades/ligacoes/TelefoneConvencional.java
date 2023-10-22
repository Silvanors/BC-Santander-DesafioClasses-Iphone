package funcionalidades.ligacoes;

public class TelefoneConvencional implements Telefone {


    public void realizarLigacao() {
        System.out.println("Realizando uma ligação!!!");
    }

    public void atenderLigacao() {
        System.out.println("Atendendo uma ligação!!!");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz!!!");
    }
}
