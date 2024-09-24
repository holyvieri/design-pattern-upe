package factory;

public class Main {
    public static void main(String[] args) {
        /*factory.Livro ebook = new factory.Ebook("A quarta asa");
        factory.Livro fisico = new factory.Fisico("Of Poseidon");

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
