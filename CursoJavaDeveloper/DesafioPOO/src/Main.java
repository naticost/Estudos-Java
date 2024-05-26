public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        iphone.tocar();
        iphone.selecionarMusica("Música 1");
        iphone.pausar();

        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
