package materiales;

public class Dvd extends Materiales{

    public Dvd(estados estado, String nombre) {
        super(estado, nombre);
    }


    @Override
    public String toString() {
        return "Dvd{}";
    }
}
