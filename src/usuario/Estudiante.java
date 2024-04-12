package usuario;

public class Estudiante extends Usuario{
    private static final int CANT_PRESTAMO = 3;
    private static final int CANT_DIAS = 7;

    private String matricula;

    public Estudiante(String nombre, String correo, String matricula) {
        super(nombre, correo);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "matricula='" + matricula + '\'' +
                '}';
    }
}
