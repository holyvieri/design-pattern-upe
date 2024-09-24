package factory;

public class CriadorFisico  extends CriadorDeLivros{
    @Override
    public Livro criarLivro(String titulo) {
        return new Fisico(titulo);
    }
}
