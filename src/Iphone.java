public class Iphone implements ReprodutorDeMusica,AparelhoTelefonico,NavegadorNaInternet{

    @Override
    public void ligar(){
        System.out.println("Fazendo ligação");
    }

    @Override
    public void atender() {
        System.out.println("Recebendo chamada");
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio por voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página com url: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música selecionada");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música atual");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada e " + musica);
    }
}
