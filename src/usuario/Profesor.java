package usuario;

public class Profesor extends Usuario{
    private static final int CANT_PRESTAMO = 5;
    private static final int CANT_DIAS = 14;
    private String legajo;

    public Profesor(String nombre, String correo, String legajo) {
        super(nombre, correo);
        this.legajo = legajo;
    }

    public String getLegajo() {
        return legajo;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "legajo='" + legajo + '\'' +
                '}';
    }
}
