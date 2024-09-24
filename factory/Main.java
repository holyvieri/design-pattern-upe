public class Main {
    public static void main(String[] args) {
        /*Livro ebook = new Ebook("A quarta asa");
        Livro fisico = new Fisico("Of Poseidon");

        ebook.comprar();
        fisico.adicionarListaDesejo();*/

        // refatorando:

        CriadorDeLivros criadorEbook = new CriadorEbook();
        CriadorDeLivros criadorFisico = new CriadorFisico();

        Livro ebook = criadorEbook.criarLivro("A Quarta Asa");
        Livro fisico = criadorFisico.criarLivro("Of Poseidon");

        ebook.comprar();
        fisico.adicionarListaDesejo();
    }
}
