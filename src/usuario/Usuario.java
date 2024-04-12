package usuario;

public abstract class Usuario {
    private static int nextID = 0;
    private String nombre;
    private String correo;
    private final int id;

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.id = nextID++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", id=" + id +
                '}';
    }
}
