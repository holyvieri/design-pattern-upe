public abstract class CriadorDeLivros {
    /*public Livro criarLivro(String tipo, String titulo){
        return switch (tipo.toLowerCase()) {
            case "ebook" -> new Ebook(titulo);
            case "fisico" -> new Fisico(titulo);
            default -> throw new IllegalArgumentException("Tipo de livro inválido.");
        };
    }*/

    //refatorando:

    public abstract Livro criarLivro(String titulo);
}