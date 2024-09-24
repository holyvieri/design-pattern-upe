public class ContextBatom {

    // vai referenciar a estrategia
    private UsoBatom usoBatom;

    // setter p modificar a estrategia
    public void setUsoBatom(UsoBatom usoBatom) {
        this.usoBatom = usoBatom;
    }

    // metodo para usar a estrategia
    public void aplicarBatom(){
        if (usoBatom !=null){
            usoBatom.aplicar();
        }else{
            System.out.println("Vai passar o batom como? Decida!");
        }
    }
}
