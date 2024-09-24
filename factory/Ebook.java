public class Ebook implements Livro{

    private String titulo;

    public Ebook(String titulo){
        this.titulo = titulo;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void comprar() {
        System.out.println("Comprando o ebook: "+ titulo);
    }

    @Override
    public void adicionarListaDesejo() {
        System.out.println("Adicionando ebook "+ titulo + " à lista de desejo.");

    }
}