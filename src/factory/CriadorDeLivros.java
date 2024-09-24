package factory;

public abstract class CriadorDeLivros {
    /*public factory.Livro criarLivro(String tipo, String titulo){
        return switch (tipo.toLowerCase()) {
            case "ebook" -> new factory.Ebook(titulo);
            case "fisico" -> new factory.Fisico(titulo);
            default -> throw new IllegalArgumentException("Tipo de livro inválido.");
        };
    }*/

    //refatorando:

    public abstract Livro criarLivro(String titulo);
}