package materiales;

public class Revista extends Materiales implements prestable
{
    public Revista(estados estado, String nombre) {
        super(estado, nombre);
    }

    @Override
    public String toString() {
        return "Revista{}";
    }

}
