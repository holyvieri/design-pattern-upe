public class Client {
    public static void main(String[] args) {

        ContextBatom contexto = new ContextBatom();

        //usar o batom normal
        contexto.setUsoBatom(new BatomNosLabios());
        contexto.aplicarBatom();

        //usar o batom como blush
        contexto.setUsoBatom(new BatomBlush());
        contexto.aplicarBatom();

        //usar o batom como sombra
        contexto.setUsoBatom(new BatomSombra());
        contexto.aplicarBatom();
    }
}
