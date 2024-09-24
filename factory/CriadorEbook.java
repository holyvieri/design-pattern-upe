public class CriadorEbook extends CriadorDeLivros{

    @Override
    public Livro criarLivro(String titulo){
        return new Ebook(titulo);
    }
}
