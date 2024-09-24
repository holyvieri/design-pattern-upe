package factory;

public class Fisico implements Livro {
    private String titulo;

    public Fisico(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void comprar() {
        System.out.println("Comprando o livro físico: " + titulo);
    }

    @Override
    public void adicionarListaDesejo() {
        System.out.println("Adicionando livro físico "+titulo+" à lista de desejo.");

    }
}